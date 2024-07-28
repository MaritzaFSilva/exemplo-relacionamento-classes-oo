import java.util.ArrayList;

public class Cd {

    private String titulo;
    private int ano;
    private boolean ehDuplo;

    private Banda banda;
    private ArrayList<Musica> musicas;

    public Cd(String titulo, int ano, boolean ehDuplo, Banda banda) {
        this.titulo = titulo;
        this.ano = ano;
        this.ehDuplo = ehDuplo;
        this.banda = banda;
        this.musicas = new ArrayList<Musica>();
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isEhDuplo() {
        return this.ehDuplo;
    }

    public void setEhDuplo(boolean ehDuplo) {
        this.ehDuplo = ehDuplo;
    }

    public Banda getBanda() {
        return this.banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }

    @Override
    public String toString() {
        return "Cd [titulo=" + titulo + "]";
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }

}
