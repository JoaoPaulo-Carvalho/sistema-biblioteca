/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.sistema.biblioteca.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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
public class BibliotecaService<T> {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private static List<Usuario> usuarios = new ArrayList<Usuario>();
    private static List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private static List<Livro> livros = new ArrayList<Livro>();
    private static List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

    public static void startUp() throws IOException {
        // SEEDING
        File empretimos = new File("empretimos.txt");
        File funcionario = new File("funcionarios.txt");
        File livros = new File("livros.txt");
        File usuarios = new File("usuarios.txt");

        empretimos.createNewFile();
        funcionario.createNewFile();
        livros.createNewFile();
        usuarios.createNewFile();
        
        funcionarios.add(new Funcionario("admin", "12345678901", "01/01/2000", "admin"));

        // insere admin no arquivo de funcionarios
    }
    
    public static void addUsuario (Usuario usr) {
        usuarios.add(usr);
        
        ObjectMapper mapper = new ObjectMapper();

        try {
            // Writing to a file   
            mapper.writeValue(new File("usuarios.txt"), usuarios);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void addDados(String classe) {;
        ObjectMapper mapper = new ObjectMapper();

        try {
            // Writing to a file   
            mapper.writeValue(new File(classe + ".txt"), objetos);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*public static String serializeObj(Object objeto) throws JsonProcessingException {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        return ow.writeValueAsString(objeto);
    }

    public static Object deserializeObj(String json) {

    }*/
}
