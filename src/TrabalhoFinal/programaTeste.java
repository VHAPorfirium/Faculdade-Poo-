package TrabalhoFinal;

public class programaTeste {
    public static void main(String[] args) {

        //Filme 1
        SalaDeCinema salaDeCinema1 = new SalaDeCinema(1, "Cinemark", "Piso 03");

        Filmes filmes1 = new Filmes("Projeto X", 2012, "EUA", "Ingles", "Festa");

        Artista artista1 = new Artista("Thomas Mann", 16, "America do Norte");
        Artista artista2 = new Artista("Oliver Cooper", 17, "America do norte");

        filmes1.adicionarArtista(artista1);
        filmes1.adicionarArtista(artista2);
        salaDeCinema1.adicionaFilmes(filmes1);

        System.out.println(salaDeCinema1);

        //Filme 2
        SalaDeCinema salaDeCinema2 = new SalaDeCinema(2, "Cinemark", "Piso 03");

        Filmes filmes2 = new Filmes("Moana 2", 2024, "EUA", "Ingles", "Infantil/Aventura");

        Artista artista3 = new Artista("Moana", 19, "America do Norte");

        Artista artista4 = new Artista("Maui", 33, "America do Norte");

        filmes2.adicionarArtista(artista3);
        filmes2.adicionarArtista(artista4);
        salaDeCinema2.adicionaFilmes(filmes2);

        System.out.println(salaDeCinema2);

    }
}