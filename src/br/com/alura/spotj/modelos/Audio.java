package br.com.alura.spotj.modelos;

public class Audio {

    protected String nome;
    protected int reproducoes;
    protected int curtidas;

    public Audio(String nome, int reproducoes, int curtidas) {
        this.nome = nome;
        this.reproducoes = reproducoes;
        this.curtidas = curtidas;
    }

    public int curtir() {
        return curtidas += 1;
    }

    public int reproduzir() {
        return reproducoes += 1;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Reproduções: " + reproducoes);
        System.out.println("Curtidas: " + curtidas);
    }

}
