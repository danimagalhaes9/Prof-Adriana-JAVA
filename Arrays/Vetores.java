import java.util.Scanner;
//ler o tamanho da lista, instanciar um vetor, pedir para o usuário digitar 
//os valores e exibir na ordem inversa

import java.util.Scanner;

public class Vetores{
    public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);
        System.out.println("digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        int [] v = new int [tamanho];
        for (int i=0; i<tamanho; i++)  {
            System.out.println("digite o " + (i+1) + "\u00B0 valor");
            v[i] = scanner.nextInt();
           
        }
        System.out.println("\nVetor invertido: ");
        for ( int i = v.length-1; i >=0; i--){

            System.out.print(v[i] + " ");
        }
        scanner.close();
    }
}