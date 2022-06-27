package InsertionSort;

public class InsertionSortLatihan {
    private String[] data;

    public void setData(String[] data) {this.data = data;}

    public void InsertionSort() {
        int size = this.data.length;

        for(int step = 1; step < size; step++) {
            String key = this.data[step];
            int j = step - 1;

            // while( 0  < this.data[j].compareTo(this.data[j]) )
            while( 0  < this.data[j].compareTo(this.data[j]) ) {
                this.data[j + 1] = this.data[j];
                --j;
            }

            this.data[j + 1] = key;
        }
    }

    public void PrintSortedData() {
        for(String datum : this.data) {
            System.out.print(datum + ",");
        }
    }

    public static void main(String[] args) {
        //int[] age = {12,7,2,1,0,67,78,95};
        String[] nama = {"Windy","Budi", "sUsI", "aGuS","beNI"};
        // String[] nama = {"Windy","Budi", "Susi", "Agus","Beni"};
        InsertionSortLatihan _pleaseSort = new InsertionSortLatihan();
        _pleaseSort.setData(nama);
        _pleaseSort.InsertionSort();
        _pleaseSort.PrintSortedData();
    }
}
