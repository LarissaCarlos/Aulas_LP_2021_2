import javax.swing.*;

public class exercicio_3 {
    public static void main(String[] args) {
        double np1,np2,nt3;
        double media;
        String dado;
        dado = JOptionPane.showInputDialog("Informe a nota da prova");
        np1 = Double.parseDouble(dado);
        dado = JOptionPane.showInputDialog("Informe a nota da prova 2");
        np2 = Double.parseDouble(dado);
        dado = JOptionPane.showInputDialog("Informe a nota do trabalho");
        nt3 = Double.parseDouble(dado);

        media=(np1+np2+nt3)/3;
        if (media>6){
            JOptionPane.showInputDialog(null,"APROVADO!" );
        } else {
            JOptionPane.showInputDialog(null, "REPROVADO!");
        }


    }
}
