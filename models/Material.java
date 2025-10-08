package models;

public abstract class Material {
    protected String titulo;
    protected Integer anoPublicacao;

    public Material(String titulo, Integer anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public abstract void descricao();
}
