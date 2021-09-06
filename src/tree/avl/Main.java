package tree.avl;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArvoreAvl arvoreAvl = new ArvoreAvl();
        arvoreAvl.inserir(new Pessoa("José"));
        arvoreAvl.inserir(new Pessoa("Abraão"));
        arvoreAvl.inserir(new Pessoa("Washington"));
        arvoreAvl.inserir(new Pessoa("Camila"));
        arvoreAvl.inserir(new Pessoa("Marcos"));

        Busca busca= arvoreAvl.buscarRegistro("Camila".hashCode(), arvoreAvl.raiz);
        System.out.println("Pessoa: " + busca.getPessoa().getNome() + " Achada, comparações: " + busca.getCompracao());

//        menu();
    }

    private static void menu() {
        ArvoreAvl arvoreAvl = new ArvoreAvl();

        Boolean loop = true;
        Scanner sc = new Scanner(System.in);
        int opc = 0;

        //Loop
        while (loop) {

            System.out.println("\n\n     ----------------------------------  \n");
            System.out.println("\n\n       Arvore de cadastro e busca de pessoa \n");
            System.out.println("       1- Cadastrar pessoa \n");
            System.out.println("       2- Listar Pessoa \n");
            System.out.println("       3- Finalizar programa \n");
            System.out.println("Digite a opção desejada: ");
            opc = sc.nextInt();
            System.out.println("\n Opção selecionada: " + opc);

            switch (opc) {
                case 1:
                    //Cadastra na arvore
                    System.out.println("Digite o nome da pessoa:");
                    String nome = sc.next();

                    arvoreAvl.inserir(new Pessoa(nome));
                    break;
                case 2:
                    //Busca na arvore e conta quantos Nos passou
                    System.out.println(arvoreAvl.inorder());

                    break;

                case 3:
                    loop = false;
                    break;


            }
        }

    }


}
