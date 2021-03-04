package ufjf.dcc025.sistema.biblioteca.entities;

import java.util.Date;


public class Usuario {
    
    private static long idCount = 1;
    private long id;
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String senha;

    public Usuario(String nome, String cpf, Date dataNascimento) {
        this.id = idCount;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        
        idCount++;
    }

    public long getId() {
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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
