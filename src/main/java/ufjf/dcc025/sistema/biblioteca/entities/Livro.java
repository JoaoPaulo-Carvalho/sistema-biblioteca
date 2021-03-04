package ufjf.dcc025.sistema.biblioteca.entities;

public class Livro {
    
    private static long idCount = 1;
    private long id;
    private String nome;
    private String autor;
    private String editora;
    private int quantAcervo;
    private int quantEmprestimo;

    public Livro(String nome, String autor, String editora, int quantAcervo, int quantEmprestimo) {
        this.id = idCount;
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.quantAcervo = quantAcervo;
        this.quantEmprestimo = quantEmprestimo;
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getQuantAcervo() {
        return quantAcervo;
    }

    public void addQuantAcervo(int quantAcervo) {
        this.quantAcervo += quantAcervo;
    }

    public void removeQuantAcervo(int quantAcervo) {
        this.quantAcervo -= quantAcervo;
    }

    public int getQuantEmprestimo() {
        return quantEmprestimo;
    }

    public void addQuantEmprestimo(int quantEmprestimo) {
        this.quantEmprestimo += quantEmprestimo;
    }

    public void removeQuantEmprestimo(int quantEmprestimo) {
        this.quantEmprestimo -= quantEmprestimo;
    }
}
