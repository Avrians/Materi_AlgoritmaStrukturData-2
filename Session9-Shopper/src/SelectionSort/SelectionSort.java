package SelectionSort;

public class SelectionSort {

    private String[] array;
    public SelectionSort() {}
    public String[] getData()
    {
        return array;
    }

    public void setData(String[] arr)
    {
        this.array = arr;
    }

    public void pengurutanData()
    {
        String small;
        int n = this.array.length;
        for (int a = 0; a < n-1;a++)
        {
            int index = a;
            for(int b = a+1; b < n;b++)
            {
                if(this.array[b].compareTo(this.array[index]) < 0)
                {
                    small = this.array[b];
                    String temp = this.array[b];
                    this.array[b] = this.array[a];
                    this.array[a] = temp;
                }
            }
        }
    }

    public void cetakData()
    {
        System.out.println("Pengurutan Data : ");
        for (int i = 0; i < this.array.length; i++)
        {
            System.out.print(this.array[i]+",");
        }
    }

    public static void main(String[] args)
    {
        String[] namaAcak = {"shinta", "jevri", "olif", "surya", "dani", "winda"};

        System.out.println("Data asli :");

        for (int i = 0; i<namaAcak.length;i++) {
            System.out.print(namaAcak[i]+ ",");
        }
        System.out.println("");
        
        SelectionSort seleksi = new SelectionSort();
        seleksi.setData(namaAcak);
        seleksi.pengurutanData();
        seleksi.cetakData();
    }
}

