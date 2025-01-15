import br.com.alura.spotj.modelos.AudioLivro;
import br.com.alura.spotj.modelos.Musica;
import br.com.alura.spotj.modelos.Podcast;

public class Main {
    public static void main(String[] args) {

        Musica musica1 = new Musica("Clone",232000, 88000, "Luan Santana",
                2024, "Ao vivo na Lua", 2.45);
        musica1.curtir();
        musica1.reproduzir();
        musica1.imprimir();

        Podcast podcast1 = new Podcast("PodDelas", 12737000, 7568000, 168,
                85);
        podcast1.curtir();
        podcast1.reproduzir();
        podcast1.imprimir();

        AudioLivro livro1 = new AudioLivro("É assim que acaba", 50000, 32000,
                "Colleen Houver", 510);
        livro1.curtir();
        livro1.reproduzir();
        livro1.imprimir();
    }
}