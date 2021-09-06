package tree.avl.model;

import java.util.Date;

public class Pessoa {


    private Integer id;
    private String nome;
    private String sobrenome;
    private String telefone;
    private Date dataNascimento;
    private String email;
    private Atendido atendido;
    private Doador doador;
    private Funcionario funcionario;
    private Visitante visitante;
    private Voluntarios voluntarios;

    public Pessoa() {
        super();
    }

    public Pessoa(Integer id, String nome, String sobrenome, String telefone, Date dataNascimento, String email) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Atendido getAtendido() {
        return atendido;
    }

    public void setAtendido(Atendido atendido) {
        this.atendido = atendido;
    }

    public Doador getDoador() {
        return doador;
    }

    public void setDoador(Doador doador) {
        this.doador = doador;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Visitante getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }

    public Voluntarios getVoluntarios() {
        return voluntarios;
    }

    public void setVoluntarios(Voluntarios voluntarios) {
        this.voluntarios = voluntarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
