import java.util.Scanner;

public class Exe09 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];
        
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            A[i] = leitor.nextInt();
        }
        
        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < 5; i++) {
            B[i] = leitor.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                C[i] = A[i];
            } else {
                C[i] = B[i];
            }
        }
        
        System.out.println("O vetor C é:");
        for (int i = 0; i < 5; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println();
        
        
    }
}
