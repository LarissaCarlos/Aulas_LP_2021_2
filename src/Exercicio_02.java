import javax.swing.*;

public class Exercicio_02 {
    public static void main(String[] args) {
        double percentualItbi;
        double valorVenal;
        double valorTransacao;
        double impostoPago;
        String dado;
        dado = JOptionPane.showInputDialog("Digite o valor da transação");
        valorTransacao = Double.parseDouble(dado);
        dado = JOptionPane.showInputDialog("Digite o valor da venal");
        valorVenal = Double.parseDouble(dado);
        dado = JOptionPane.showInputDialog("Digite a porcentagem do imposto");
        percentualItbi= Double.parseDouble(dado);
        if (valorTransacao > valorVenal){
            impostoPago = valorTransacao*percentualItbi/100;
        }else{
            impostoPago = valorVenal*percentualItbi/100;
        }
        JOptionPane.showInputDialog(null,"Imposto a ser pago"+impostoPago);



    }
}
