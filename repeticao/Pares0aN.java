// ler um inteiro n positivo, exibir os pares de 0 até n
import java.util.Scanner;
public class Pares0aN {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de pares: ");
        int n = scanner.nextInt();
        while (n <= 0) {
            System.out.print(" Quantidade deve ser positivo: ");
            n = scanner.nextInt();  
        }
        System.out.println("\nPares ate n:" );
        for (int i=0; i<=n; i= i+2) { 
            System.out.print(i + " ");
        }            
            scanner.close();

    }
}
