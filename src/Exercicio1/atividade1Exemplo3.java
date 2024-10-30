package Exercicio1;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class atividade1Exemplo3 {
    public static void main(String[] args) {

        String conceito = "";

        Atividade1_Aluno atividade1Alunos[] = new Atividade1_Aluno[4];
        atividade1Alunos[0] = new Atividade1_Aluno("Paulo",111,8.0,6.0,5.0);
        atividade1Alunos[1] = new Atividade1_Aluno("Maria",222,4.0,6.0,3.0);
        atividade1Alunos[2] = new Atividade1_Aluno("José",333,6.0,4.0,9.0);
        atividade1Alunos[3] = new Atividade1_Aluno("Patrícia",444,7.0,8.0,9.0);

        DecimalFormat df = new DecimalFormat("#.00");

        double total = 0;
        for (int i=0; i<=3;i++) {
            JOptionPane.showMessageDialog(null, "Média do Aluno " + atividade1Alunos[i] + "= " + df.format(atividade1Alunos[i].calculaMedia()) + atividade1Alunos[i].conceito());
            total = total + atividade1Alunos[i].calculaMedia();

        }
        JOptionPane.showMessageDialog(null,"Média Geral = " + df.format(total/4));
    }
}
