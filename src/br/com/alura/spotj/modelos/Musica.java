package br.com.alura.spotj.modelos;

public class Musica extends Audio {

    private String cantor;
    private int anoDeLancamento;
    private String album;
    private double duracao;

    public Musica(String nome, int reproducoes, int curtidas, String cantor, int anoDeLancamento,
                  String album, double duracao) {
        super(nome, reproducoes, curtidas);
        this.cantor = cantor;
        this.anoDeLancamento = anoDeLancamento;
        this.album = album;
        this.duracao = duracao;
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Cantor: " + cantor);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração: " + duracao);
    }

    public String getCantor() {
        return cantor;
    }
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    public String getAlbum() {
        return album;
    }
    public double getDuracao() {
        return duracao;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
}
