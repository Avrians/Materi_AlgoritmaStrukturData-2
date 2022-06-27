import java.util.Scanner;

public class Latihan1 {

    public static void main(String[] args) {

        System.out.println("Latihan membuat matriks");
        System.out.println("------------");

        int baris = 3;
        int kolom = 4;
        int[][] matrik2D =  new int[baris][kolom];

        for (int i=0; i<baris;i++) {
            for (int j=0;j<kolom;j++) {
                matrik2D[i][j] = input();
            }
        }

        for (int a=0; a<baris;a++) {
            for (int b=0;b<kolom;b++){
                System.out.print(matrik2D[a][b]+" ");
            }
            System.out.println(" ");
        }
    }
    private static int input() {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukan Nilai Matrik : ");
        int masukan = inputUser.nextInt();
        return masukan;
    }
}
