import java.util.Scanner;

public class Exe10 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        int[] A = new int[5];
        int[] B = new int[5];
        
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            A[i] = leitor.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            B[i] = A[4 - i];
        }
        
        System.out.println("O vetor B, com os elementos de A invertidos, é:");
        for (int i = 0; i < 5; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();
        
        
    }
}
