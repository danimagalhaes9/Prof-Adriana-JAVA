import java.util.Scanner;
// Ler um inteiro e dizer se ele é par ou impar
public class ParOuImpar{
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print ("ler um inteiro");
        double numero;
        numero = scanner.nextDouble();
        if(numero %2 ==0){
             System.out.println (numero + "par");

        }
        else {
             System.out.println (numero + " impar ");
         }
        scanner.close();


    }
}