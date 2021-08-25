import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int n, i;

        System.out.println("Digite o numero de que deseja saber a tabuada: ");
        n = ler.nextInt();

        for(i = 0; i < 11; i++){
        System.out.println((n) + ("x") + (i) + (" = ") + (n*i));
        }
    }
}

