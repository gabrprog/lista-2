import java.util.Scanner;

public class Exe02 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = leitor.nextInt();
        
        int[] vetor = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número da posição " + i + ": ");
            vetor[i] = leitor.nextInt();
        }
        
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número na posição " + i + ": " + vetor[i] + " - ");
            if (vetor[i] > 0) {
                System.out.println("Positivo");
            } else if (vetor[i] < 0) {
                System.out.println("Negativo");
            } else {
                System.out.println("Zero");
            }
        }
        
        
    }
}
