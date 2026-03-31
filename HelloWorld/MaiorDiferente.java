import java.util.Scanner;
//Ler 2 números e dizer: o primeiro é igual
//os dois são iguais
//o segundo é maior
public class MaiorDiferente{
    public static void main (String[] args){
     Scanner scanner = new Scanner(System.in);
        System.out.print ("digite o primero numero" );
        double numero;
        numero = scanner.nextDouble(); 
        System.out.print ("digite o segundo numero" );
        double segundoNumero;
        segundoNumero = scanner.nextDouble();
        if (numero == segundoNumero){
        System.out.println ("numero iguais");
        }
        else if (numero > segundoNumero){
            System.out.println(numero + " maior que "  + segundoNumero);
                }
        else {
            System.out.println(segundoNumero + " maior que" + numero);
        }
        scanner.close();
    }
}