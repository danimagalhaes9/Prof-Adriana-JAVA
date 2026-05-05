import java.util.Scanner;
public class QuadradoN {

     public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite n: ");
        int n = sc.nextInt();
            for (int i = 1; i<= n; i++){
                for (int j = 1; j <= n; j++){
                    System.out.print("*");
            }
            System.out.println();
        }
            for (int linha = 1; linha<= n; linha++){
                for (int coluna = 1; coluna <= linha; coluna++) {
                    System.out.print("*");
            }
            System.out.println();
            }
            sc.close();
}     
}