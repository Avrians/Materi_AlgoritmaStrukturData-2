package belajar;
public class RecursiveDP {

    private static int fib_recur(int n) {
        int fibo = 0;
        if(n ==1 || n==2) {
            fibo=1;
        } else  {
            fibo = fib_recur(n-1) + fib_recur(n-2);
        }
        return fibo;
    }
    private static int fibMemoize(int n, int[] memoize) {
        if(memoize[n] != 0) {
            return memoize[0];
        }
        int fibo = fibMemoize(n-1, memoize) + fibMemoize(n-2, memoize);
        memoize[n] = fibo;
        return fibo;
    }

    private static int fib_dynamic(int n) {
        int[] fibDP = new int[n+1];
        fibDP[1] = 1;
        fibDP[2] = 1;
        if (n==1 || n==2) {
            return 1;
        }
        for(int i = 3;i<n+1;i++) {
            fibDP[i] = fibDP[i-1] + fibDP[i-2];
        }
        return fibDP[n];
    }



    public static void main(String[] args) {
        // fibonacci n=5 1,1,2,3,5,8
        int first =1;
        int second=1;
        // BigInteger second = BigInteger.ONE;
        // BigInteger second = BigInteger.valueOf(20)
        int n=6;
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
                    //lass = current;
                    fibo = last + current;
                    last = current;
                    current=fibo;
                }
            }
        }
        System.out.println(fibo);
        // calling recursive fibonnaci
        int s = fib_recur(5);
        System.out.println(s);

        // calling dynamic bottom up
            // dimulai dari bawah ke atas
            int a = fib_dynamic(5);
            System.out.println(a);

        // calling dynamic with memoize 
            // yang dimasukan itu array, jadi array di dalm array sehingga memperlama prsoes
        
            int fill = 3;
            int[] dpmemo = new int[fill+1];
            int resulMemo = fibMemoize(fill, dpmemo);
            System.out.println(resulMemo);

        

    }
    
}