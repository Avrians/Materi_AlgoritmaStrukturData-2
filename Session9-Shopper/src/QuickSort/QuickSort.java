package QuickSort;

public class QuickSort {

    private int[] data;

    public void setData(int[] data) {
        this.data = data;
    }

    private int partition (int start, int end)
    {
        int pivot = this.data[end];
        int i = (start - 1 );
        for(int j = start; j <= end - 1; j++)
        {
            if (this.data[j] < pivot)
            {
                i++;
                int t = this.data[i];
                this.data[i] =  this.data[j];
                this.data[j] = t;
            }
        }
        int t = this.data[i+1];
        this.data[i+1] =  this.data[end];
        this.data[end] = t;
        return (i + 1);
    }

    public void quickSort(int start, int end)
    {
        if (start < end)
        {
            int p = partition (start, end);
            quickSort(start, p - 1);
            quickSort(p + 1, end);
        }
    }

    public void printArr (int n)
    {
        int i;
        for(i = 0; i < n;i++)
            System.out.print(this.data[i] + " " );
    }

    public static void main(String[] args) {
        //int[] dataArray = { 13,18,27,2,19,25 };
        int[] dataArray = { 10,56,78,2,53,78,82,0,9 };
        int n = dataArray.length;
        System.out.println("""
                Before sorting array element are -\s
                """);
        QuickSort _myQS = new QuickSort(); // quicksort adalh objek yang kemudian dbikin baru dengan nama myQs
        _myQS.setData(dataArray);
        _myQS.printArr(n); // objek yang memiliki method print arr dengan parameter n
        _myQS.quickSort(0, n - 1); // objek yang memiliki method quick sort dengan 2 parameter
        System.out.println("\nAfter sorting array element are - ");
        _myQS.printArr(n);
        System.out.println();

    }
}
