import java.util.Scanner;

public class Media {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("digite a quantidade de valores: ");
        int n = sc.nextInt();
        // modo 1: sem vetor
        int soma = 0, cont = 1;
        for ( ; cont <=n; cont++ ){
            System.out.print("digite o " + cont + "\u00b0 valor: ");
            int valor = sc.nextInt();
            soma = soma + valor;

        }
        double media = (double) soma / n;
        System.out.printf("media = %.2f");
        //modo 2: com vetor
        int[] v = new int[n];
        for (cont= 0, soma=0; cont < n; cont++){
            System.out.print("digite o " + (cont+1) + "u\00B0 valor: ");
            v[cont] = sc.nextInt();
            soma+= v[cont];
        }
        media = (double) soma / n;
        System.out.println("znsua lista: ");
        for (int i=0; i<n; i++){
            System.out.print(v[i] + " ");
        }
        System.out.printf("\nmedia = %.2f\n", media);
        
        sc.close();
    }

    
}
