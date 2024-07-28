public class Musica {
    private String titulo;
    private int duracao;

    private Cd cd;
    private Musico musico;

    public Musica(String titulo, int duracao, Cd cd, Musico musico) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.cd = cd;
        this.musico = musico;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Cd getCd() {
        return cd;
    }

    public void setCd(Cd cd) {
        this.cd = cd;
    }

    public Musico getMusico() {
        return musico;
    }

    public void setMusico(Musico musico) {
        this.musico = musico;
    }

    @Override
    public String toString() {
        return "Musica [titulo=" + titulo + "]";
    }
    

}