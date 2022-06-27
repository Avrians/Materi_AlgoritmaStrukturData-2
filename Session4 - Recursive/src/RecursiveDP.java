public class RecursiveDP {
    public static void main(String[] args) {
        // fibonacci n=5 1,1,2,3,5,8
        int first =1;
        int second=1;
        int n=5;
        int fibo=0;
        int last=0;
        int current=0;

        if(n==1 || n==2) {
            fibo=1;
        }else{
            for(int i=1;i<=n;i++) {
                if (i==1 || i ==2) {
                    fibo = 1;
                    last = first;
                    current = second;
                } else {
                    // lass = current;
                    fibo = last + current;
                    last = current;
                    current=fibo;
                }
            }
        }
        System.out.println(fibo);
    }
}