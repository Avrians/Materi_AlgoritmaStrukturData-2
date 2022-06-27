import java.util.Scanner;
public class Latihan {
    public static void main(String[] args){
        int b=3;int k=3;
        System.out.println("Input Matrix = ");
        int[][] matrixA=new int[b][k];
        for(int i=0;i<b;i++){
            for(int j=0;j<k;j++){
                matrixA[i][j]=input();
            }
        }
        for(int i=0;i<b;i++){
            for(int j=0;j<k;j++){
                System.out.print(matrixA[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int input(){
        Scanner a=new Scanner(System.in);
        int b=a.nextInt();
        return b;
    }
}