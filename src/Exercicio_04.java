import javax.swing.*;
import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        final int IDADE_M_APOSENTAR = 65;
        final int IDADE_F_APOSENTAR = 60;
        final int IDADE_F_CONTRIBU = 30;
        final int IDADE_M_CONTRIBU = 35;
        Scanner tc = new Scanner(System.in);
        int idade, TC;
        String genero;

        System.out.println("Digite sua idade: ");
        idade = tc.nextInt();
        System.out.println("Digite o tempo de Contribuição: ");
        TC = tc.nextInt();
        System.out.println("Digite seu genero");
        genero = tc.next();

        if (idade >= IDADE_M_APOSENTAR) {
            System.out.println("Você já pode fazer uma ATC!");
        } else {
            if (TC >= IDADE_M_CONTRIBU) {
                System.out.print("Você já pode fazer uma ATC!00");
            } else {
                if (idade >= IDADE_F_APOSENTAR) {
                    System.out.println("Você já pode fazer uma ATC!");
                } else {
                    if (TC >= IDADE_F_CONTRIBU) {
                        System.out.print("Você já pode fazer uma ATC!00");
                    }
                }


            }
        }
    }
}

