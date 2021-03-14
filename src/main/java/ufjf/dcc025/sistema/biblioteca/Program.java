package ufjf.dcc025.sistema.biblioteca;

import javax.swing.JFrame;
import ufjf.dcc025.sistema.biblioteca.layouts.ListaLivros;
import ufjf.dcc025.sistema.biblioteca.layouts.Login;
import ufjf.dcc025.sistema.biblioteca.services.BibliotecaService;


public class Program {
    
    public static void main(String[] args) {
        
        BibliotecaService.startUp();
        
        //ListaLivros lisLiv = new ListaLivros();
        //lisLiv.setVisible(true);
        
        Login login = new Login();
        login.setVisible(true);
    }    
}
