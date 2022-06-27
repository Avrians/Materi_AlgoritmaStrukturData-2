import java.util.Scanner;

public class Latihan2 {

    public static void main(String[] args) {

        System.out.println("Latihan membuat matriks 3x4");
        System.out.println("------------");

        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukan nilai: ");
        double n = inputUser.nextDouble();

        double[][] matrik2D =  new double[3][4];

        for (int baris=0; baris<3;baris++) {
            for (int kolom=0;kolom<4;kolom++) {
                System.out.print("Masukan nilai: ");
                matrik2D[baris][kolom] =inputUser.nextDouble();
            }
        }

        System.out.println("Matrik nya adalah");
        System.out.println("\n");
        for (int baris=0; baris<3;baris++) {
            for (int kolom=0;kolom<4;kolom++) {
                System.out.print(matrik2D[baris][kolom]+ " ");
            }
            System.out.println(" ");
        }
    }

}
