package tree.avl;

public class No {

    private No esquerda;
    private No direita;
    private No pai;

    private Pessoa chave;
//    private int chave;
    private int balanceamento;

    public No(Pessoa k) {
        setEsquerda(setDireita(setPai(null)));
        setBalanceamento(0);
        setChave(k);
    }

    public String toString() {
        return getChave().getNome();
    }

    public Pessoa getChave() {
        return chave;
    }

    public void setChave(Pessoa chave) {
        this.chave = chave;
    }

    public int getBalanceamento() {
        return balanceamento;
    }

    public void setBalanceamento(int balanceamento) {
        this.balanceamento = balanceamento;
    }

    public No getPai() {
        return pai;
    }

    public No setPai(No pai) {
        this.pai = pai;
        return pai;
    }

    public No getDireita() {
        return direita;
    }

    public No setDireita(No direita) {
        this.direita = direita;
        return direita;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }
}