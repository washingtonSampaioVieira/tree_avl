package tree.avl.model;

public class Atendido {
    private String renda;
    private String emprego;
    private String endereco;
    private String cpf;

    public Atendido(String renda, String emprego, String endereco, String cpf) {
        this.renda = renda;
        this.emprego = emprego;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Atendido{" +
                "endereco='" + endereco + '\'' +
                '}';
    }

    public String getRenda() {
        return renda;
    }

    public void setRenda(String renda) {
        this.renda = renda;
    }

    public String getEmprego() {
        return emprego;
    }

    public void setEmprego(String emprego) {
        this.emprego = emprego;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
