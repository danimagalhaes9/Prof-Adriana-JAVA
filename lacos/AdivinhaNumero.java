//sortear um numero de 1 a 10 e pedir para o usuario acertar
import java.util.Scanner;
import java.util.Random;
public class AdivinhaNumero {
    public static void main (String [] args){

    Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int sorteado = random.nextInt(10) +1;
        int chute;
        int contador = 0;
        do {    
            System.out.print ("adivinhe o numero de 1 a 10: ");
            chute = scanner.nextInt();
            if (chute > sorteado) {
                System.out.println ("e mais baixo");
            }
            else if (chute < sorteado) {
                System.out.println ("e mais alto");
            }
            contador++;

        } while (chute!= sorteado && contador < 3);
        if (chute == sorteado){
            System.out.println ("Parabens!!!");
        }
        else {
            System.out.println ("Nao foi desta vez, era " + sorteado );
        }
    
        scanner.close();
    }
}
