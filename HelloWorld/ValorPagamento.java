import java.util.Scanner;
// Ler um valor de compra e uma opção de pagamento:
//1 a vista
//2 a prazo
//Se pagamento o prazo,calcular um acréstimo de 10%
//Em ambos os casos, mostrar o valor a pagar
public class ValorPagamento{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Digite o valor da compra: ");
        double compra = scanner.nextDouble();
        System.out.print ("digite:\n1 - a vista\n2 - a prazo\n-- >");
        int opcao = scanner.nextInt();
        if ( opcao ==2){
            compra = compra + 10.0 / 100 * compra;
        }
        System.out.println("Valor a pagar = RS " + compra);
        scanner.close();
        
       

    }
}