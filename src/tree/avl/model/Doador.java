package tree.avl.model;

public class Doador {
    private String cep;
    private String cpf;
    private String endereco;

    public Doador(String cep, String cpf, String endereco) {
        this.cep = cep;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Doador{" +
                "cpf='" + cpf + '\'' +
                '}';
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
