import java.util.Scanner;
public class TesteEntradas {
    public static void main (String[] args) {
    // declarando e instanciando um objeto Scanner
     Scanner scanner = new Scanner(System.in);
    // exibe mensagem para o usuário
     System.out.print ("digite um inteiro: ");
    // declara um inteiro e faz a leitura
     int valorInteiro = scanner.nextInt();
    // exibe mensagem para o usuario
      System.out.print ("digite um valor com casas decimais: ");
    // declarando um double e faz a leitura
     double valorDecimal = scanner.nextDouble();
      System.out.print ("digite verdadeiro (true) ou (false)");    
     boolean eVerdade = scanner.nextBoolean();
     System.out.println ("veja os valores digitados: ");    
     System.out.println ("o inteiro: " + valorInteiro);
     System.out.println ("o decimal é " + valorDecimal);
     System.out.println ("o valor verdade " + eVerdade);



  
    // libera o recurso
    scanner.close();


  
    }

}