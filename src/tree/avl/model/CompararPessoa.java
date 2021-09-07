package tree.avl.model;

import java.util.Comparator;

public class CompararPessoa implements Comparator<Pessoa> {
    public int compare(Pessoa a, Pessoa b) {
        return a.getNome().compareTo(b.getNome());
    }
}
