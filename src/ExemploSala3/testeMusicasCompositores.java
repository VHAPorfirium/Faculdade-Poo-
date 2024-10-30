package ExemploSala3;

import ExemploSala3.MusicasCompositores.Compositor;
import ExemploSala3.MusicasCompositores.Musica;

import java.util.Scanner;

public class testeMusicasCompositores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Compositor c1 = new Compositor("Caetano Veloso");
        c1.setNacionalidade("Brasileiro");
        Compositor c2 = new Compositor("cleba");
        c2.setNacionalidade("Brasileiro");


        Musica m1 = new Musica("Compositores tambem amam.");
        m1.setAno(2024);
        m1.setTipo("Rock");

        m1.adicionarCompositor(c1);
        m1.adicionarCompositor(c2);

        System.out.println(m1);
    }
}
