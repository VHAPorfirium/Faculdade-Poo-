package Exercicio1;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class atividade1Exemplo2 {
    public static void main(String[] args) {

        Atividade1_Aluno atividade1Aluno1 = new Atividade1_Aluno("Paulo",111,8.0,6.0,5.0);
        Atividade1_Aluno atividade1Aluno2 = new Atividade1_Aluno("Maria",222,4.0,6.0,3.0);
        Atividade1_Aluno atividade1Aluno3 = new Atividade1_Aluno("José",333,6.0,4.0,9.0);
        Atividade1_Aluno atividade1Aluno4 = new Atividade1_Aluno("Patrícia",444,7.0,8.0,9.0);

        DecimalFormat df = new DecimalFormat("#.00");

        JOptionPane.showMessageDialog(null, "Média do Aluno " + atividade1Aluno1 + " = " + df.format(atividade1Aluno1.calculaMedia()) + atividade1Aluno1.conceito());

        JOptionPane.showMessageDialog(null, "Média do Aluno " + atividade1Aluno2 + " = " + df.format(atividade1Aluno2.calculaMedia()) + atividade1Aluno2.conceito());

        JOptionPane.showMessageDialog(null, "Média do Aluno " + atividade1Aluno3 + " = " + df.format(atividade1Aluno3.calculaMedia()) + atividade1Aluno3.conceito());

        JOptionPane.showMessageDialog(null, "Média do Aluno " + atividade1Aluno4 + " = " + df.format(atividade1Aluno4.calculaMedia()) + atividade1Aluno4.conceito());

        JOptionPane.showMessageDialog(null,"Média Geral = " + df.format((atividade1Aluno1.calculaMedia() + atividade1Aluno2.calculaMedia() + atividade1Aluno3.calculaMedia() + atividade1Aluno4.calculaMedia())/4 ));

    }
}
