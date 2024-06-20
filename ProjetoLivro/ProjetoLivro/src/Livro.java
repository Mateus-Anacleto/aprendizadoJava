public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private Boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String detalhes() {
        return "Livro{" +
                "Título='" + titulo + '\'' +
                "; Autor='" + autor + '\'' +
                "; Total de Páginas=" + totPaginas + '\n' +
                "; Página Atual=" + pagAtual +
                "; Aberto=" + aberto + '\n'+
                "; Leitor=" + leitor.getNome() +
                "; Idade do leitor="+leitor.getIdade() +
                "; Sexo=" + leitor.getSexo() +
                '}';
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPaginas) {
            this.pagAtual = 0;
        }else{
            this.pagAtual = p;
        }
        this.pagAtual = p;
    }

    @Override
    public void avancarPagina() {
        this.pagAtual++;
    }

    @Override
    public void voltarPagina() {
        this.pagAtual--;
    }
}
