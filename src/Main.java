import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i,j,N;
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter the rows : ");
        N = sc.nextInt();

        for(i=0 ; i<N;  i++){
            for(j=0;j<2*N;j++){
                if(i+j==N-1||j-i==N-1 ){
                   System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
          System.out.println();
        }
        for (i = N - 2; i >= 0; i--) {
            for (j = 0; j < N * 5; j++) {
                if (i + j == N - 1 || j - i == N - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}