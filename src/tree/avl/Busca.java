package tree.avl;

import tree.avl.model.Pessoa;

public class Busca {
    private Pessoa pessoa;
    private Integer compracao;

    @Override
    public String toString() {
        return "Busca{" +
                "pessoa=" + pessoa +
                ", Comparações=" + compracao +
                '}';
    }

    public Busca(Pessoa pessoa, Integer compracao) {
        this.pessoa = pessoa;
        this.compracao = compracao;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Integer getCompracao() {
        return compracao;
    }

    public void setCompracao(Integer compracao) {
        this.compracao = compracao;
    }
}
