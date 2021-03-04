package ufjf.dcc025.sistema.biblioteca.entities;

import java.util.Calendar;
import java.util.Date;

public class Emprestimo {
    
    private static long idCount = 1;
    private long id;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private boolean statusDevolucao;
    
    private Livro livro;
    private Funcionario funcionario;
    private Usuario usuario;

    public Emprestimo(Livro livro, Funcionario funcionario, Usuario usuario, int diasDevolucao) {
        Calendar cal = Calendar.getInstance();
        
        this.id = idCount;
        this.dataEmprestimo = cal.getTime();
        
        cal.add(Calendar.DAY_OF_MONTH, diasDevolucao);
        cal.set(Calendar.HOUR, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        cal.set(Calendar.MILLISECOND, 999);
        this.dataDevolucao = cal.getTime();
        
        this.statusDevolucao = false;
        this.livro = livro;
        this.funcionario = funcionario;
        this.usuario = usuario;
        
        idCount++;
    }

    public long getId() {
        return id;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public boolean isStatusDevolucao() {
        return statusDevolucao;
    }

    public void setStatusDevolucao(boolean statusDevolucao) {
        this.statusDevolucao = statusDevolucao;
    }

    public Livro getLivro() {
        return livro;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public Usuario getUsuario() {
        return usuario;
    }   
}
