import java.util.Scanner;

public class Exe05 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        
        int[] vetor = new int[5];
        
        
        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            vetor[i] = leitor.nextInt();
        }
        
        
        System.out.print("Digite um número n qualquer: ");
        int n = leitor.nextInt();
        
        
        int contador = 0;
        for (int i = 0; i < 5; i++) {
            if (vetor[i] == n) {
                contador++;
            }
        }
        
       
        System.out.println("O número " + n + " aparece " + contador + " vezes no vetor.");
        
        
    }
}
