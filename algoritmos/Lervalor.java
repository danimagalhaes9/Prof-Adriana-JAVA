import java.util.Scanner;
public class LerValor{
public static void main (String[]args){
Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double valor = scanner.NextDouble();

        double dezPorCento = valor * 0.10;

        System.out.println("10% do valor é: " + dezPorCento);

        scaneer.close();

}




}


    