import java.util.ArrayList;
import java.util.Scanner;

import model.modelIG;

public class Instagram{
    public static  void main(String[] args) {

        modelIG[] post = new modelIG[3];
        post[0] = new modelIG();
        post[0].profile = "(>-<)";
        post[0].Username = "@arduino.cc";
        post[0].postingan = "foto 1";
        post[0].Caption="Sayembara Membuat Poster :)";
        post[0].like =0;
        post[0].printpost();

        ArrayList Isikomen = new ArrayList<>();
        post[0].komentar= Isikomen;
        post[0].IsiKomentar("");



        post[1] = new modelIG();
        post[1].profile = "(_))";
        post[1].Username = "@KresnaH";
        post[1].postingan = "foto 2";
        post[1].Caption="Ujian Tengah Semester";
        post[1].like =0;
        post[1].printpost();

        ArrayList Isikomen2 = new ArrayList<>();
        post[1].komentar= Isikomen2;
        post[1].IsiKomentar("");

        /*post[2] = new modelIG();
        post[2].profile = "(*_*)";
        post[2].Username = "@Avrians";
        post[2].postingan = "foto 3";
        post[2].Caption="Jalan -jalan bersama Ayank :*";
        post[2].like =0;
        post[2].printpost();

        ArrayList Isikomen3 = new ArrayList<>();
        post[2].komentar= Isikomen3;
        post[2].IsiKomentar("");*/

        System.out.println("INSTAGRAM");
        System.out.println("----------------------------------");
        System.out.println("\nPostingan 1");
        post[0].postKonten();

        System.out.println("\nPostingan 2");
        post[1].postKonten();

        // System.out.println("\nPostingan 3");
        // post[2].postKonten();



        Scanner inputdata = new Scanner(System.in);
        char pilihPost = 0;
        do {
            System.out.println("Pilih Postingan (1, 2, 3): ");
            pilihPost = inputdata.next().charAt(0);
            switch (pilihPost) {
                case '1' ->{
                    post[0].postingan();
                    char pilihperintah = 0;
                    do{
                        System.out.println("Menu Utama ");
                        System.out.println("1. Like Postingan ");
                        System.out.println("2. Tambahkan Komentar");
                        System.out.println("3. Share to ");
                        System.out.println("4. Postingan disimpan");
                        System.out.println("5. All Coments");
                        System.out.println("6. Exit");
                        System.out.println("Pilih perintah : ");
                        pilihperintah = inputdata.next().charAt(0);
                        switch (pilihperintah){
                            case '1' -> {
                                post[0].LikePostingan(1);
                                post[0].postingan();
                            }

                            case '2'->{
                                System.out.println("Tambahkan Komentar : ");
                                Scanner inputkomen = new Scanner(System.in);
                                String komentar = inputkomen.nextLine();
                                post[0].IsiKomentar(komentar);
                                post[0].postingan();
                            }
                            case '3'->{
                                System.out.println("Share to : ");
                                Scanner inputteman = new Scanner(System.in);
                                String namaTeman = inputteman.nextLine();

                                System.out.println("Dikirim ke: "+namaTeman);

                            }
                            case '4' ->{
                                System.out.println("Postingan disimpan");
                            }
                            case '5'->{
                                System.out.println("All Comments: ");
                                post[0].ShowComment();
                            }
                            case '6'->{
                                System.exit(3);
                            }
                            default ->{

                            }
                        }
                    }while (pilihperintah !='0');
                }
                case '2' ->{
                    post[1].postingan();
                    char pilihperintah = 0;
                    do{
                        System.out.println("Menu Utama ");
                        System.out.println("1. LikePostingan ");
                        System.out.println("2. Tambahkan Komentar");
                        System.out.println("3. Share to ");
                        System.out.println("4. Postingan disimpan");
                        System.out.println("5. All Coments");
                        System.out.println("6. Exit");
                        System.out.println("Pilih perintah ");
                        pilihperintah = inputdata.next().charAt(0);
                        switch (pilihperintah){
                            case '1' -> {
                                post[1].LikePostingan(1);
                                post[1].postingan();
                            }

                            case '2'->{
                                System.out.println("Tambahkan Komentar : ");
                                Scanner inputkomen = new Scanner(System.in);
                                String komentar = inputkomen.nextLine();
                                post[1].IsiKomentar(komentar);
                                post[1].postingan();
                            }
                            case '3'->{
                                System.out.println("Share to : ");
                                Scanner inputteman = new Scanner(System.in);
                                String namaTeman = inputteman.nextLine();

                                System.out.println("Dikirim ke: "+namaTeman);

                            }
                            case '4' ->{
                                System.out.println("Postingan disimpan");
                            }
                            case '5'->{
                                System.out.println("All Comments: ");
                                post[1].ShowComment();
                            }case '6'->{
                                System.exit(3);
                            }
                            default ->{

                            }
                        }
                    }while (pilihperintah !='0');
                }
                case '3' ->{
                    post[2].postingan();
                    char pilihperintah = 0;
                    do{
                        System.out.println("Menu Utama ");
                        System.out.println("1. LikePostingan ");
                        System.out.println("2. Tambahkan Komentar");
                        System.out.println("3. Share to ");
                        System.out.println("4. Postingan disimpan");
                        System.out.println("5. All Coments");
                        System.out.println("6. Exit");
                        System.out.println("Pilih perintah : ");
                        pilihperintah = inputdata.next().charAt(0);
                        switch (pilihperintah){
                            case '1' -> {
                                post[2].LikePostingan(1);
                                post[2].postingan();
                            }

                            case '2'->{
                                System.out.println("Tambahkan Komentar : ");
                                Scanner inputkomen = new Scanner(System.in);
                                String komentar = inputkomen.nextLine();
                                post[2].IsiKomentar(komentar);
                                post[2].postingan();
                            }
                            case '3'->{
                                System.out.println("Share to : ");
                                Scanner inputteman = new Scanner(System.in);
                                String namaTeman = inputteman.nextLine();

                                System.out.println("Dikirim ke: "+namaTeman);

                            }
                            case '4' ->{
                                System.out.println("Postingan disimpan");
                            }
                            case '5'->{
                                System.out.println("All Comments: ");
                                post[2].ShowComment();

                            }case '6'->{
                                System.exit(3);
                            }
                            default ->{
                            }
                        }
                    }while (pilihperintah !='0');

                }
                case '4' ->{
                    System.exit(3);
                }
            }
        }while (pilihPost != '0');






    }



}
