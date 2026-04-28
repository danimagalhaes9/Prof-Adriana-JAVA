//pedir ao usuario a quantidade de valores (n,deve ser positivo) , depois ler n números, somar e calcular 
// a média; e exibir todos os resultados
import java.util.Scanner;
public class SomaN{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        //leitura do valor n, com validação
        System.out.print("Digite a quantidade de valores: ");
        int n = scanner.nextInt();
        while (n <= 0) {
            System.out.print("valor deve ser positivo: ");
            n = scanner.nextInt();  
        } 
        //leitura e soma de n números => usar um contador 
        int soma = 0;
        for (int i=1; i<=n; i++) { 
            System.out.print("Digite o " + i + " o valor: " );
            int valor = scanner.nextInt();
            soma = soma + valor;
        }
        double media = (double)soma / n;
        System.out.printf("Soma = %d\nMedia = %.2f\n", soma, media); 
        scanner.close();

    }
}