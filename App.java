package mega;

import java.util.Scanner;

// iniciar uma aposta
// add numer na aposta
// finalizar uma aposta
// ver jogos
// ver resultado
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros;
        numeros = new int[5];
        int opcao;

        // Jogo jogo;
        // Gerenciar gerenciamento;
        // Sorteio sortear;

        System.out.println("Iniciar uma aposta? sim: digite 1 / não= digite qualquer outro valor.");
        opcao = scan.nextInt();

        if (opcao==1) {
            System.out.println("Escolha 6 números de 1 a 60.");
            for (int i=0; i<numeros.length; i++) {
                numeros[5] = scan.nextInt();
                if ((numeros[i]<0 || numeros[i]>60) || numeros[i]==numeros[i]) {
                    System.out.println("Número invalido, tente novamente.");
                    i--;
                }
            }
            for (int i=0; i<numeros.length; i++) {
                System.out.println(numeros[i]);
            }
            

        } else {
            System.out.println("Aposta cancelada!");
        }


        scan.close();
    }
}
