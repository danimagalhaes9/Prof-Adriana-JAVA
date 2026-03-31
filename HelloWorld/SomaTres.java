import java.util.Scanner;
public class SomaTres{
public static void main (String[] args){
Scanner scanner = new Scanner(System.in);
       System.out.print ("digite o primeiro numero: ");
       double primeiroNumero = scanner.nextDouble();
       System.out.print("digite o segundo numero: ");
       double segundoNumero = scanner.nextDouble();
       System.out.print("digite o terceiro numero: ");
       double terceiroNumero = scanner.nextDouble();
       double soma = primeiroNumero + segundoNumero;
       double multiplicacao = soma * terceiroNumero ;
       System.out.println("soma = " + soma);
       System.out.println("multiplicacao = " + multiplicacao);

       scanner.close();


       
} 



}