import java.util.Scanner;

public class IdadeNadador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("categoria adulta");
        }

        scanner.close();
    }
}