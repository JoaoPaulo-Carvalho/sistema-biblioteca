package ufjf.dcc025.sistema.biblioteca.entities;

import java.io.Serializable;
import java.util.Date;

public class Funcionario extends Usuario  implements Serializable {

    public Funcionario(String nome, String cpf, String dataNascimento, String senha) {
        super(nome, cpf, dataNascimento, senha);
    }
    
    
}
