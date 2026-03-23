import java.util.Scanner;
public class Distancia{
public static void main (String[] args){
Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a distancia em km: ");
    double km = scanner.nextDouble();

    double milhas = km / 1.61;

        System.out.println("Distancia em milhas: " + milhas);

        scanner.close();

}
}
    
       