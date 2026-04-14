//ler inteiros até que a soma deles atinga 1000 
//a) usando while,
//b) usando do-while
import java.util.Scanner;
public class Soma1000 {
    public static void main (String[] args){
        int numero, soma = 0;
        Scanner sc = new Scanner (System.in);
        // System.out.print ("digite seus numeros ate bater 1000: ");
        // numero = sc.nextInt();
        // soma = numero;
        // while (soma < 1000){
        //     System.out.print ("digite seus numeros ate bater 1000: ");
        //     numero = sc.nextInt();
        //     soma = soma + numero;
        soma = 0;
        do {
            System.out.print ("digite seus numero para bater 1000: ");
            numero = sc.nextInt();
            soma = soma + numero;
        } while ( soma < 1000);

        
        System.out.println("Voce atingiu " + soma);
        sc.close();
    }
}
