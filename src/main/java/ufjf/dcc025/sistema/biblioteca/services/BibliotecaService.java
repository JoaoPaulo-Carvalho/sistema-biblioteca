/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.sistema.biblioteca.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
    private static List<Livro> livros = new ArrayList<Livro>();
    private static List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

    public static void startUp() {
        // SEEDING
        
    }
}
