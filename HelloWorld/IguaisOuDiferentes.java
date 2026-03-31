//Ler 2 números e dizer se são iguais ou diferentes
import java.util.Scanner;

public class IguaisOuDiferentes{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print ("digite o primero numero" );
        double numero;
        numero = scanner.nextDouble(); 
        System.out.print ("digite o segundo numero" );
        double segundoNumero;
        segundoNumero = scanner.nextDouble();
        if (numero == segundoNumero){
        System.out.println (numero + " igual ");

        }
        else {
        System.out.println ("os numeros é diferente");

        }
        scanner.close();

    }

}