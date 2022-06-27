import java.util.Scanner;

public class inputKtp {
    
    private static void inputNama() {
        Scanner input = new Scanner(System.in);
        String namaKtp[] = new String[3];

        int counter = 1;
        for (int i = 0; i < namaKtp.length;i++) {
            System.out.print("Masukan nama KTP orang ke "+counter+" : ");
            namaKtp[i] = input.next();
            counter++;
        }

        System.out.println("\nNama-nama mahasiswa yang dimasukan :");
        
    }

    public static void main(String[] args) {
        inputNama();
    }
}
