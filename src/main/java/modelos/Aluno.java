package modelos;

//2.1. Módulo de Alunos
//    • Cadastrar um novo aluno (nome, CPF, data de nascimento, telefone, e-mail).
//        • Listar todos os alunos cadastrados.
//    • Editar informações de um aluno existente.
//        • Excluir um aluno do sistema.
//    • Buscar aluno por nome ou CPF.

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Aluno {

    private Long id;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String telefone;
    private String email;

    public Aluno(){
    }

    public Aluno(Long id, String nome, String cpf, LocalDate dataNascimento, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return Period.between(this.dataNascimento, LocalDate.now()).getYears();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(id, aluno.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return  "\nID: " + id +
                "\nNome: " + nome +
                "\nCPF: " + cpf +
                "\nData Nascimento: " + dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+
                "\nTelefone: " + telefone +
                "\nE-mail: " + email +
                "\nIdade: " + getIdade();
    }

}
