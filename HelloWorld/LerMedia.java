import java.util.Scanner;

public class LerMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("Média = " + media);

        if (media >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Exame");
        }

        scanner.close(); 
    }
}