import java.util.Scanner;

public class Exe14 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        int[] vetor = new int[5];
        
        System.out.println("Digite os 5 elementos do vetor:");
        for (int i = 0; i < 5; i++) {
            vetor[i] = leitor.nextInt();
        }
        
        int indiceMaior = 0;
        for (int i = 1; i < 5; i++) {
            if (vetor[i] > vetor[indiceMaior]) {
                indiceMaior = i;
            }
        }
        
        int temp = vetor[indiceMaior];
        vetor[indiceMaior] = vetor[4];
        vetor[4] = temp;
        
        System.out.println("O vetor atualizado é:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        
        
    }
}
