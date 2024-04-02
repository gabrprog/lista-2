import java.util.Scanner;

public class Exe08 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[10];
        
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            A[i] = leitor.nextInt();
        }
        
        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < 5; i++) {
            B[i] = leitor.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            C[i] = A[i];
            C[i + 5] = B[i];
        }
        
        System.out.println("O vetor C, resultante da concatenação de A e B, é:");
        for (int i = 0; i < 10; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println();
        
        
    }
}
