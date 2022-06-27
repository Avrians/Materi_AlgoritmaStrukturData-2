package InsertionSort;

public class InsertionSort {

    private int[] data;

    public void setData(int[] data) {this.data = data;}


    public void InsertionSort() {
        int size = this.data.length;

        for(int step = 1; step < size; step++) {
            int key = this.data[step];
            int j = step - 1;

            while(j >= 0 && key < this.data[j]) {
                this.data[j + 1] = this.data[j];
                --j;
            }

            this.data[j + 1] = key;
        }
    }

    public void PrintSortedData() {
        for(int datum : this.data) {
            System.out.print(datum + ",");
        }
    }

    public static void main(String[] args) {
        int[] age = {12,7,2,1,0,67,78,95};
        InsertionSort _pleaseSort = new InsertionSort();
        _pleaseSort.setData(age);
        _pleaseSort.InsertionSort();
        _pleaseSort.PrintSortedData();
    }
}
