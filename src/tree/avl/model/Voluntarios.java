package tree.avl.model;
import java.util.Date;

public class Voluntarios {

    private String vaga;
    private String cpf;
    private String genero;

    @Override
    public String toString() {
        return "Voluntarios{" +
                "vaga='" + vaga + '\'' +
                '}';
    }

    public String getVaga() {
        return vaga;
    }
    public void setVaga(String vaga) {
        this.vaga = vaga;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
