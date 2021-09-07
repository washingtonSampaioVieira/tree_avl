package tree.avl;

import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;
import tree.avl.model.*;

import javax.sound.midi.Soundbank;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private ArvoreAvl arvoreAvlAtendido;
    private ArvoreAvl arvoreAvlDoador;
    private ArvoreAvl arvoreAvlFuncionario;
    private ArvoreAvl arvoreAvlVisitante;
    private ArvoreAvl arvoreAvlVoluntario;

    public static void main(String[] args) {
        ArvoreAvl arvoreAvl = new ArvoreAvl();
// 1- Listar pessoas por categoria
// 2-
        try {
            menu();
        } catch (ParseException e) {
            System.out.println("Deu erro no cadastro");
        }
    }
    //

    private static Pessoa gerarPessoa(Scanner sc)  {
        Boolean loop = true;
        Integer opc = 0;

        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();
        Integer id = nome.hashCode();
        System.out.println("Digite o Sobrenome: ");
        String sobrenome = sc.nextLine();
        System.out.println("Digite o telefone: ");
        String telefone = sc.nextLine();
        System.out.println("Digite a data de nascimento no seguinte formato dd/MM/yyyy: ");
        Date dataNascimento = null;
        try {
            dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
        } catch (ParseException e) {
            System.out.println("Não conseguimos identificar a data.");
        }
        System.out.println("Digite o e-mail: ");
        String email = sc.nextLine();


        Pessoa pessoa = new Pessoa(id, nome, sobrenome, telefone, dataNascimento, email);

        while (loop) {

            System.out.println(" 1- Adicionar categoria Atendido");
            System.out.println(" 2- Adicionar categoria Doador");
            System.out.println(" 3- Adicionar categoria Funcionario");
            System.out.println(" 4- Adicionar categoria Visitante");
            System.out.println(" 5- Adicionar categoria Voluntario");
            System.out.println(" 6- Finalizar cadastro de pessoa.");
            System.out.print("Digite a opção desejada: ");
            opc = sc.nextInt();
            System.out.println("\n Opção selecionada: " + opc);

            switch (opc) {
                case 1:
                    //Atendido
                    if (pessoa.getDoador() == null && pessoa.getFuncionario() == null) {
                        // Atendido não pode ser doador e nem funcionario
                        System.out.println("Digite a renda: ");
                        String renda = sc.nextLine();
                        System.out.println("Digite o emprego: ");
                        String emprego = sc.nextLine();
                        System.out.println("Digite o endereço: ");
                        String enderecoAtendido = sc.nextLine();
                        System.out.println("Digite o CPF: ");
                        String cpfAtendido = sc.nextLine();

                        Atendido atendido = new Atendido(renda, emprego, enderecoAtendido, cpfAtendido);
                        pessoa.setAtendido(atendido);
                    } else {
                        System.out.println("Operação não pode ser realizada.");
                    }

                    break;
                case 2:
                    if (pessoa.getAtendido() == null) {
                        //Doador
                        System.out.println("Digite o CEP: ");
                        String cep = sc.nextLine();
                        System.out.println("Digite o CPF: ");
                        String cpf = sc.nextLine();
                        System.out.println("Digite o endereço: ");
                        String endereco = sc.nextLine();

                        Doador doador = new Doador(cep, cpf, endereco);
                        pessoa.setDoador(doador);
                    } else {
                        System.out.println("Operação não pode ser realizada.");
                    }

                    break;
                case 3:
                    if (pessoa.getAtendido() == null) {

                        // Funcionario
                        System.out.println("Dgite o vaga: ");
                        String vagaFuncionario = sc.nextLine();
                        System.out.println("Dgite o cpf: ");
                        String cpfFuncionario = sc.nextLine();
                        System.out.println("Dgite o genero: ");
                        String generoFuncionario = sc.nextLine();

                        Funcionario funcionario = new Funcionario();
                        funcionario.setVaga(vagaFuncionario);
                        funcionario.setCpf(cpfFuncionario);
                        funcionario.setGenero(generoFuncionario);

                        pessoa.setFuncionario(funcionario);
                    } else {
                        System.out.println("Operação não pode ser realizada.");
                    }
                    break;
                case 4:
                    // Visitante
                    System.out.println("Digite o email: ");
                    String emailVisitante = sc.next("aaaaa");
                    System.out.println("Digite o cep: ");
                    String cepVisitante = sc.nextLine();
                    System.out.println("Digite o renda: ");
                    String rendaVisitante = sc.nextLine();

                    Visitante visitante = new Visitante();
                    visitante.setEmail(emailVisitante);
                    visitante.setCep(cepVisitante);
                    visitante.setRenda(rendaVisitante);

                    pessoa.setVisitante(visitante);
                    break;
                case 5:
                    // Voluntarios
                    System.out.println("Digite o vaga: ");
                    String vagaVoluntario = sc.nextLine();
                    System.out.println("Digite o cpf: ");
                    String cpfVoluntario = sc.nextLine();
                    System.out.println("Digite o genero: ");
                    String generoVoluntario = sc.nextLine();

                    Voluntarios voluntarios = new Voluntarios();
                    voluntarios.setVaga(vagaVoluntario);
                    voluntarios.setCpf(cpfVoluntario);
                    voluntarios.setGenero(generoVoluntario);

                    pessoa.setVoluntarios(voluntarios);
                    break;
                case 6:
                    // Sair
                    return pessoa;
                default:
                    System.out.println("Selecione uma das opções do menu.");

            }
        }
        return null;
    }

    private static void menu() throws ParseException {
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
                    arvoreAvl.inserir(gerarPessoa(sc));
                    break;
                case 2:
                    //Busca na arvore e conta quantos Nos passou
                    ArrayList<No> nos =arvoreAvl.inorder();
//                    nos.get(0).getChave().ge
                    System.out.println(nos);
                    break;
                case 3:
                    System.out.println("Digite o nome da pessoa que deseja buscar");
                    String nome = sc.nextLine();
                    arvoreAvl.buscarRegistro(nome.hashCode(), arvoreAvl.raiz);
                case 4:
                    loop = false;
                    break;
                default:
                    System.out.println("Selecione uma das opções do menu.");

            }
        }

    }


}
