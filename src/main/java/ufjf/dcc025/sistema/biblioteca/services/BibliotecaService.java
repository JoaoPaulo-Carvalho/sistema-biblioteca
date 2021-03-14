/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.sistema.biblioteca.services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import ufjf.dcc025.sistema.biblioteca.entities.Emprestimo;
import ufjf.dcc025.sistema.biblioteca.entities.Funcionario;
import ufjf.dcc025.sistema.biblioteca.entities.Livro;
import ufjf.dcc025.sistema.biblioteca.entities.Usuario;

/**
 *
 * @author joaopaulo
 */
public class BibliotecaService {
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    private static List<Usuario> usuarios = new ArrayList<Usuario>();
    private static List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private static List<Livro> livros = new ArrayList<Livro>();
    private static List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
    
    private static Usuario usrLogado;
    private static Funcionario funcLogado;

    public static void startUp() {
        // SEEDING
        loadFuncionarios();
        loadUsuarios();
        loadLivros();
    }
    
    public static void loadUsuarios() {
        // se arquivo existe : load arquivos
        // senao
        Usuario novoUsr = new Usuario("João Paulo", "12345678901", "03/02/1997", "123");
        usuarios.add(novoUsr);
        System.out.println(novoUsr.toString());
        updateUsuarios();
    }
    
    public static void loadFuncionarios() {
        // se arquivo existe : load arquivos
        // senao
        Funcionario novoFunc = new Funcionario("admin", "00000000000", "01/01/2000", "admin");
        funcionarios.add(novoFunc);
        System.out.println(novoFunc.toString());
        updateFuncionarios();
    }
    
    public static void loadLivros() {
        for(int i =1;i<9;i++){
            int acervo = i+3;
            int emprestado = i+1;
            int disponivel = emprestado;
            Livro l = new Livro("nome"+i,"autor"+ i,"editora"+i,acervo,emprestado,"199"+i,"edição"+i);
            livros.add(l);
        }
        updateLivros();
    }
    
    public static List<Livro> getLivros() {
        return livros;
    }
    
    public static List<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public static List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public static Usuario getUsrLogado() {
        return usrLogado;
    }

    public static Funcionario getFuncLogado() {
        return funcLogado;
    } 

    public static void setUsrLogado(Usuario usrLogado) {
        BibliotecaService.usrLogado = usrLogado;
    }

    public static void setFuncLogado(Funcionario funcLogado) {
        BibliotecaService.funcLogado = funcLogado;
    }
    
    public static void updateUsuarios() {
        // salvar arquivo
    }
    
    public static void updateLivros() {
        // salvar arquivo
    }
    
    public static void updateFuncionarios() {
        // salvar arquivo
    }
}
