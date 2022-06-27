package main;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Response;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConsumeAPI {
    static List<Integer> totalCases = new ArrayList<>();
    public static void main(String[] args) {

        System.out.println("Sebelum Sorting");
        System.out.print(getResponse().stream().toList());
        sort(getResponse());

    }

    //mengambil data dari url
    public static List<Integer>  getResponse(){
        try{
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://vaccovid-coronavirus-vaccine-and-treatment-tracker.p.rapidapi.com/api/npm-covid-data/asia"))
                    .header("X-RapidAPI-Key", "24903deefcmshf2fe1aacddec7cbp1c634cjsn00e15bd03e77")
                    .header("X-RapidAPI-Host", "vaccovid-coronavirus-vaccine-and-treatment-tracker.p.rapidapi.com")
                    .method("GET", HttpRequest.BodyPublishers.noBody())
                    .build();
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            Type responseListType = new TypeToken<ArrayList<Response>>(){}.getType();
            ArrayList<Response> covidArray = gson.fromJson(response.body(), responseListType);

            for (Response i : covidArray){
                totalCases.add(i.getTotalCases());
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return totalCases;
    }

    //Source code Sorting
    public static void sort(List<Integer> list) {
        sort(list, 0, list.size() - 1);
        System.out.println("Setelah sorting");
        for (Integer i : list){
            System.out.print(i + ",");
        }
    }

    public static void sort(List<Integer> list, int from, int to) {
        if (from < to) {
            int pivot = from;
            int left = from + 1;
            int right = to;
            int pivotValue = list.get(pivot);
            while (left <= right) {
                // left <= to -> limit protection
                while (left <= to && pivotValue >= list.get(left)) {
                    left++;
                }
                // right > from -> limit protection
                while (right > from && pivotValue < list.get(right)) {
                    right--;
                }
                if (left < right) {
                    Collections.swap(list, left, right);
                }
            }
            Collections.swap(list, pivot, left - 1);
            sort(list, from, right - 1); // <-- pivot was wrong!
            sort(list, right + 1, to);   // <-- pivot was wrong!
        }
    }

}
