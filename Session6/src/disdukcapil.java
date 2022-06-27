public class disdukcapil {
    
    // Modelnya menggunakan KTP2
    public static void main(String[] args) {
        KTP2 warga1 = new KTP2();
        warga1.no = "00100";
        warga1.namalengkap = "joko";
        warga1.alamat = "tegal";
        warga1.pob="tegal";
        warga1.dob = "amerika";
        warga1.pekerjaan = "Fulltime";
        warga1.status = "single";

        System.out.println("nama warga 1 adalah "+warga1.namalengkap);
        System.out.println("status :"+warga1.status);
        warga1.cetakStatus(warga1.status);

        KTP2 warga2 = new KTP2("2230", "James Bond", "Amerika", "17 Januari", "Amerika", "Tukang sapu", "married");
        System.out.println("nama warga 2 adalah "+warga2.namalengkap);
        System.out.println("status :"+warga2.status);
        warga2.cetakStatus(warga2.status);



    }
}
