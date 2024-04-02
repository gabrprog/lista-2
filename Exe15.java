import java.util.Scanner;

public class Exe15 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        int[] vetor = new int[5];
        
        System.out.println("Digite 5 números:");
        vetor[0] = leitor.nextInt();
        
        int anterior = vetor[0];
        for (int i = 1; i < 5; i++) {
            int numero = leitor.nextInt();
            if (numero > anterior) {
                vetor[i] = numero;
                anterior = numero;
            } else {
                System.out.println("O número digitado não é maior que o anterior. Digite novamente:");
                i--;
            }
        }
        
        System.out.println("O vetor preenchido de acordo com as regras é:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        
        
    }
}
