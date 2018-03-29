import java.util.Scanner;

public class Somatriz {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int lincol, i=0, j=0, soma = 0;
        System.out.println("Digite o numero de linhas e colunas: ");
        lincol = get.nextInt();
        int valor[][] = new int[lincol][lincol];
        for (i = 0; i < lincol; i++) {
            for (j = 0; j < lincol; j++) {
                System.out.println("Digite o valor da linha " + (i + 1) + " e coluna " + (j + 1) + ":");
                valor[i][j] = get.nextInt();
            }
        }
        soma=calcularSoma(valor, lincol,soma);
        System.out.printf("A soma eh: %d", soma);
    }

    public static int calcularSoma(int valor[][], int lincol, int soma) {
       int i,j;
       for (i = 0; i < lincol; i++) {
            for (j = 0; j < lincol; j++) {
                if ((i+j + 2) == (lincol + 1)) {
            soma = soma + valor[i][j];
        }
        if (i == j) {
            soma = soma + valor[i][j];
        }
            }
        }
       
        return soma;
    }
}
