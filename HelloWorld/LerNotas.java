import java.util.Scanner;
// Ler 3 notas de avaliação, calcualr e exibir a média:
//Exibir o status do aluno:
//média >= 7.0 : aprovado
// 3.0 <= media < 7.0: exame
//media < 3.0 : reprovado
 public class LerNotas{
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print ("ler a primeira nota");
    double nota1 = scanner.nextDouble();
     System.out.print("ler a segunda nota");
    double nota2 = scanner.nextDouble();
     System.out.print("ler a terceira nota");
    double nota3 = scanner.nextDouble();
    double media = (nota1 + nota2 + nota3);
    System.out.println ("media = " + media);

    if (nota1 >= 7.0 ) {
    System.out.println ("aprovado");
     }
    else if (media >= 3.0  ){
    System.out.println ("exame");
     }
     else {
        System.out.println ("reprovado");
        
        }
     scanner.close();

    }
 }