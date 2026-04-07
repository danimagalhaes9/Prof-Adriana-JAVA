
    import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada das notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        // Cálculo da média
        double media = (nota1 + nota2) / 2;

        System.out.println("Média: " + media);

        // Verificação usando apenas if
        if (media >= 6.0) {
            System.out.println("Aprovado");
        }

        if (media < 6.0) {
            System.out.println("Exame");
        }

        scanner.close();
    }
}
}
