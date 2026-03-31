// Ler um número, dizer se ele é positivo (>0) ou não
import java.util.Scanner;
public class PositivoOuNao{
    public static void main (String[] args){
        //declarar váriavel 
        double numero;
        Scanner scanner = new Scanner (System.in);
        //entrada de dados
        System.out.print ("digite um numero: ");
        numero = scanner.nextDouble();
        //estrutura de decisão
        if (numero > 0){
            System.out.println (numero + " e positivo ");
           
        }
        else {
            System.out.println (numero + " não e positivo");
        }
        scanner.close();
    }
    
}