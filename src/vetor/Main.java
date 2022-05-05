package vetor;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int soma=0, aux;
        int[] notas = new int[10];
        Scanner Scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println(" Digite as notas " + (i + 1));
            notas[i] = Scan.nextInt();
            soma = soma + notas[i];
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                if (notas[j] > notas[j + 1]) {
                    aux = notas[j];
                    notas[j] = notas[j + 1];
                    notas[j + 1] = aux;
                }

            }

        }
            System.out.println(" A média é " + soma/10);
            System.out.println(" A maior nota foi " + notas[9]);
            System.out.println(" A segunda maior nota foi " + notas[8]);
            System.out.println(" A terceira maior nota foi " + notas[7]);
            System.out.println(" A menor nota foi " + notas[0]);
    }
}