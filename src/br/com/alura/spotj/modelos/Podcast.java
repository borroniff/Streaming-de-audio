package br.com.alura.spotj.modelos;

public class Podcast extends Audio {

    private int episodios;
    private int duracaoPorEp;

    public Podcast(String nome, int reproducoes, int curtidas, int episodios, int duracaoPorEp) {
        super(nome, reproducoes, curtidas);
        this.episodios = episodios;
        this.duracaoPorEp = duracaoPorEp;
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Episódios: " + episodios);
        System.out.println("Duração por episódio: " + duracaoPorEp + " minutos");
    }

    public int getEpisodios() {
        return episodios;
    }
    public double getDuracaoPorEp() {
        return duracaoPorEp;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
    public void setDuracaoPorEp(int duracaoPorEp) {
        this.duracaoPorEp = duracaoPorEp;
    }
}
