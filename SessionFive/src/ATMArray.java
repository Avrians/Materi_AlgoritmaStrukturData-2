import java.util.ArrayList;
import java.util.Scanner;

public class ATMArray {

    public static void main(String[] args) {
        ArrayList<KartuATM> daftarKartuATM = new ArrayList<KartuATM>();
        for (int index = 0; index<3;index++) {
            KartuATM atmku = new KartuATM();

            Scanner inputDetail = new Scanner(System.in);

            System.out.print("Masukan No ATM : ");
            atmku.nomer = inputDetail.nextLine();

            System.out.print("Masukan No Rekening : ");
            atmku.norek = inputDetail.nextLine();

            System.out.print("Masukan Nama : ");
            atmku.nama = inputDetail.nextLine();

            System.out.print("Masukan Bank : ");
            atmku.nama_bank = inputDetail.nextLine();

            daftarKartuATM.add(atmku);
        }

        for(int i = 0;i<daftarKartuATM.size();i++) {
            String nomorKartu = daftarKartuATM.get(i).nomer;
            String nomorRek = daftarKartuATM.get(i).norek;
            String nama = daftarKartuATM.get(i).nama;
            String namaBank = daftarKartuATM.get(i).nama_bank;
            System.out.println("Kartu yang ke "+ i+1);
            System.out.println("Nama Bank : "+ namaBank);
            System.out.println("Nomor Kartu : "+ nomorKartu);
            System.out.println("Nomor Rekening : "+ nomorRek);
            System.out.println("Nama Pemilik : "+ nama);
            System.out.println();





        }
        
    }
    
}
