import java.util.Scanner;

public class Exe03 {
    public static void executar() {
        Scanner leitor= new Scanner(System.in);
        
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = leitor.nextInt();
        
        int[] vetorOriginal = new int[tamanho];
        int[] vetorDobro = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número da posição " + i + ": ");
            vetorOriginal[i] = leitor.nextInt();
        }
        
        for (int i = 0; i < tamanho; i++) {
            vetorDobro[i] = vetorOriginal[i] * 2;
        }
        
        System.out.println("Valores do vetor dobrado:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vetorDobro[i]);
        }
        
        
    }
}
