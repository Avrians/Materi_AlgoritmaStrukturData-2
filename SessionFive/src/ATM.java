import java.util.Scanner;

public class ATM {

    public static void PrintTitle() {
        System.out.println("--------------------");
        System.out.println("    BANK HARBER     ");

    }
  
    public static void main(String[] args) {
        String nokar;
        String norek;
        String nama;
        String pin;

        nokar = "ABCDE";
        norek = "087687";
        nama = "donald";
        Scanner inputUser = new Scanner(System.in);
        PrintTitle();
        System.out.println("Masukan Kartu");
        System.out.print("Masukan PIN : ");
        pin = inputUser.nextLine();
        if (pin.equals("123456")) {
            KartuATM donald = new KartuATM(nokar, norek, nama);
            char pilihan = 0;
            do {
                PrintTitle();
                System.out.println();
                System.out.println("MENU");
                System.out.println("[1]. Depostit");
                System.out.println("[2]. WIthdraw");
                System.out.println("[0]. Exit");
                System.out.print("Pilihan anda : ");
                pilihan = inputUser.next().charAt(0);
                System.out.println();
                switch(pilihan) {
                    case '1' -> {
                        int jumlahdepo;
                        jumlahdepo = 100000;
                        int saldoakhirdepo = donald.Deposit(jumlahdepo);
                        System.out.println("Saldo Akhir : " + saldoakhirdepo);
                    }
                    case '2' -> {
                        int jumlahwd = 10000;
                        int saldoakhirwd = donald.withdraw(jumlahwd);
                        System.out.println("Saldo Akhir : " + saldoakhirwd);
                    }
                    default -> {

                    }
                }
            } while (pilihan!='0');
                
        }
    }
}
