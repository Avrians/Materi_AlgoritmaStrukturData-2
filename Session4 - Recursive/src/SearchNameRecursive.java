import java.util.Scanner;

public class SearchNameRecursive {
    static int index=0;
    static String status;
    static void FindName(String searchtext, String[] data) {
        try {
            if(index<data.length) {
                if (data[index].equalsIgnoreCase(searchtext)) {
                    status="Data Match";
                    System.out.println(searchtext+" is on position index = "+index+" of array "+ data[index]+" "+status);
                    System.exit(0);
                } else {
                    if (index < 6){
                        index++;
                        status = "Not Match";
                        System.out.println("Data you entered "+"'"+searchtext+"'"+" "+status);
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("Erornya dimana??");
        }

    }

    static String inputName() {
        try {
            String name;
            Scanner nameInput = new Scanner(System.in);
            System.out.print("Masukan Nama Yang Dicari = ");
            name = nameInput.nextLine();
            nameInput.close();
            return name;
        } catch (Exception e) {

        }
        return null;
    }

    public static void main(String[] args) {
        String[] people = {"Rudi", "Agus", "Putri", "Ika", "Rizki", "Summacher"};
        String nameSearch = inputName();
        FindName(nameSearch,people);
    }
}
