// ler o valor da compra e a opção de pagamento (1 - vista 2/2 - prazo )
//se for a vista, ler forma de pagamento (1 - pix/2 - débito)
//no pix, dar 10% de desconto, no débito, 5%
//se for a prazo, ler número de parcelas (2/3)
//para 2 parcelas, não tem acréscimo, para 3, 10%
//em todos os casos, exibir todos os valores
import java.util.Scanner;
public class Shopping {

    public static void main (String[] args){
            double valorCompra;
            int opcaoPagamento;
            Scanner scanner = new Scanner(System.in);
            System.out.print ("digite o valor da compra: ");
            valorCompra = scanner.nextDouble();
            System.out.print ("digite:\n1 - a vista\n2 - a prazo\n-- > ");
            opcaoPagamento = scanner.nextInt();
            if (opcaoPagamento ==1 ){ //pagamento a vista
                System.out.print("digite\n1 - pix\n2 - debito\n--> ");
                int formaPagamento = scanner.nextInt();
                if(formaPagamento == 1) { //pix 
                    double desconto = 10.0/100* valorCompra;
                    double valorFinal = valorCompra - desconto;
                    System.out.printf("Desconto = R$ %.2f\n", + desconto );
                    System.out.printf("Valor a pagar = R$ %.2f\n", valorFinal);
                     
                }
                else if (formaPagamento == 2) { //débito
                    double desconto = 5.0/100* valorCompra;
                    double valorFinal = valorCompra - desconto;
                    System.out.printf("Desconto = R$ %.2f\n", + desconto );
                    System.out.printf("Valor a pagar = R$ %.2f\n", valorFinal);
    
                }   
                else {
                    System.out.println ("Forma de pagamento invalida");
    
                }
             }
                else if (opcaoPagamento == 2){ // prazo
                System.out.println ("Escolha o numero de parcelas (2/3: ");
                int parcelas = scanner.nextInt();
                if (parcelas == 2) {
                    //double valorParcela = valorCompra / 2;
                    System.out.printf("Valor de cada parcela R$ %.2F\n", valorCompra / 2);
                    
    
                }
                else if (parcelas == 3 ) { 
                    double acrescimo = 10.0/100 * valorCompra;
                    double valorFinal = valorCompra + acrescimo;
                    double valorParcela = valorFinal / 3;
                    System.out.printf("Voce teve um acrestimo de R$ %.2f\n", acrescimo);
                    System.out.printf("Valor final da compra = R$ %.2f\n", valorFinal);
                    System.out.printf("Valor de cada parcela = R$ %,2f\n", valorParcela);

        
                }
                else {      
                System.out.println ("Numero de parcelas invalido");


                }
        

        }   
        else {
            System.out.println("opcao invalida");
        }
        scanner.close();





    }
}
