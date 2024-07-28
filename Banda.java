import java.util.ArrayList;

public class Banda {

    private String nome;
    private EnumEstilo estilo;
    private ArrayList<Cd> cds;

    public Banda(String nome, EnumEstilo estilo) {
        this.nome = nome;
        this.estilo = estilo;
        this.cds = new ArrayList<Cd>();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EnumEstilo getEstilo() {
        return this.estilo;
    }

    public void setEstilo(EnumEstilo estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return "Banda [nome=" + nome + "]";
    }

    public ArrayList<Cd> getCds() {
        return cds;
    }

    public void setCds(ArrayList<Cd> cds) {
        this.cds = cds;
    }

}