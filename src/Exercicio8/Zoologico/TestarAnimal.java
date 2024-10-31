package Exercicio8.Zoologico;

public class TestarAnimal {
    public static void main(String[] args) {

        Mamifero camelo = new Mamifero("Camelo", 150f, 4, "Amarelo", "Terra", 2.0f, "Vegetais");

        Peixe tubarao = new Peixe("Tubarão", 300f, 0, "Cinzento", "Mar", 1.5f, "Barbatanas e cauda");

        Mamifero ursocanda = new Mamifero("Urso-do-canadá", 180f, 4, "Vermelho", "Terra", 0.5f, "Mel");

        camelo.dadosMamifero();

        tubarao.dadosPeixe();

        ursocanda.dadosMamifero();

    }
}
