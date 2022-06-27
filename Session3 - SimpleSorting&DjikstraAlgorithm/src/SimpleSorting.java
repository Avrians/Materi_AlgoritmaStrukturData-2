public class SimpleSorting {
    public static void main(String[] args) {

        int[] angka = {5,6,1,0,2};
        int temp;
        for(int i = 1; i < angka.length;i++) {
            for (int j = i; j > 0;j--) {
                if (angka[j] < angka [j-1]) {
                    temp = angka[j];
                    angka[j] = angka[j-1];
                    angka[j-1] = temp;
                }
            }
        }
        for (int i= 0; i< angka.length;i++) {
            System.out.print(angka[i] + " ");
        }
    }
}
