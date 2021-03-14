package ufjf.dcc025.sistema.biblioteca.entities;

import java.io.Serializable;
import java.util.Date;


public class Usuario {
    
    private static long idCount = 1;
    private long id;
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String senha;

    public Usuario(String nome, String cpf, String dataNascimento, String senha) {
        this.id = idCount;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
        
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
