import java.util.Scanner;
public class Sucessor{
    public static void main (String[] args){
     Scanner scanner = new Scanner(System.in);
       System.out.print ("digite o primeiro numero: ");
       int numeroInteiro = scanner.nextInt();
       int sucessor = numeroInteiro + 1;
       int antecessor = numeroInteiro -1;
       System.out.println ("sucessor" + sucessor);
       System.out.println("antessor" + antecessor);
       scanner.close();


    }


}
