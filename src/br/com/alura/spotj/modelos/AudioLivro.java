package br.com.alura.spotj.modelos;

public class AudioLivro extends Audio {

    private String autor;
    private int duracao;

    public AudioLivro(String nome, int reproducoes, int curtidas, String autor, int duracao) {
        super(nome, reproducoes, curtidas);
        this.autor = autor;
        this.duracao = duracao;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Autor: " + autor);
        System.out.println("Duração: " + duracao + " minutos");
    }

    public String getAutor() {
        return autor;
    }
    public double getDuracao() {
        return duracao;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
