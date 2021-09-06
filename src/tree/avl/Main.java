package tree.avl;

import tree.avl.model.*;

import javax.sound.midi.Soundbank;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArvoreAvl arvoreAvl = new ArvoreAvl();

        Busca busca = arvoreAvl.buscarRegistro("Camila".hashCode(), arvoreAvl.raiz);
        System.out.println("Pessoa: " + busca.getPessoa().getNome() + " Achada, comparações: " + busca.getCompracao());
    }

    private static Pessoa gerarPessoa(Scanner sc) throws ParseException {
        Boolean loop = true;
        Integer opc = 0;

        System.out.println("Digite o nome: ");
        String nome = sc.next();
        Integer id = nome.hashCode();
        System.out.println("Digite o Sobrenome: ");
        String sobrenome = sc.next();
        System.out.println("Digite o telefone: ");
        String telefone = sc.next();
        System.out.println("Digite a data de nascimento no seguinte formato dd/MM/yyyy: ");
        Date dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(sc.next());
        System.out.println("Digite o e-mail: ");
        String email = sc.next();


        Pessoa pessoa = new Pessoa(id, nome, sobrenome, telefone, dataNascimento, email);

        while (loop) {

            System.out.println(" 1- Adicionar categoria Atendido");
            System.out.println(" 2- Adicionar categoria Doador");
            System.out.println(" 3- Adicionar categoria Funcionario");
            System.out.println(" 4- Adicionar categoria Visitante");
            System.out.println(" 5- Adicionar categoria Voluntarios");
            System.out.println(" 6- Finalizar cadastro de pessoa.");
            System.out.print("Digite a opção desejada: ");
            opc = sc.nextInt();
            System.out.println("\n Opção selecionada: " + opc);


            switch (opc) {
                case 1:
                    //Atendido
                    System.out.println("Digite a renda: ");
                    String renda = sc.next();
                    System.out.println("Digite o emprego: ");
                    String emprego = sc.next();
                    System.out.println("Digite o endereço: ");
                    String enderecoAtendido = sc.next();
                    System.out.println("Digite o CPF: ");
                    String cpfAtendido = sc.next();

                    Atendido atendido = new Atendido(renda, emprego, enderecoAtendido, cpfAtendido);
                    pessoa.setAtendido(atendido);
                    break;
                case 2:
                    //Doador
                    System.out.println("Digite o CEP: ");
                    String cep = sc.next();
                    System.out.println("Digite o CPF: ");
                    String cpf = sc.next();
                    System.out.println("Digite o endereço: ");
                    String endereco = sc.next();

                    Doador doador = new Doador(cep, cpf, endereco);
                    pessoa.setDoador(doador );
                    break;
                case 3:
                    // Funcionario

                    break;
                case 4:
                    // Funcionario

                    break;
                case 5:
                    // Funcionario

                    break;
                case 6:
                    // Sair

                    break;

                default:
                    System.out.println("Selecione uma das opções do menu.");

            }
        }
        return null;
    }

    private static void menu() {
        ArvoreAvl arvoreAvl = new ArvoreAvl();

        Boolean loop = true;
        Scanner sc = new Scanner(System.in);
        int opc = 0;

        System.out.println("\n ----------------------------------");
        System.out.println(" Arvore de cadastro e busca de pessoa \n");
        //Loop
        while (loop) {

            System.out.println(" 1- Cadastrar pessoa");
            System.out.println(" 2- Listar Pessoa");
            System.out.println(" 3- Buscar pessoa por Nome");
            System.out.println(" 4- Finalizar programa");
            System.out.print("Digite a opção desejada: ");
            opc = sc.nextInt();
            System.out.println("\n Opção selecionada: " + opc);

            switch (opc) {
                case 1:
                    //Cadastra na arvore
                    System.out.println("Digite o nome da pessoa:");
                    String nome = sc.next();

                    arvoreAvl.inserir(gerarPessoa(sc));
                    break;
                case 2:
                    //Busca na arvore e conta quantos Nos passou
                    System.out.println(arvoreAvl.inorder());

                    break;

                case 3:
                    loop = false;
                    break;

                default:
                    System.out.println("Selecione uma das opções do menu.");


            }
        }

    }


}
