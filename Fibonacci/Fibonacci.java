import java.util.Scanner;
public class Fibonacci{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sequência de fibonacci: ");
        int tamanho = scanner.nextInt();
        int [] f = new int[tamanho];
        f[0] = 1;
        f[1] = 1;
        for (int pos=2; pos < f.length; pos++){
            f [pos] = f[pos-2] + f[pos-1];
        }
        System.out.println("Veja a sequência: ");
        for (int pos = 0; pos < f.length; pos++){
            System.out.println(f[pos]);
        }   
        scanner.close();
    }
}
