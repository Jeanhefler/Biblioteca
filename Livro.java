import java.util.Objects;

public class Livro {
    private String titulo;
    private String autor;
    private int paginas;
    private int anoDeLancamento;
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    @Override
    public String toString() {
        return "Título: " + this.getTitulo() + " - " +
        "Autor: " + this.getAutor() + " - " +
        "Número de páginas: " + this.getPaginas() + " - " + 
        "Ano de lançamento: " + this.getAnoDeLancamento();
    }
    @Override
    public int hashCode() {
        return Objects.hash(getTitulo());
    }
     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro novoLivro = (Livro) o;
        return getTitulo() == this.getTitulo() && Objects.equals(getTitulo(),novoLivro.getTitulo());
    }
}
