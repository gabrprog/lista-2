import java.util.Scanner;

public class Exe04 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        int[] vetor = new int[5];
        
        System.out.println("Digite os 5 números:");
        for (int i = 0; i < 5; i++) {
            vetor[i] = leitor.nextInt();
        }
        
        System.out.print("Digite um número qualquer (n): ");
        int n = leitor.nextInt();
        
        System.out.println("Índices dos elementos inferiores a " + n + ":");
        for (int i = 0; i < 5; i++) {
            if (vetor[i] < n) {
                System.out.println("Índice " + i);
            }
        }
        
       
    }
}
