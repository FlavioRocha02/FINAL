package exercicios.exercicio05;

public class Ebook {
    // atributos
    private String titulo, autor;
    private int totalPaginas, paginaAtual;

    public Ebook(String titulo, String autor, int totalPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        if(totalPaginas > 0) {
            this.totalPaginas = totalPaginas;
        }
        paginaAtual = 0;
    }

    public void avancarPagina() {
        if(paginaAtual < totalPaginas){
            paginaAtual++;
        }
    }

    public void retrocederPagina() {
        if(paginaAtual > 0) {
            paginaAtual--;
        }
    }

    public void irParaPagina(int pagina) {
        if(pagina >= 0 && pagina <= totalPaginas) {
            paginaAtual = pagina;
        }
    }

    public int exibirPagina() {
        return paginaAtual;
    }

    public void exibirCapa() {
        System.out.printf("Livro: %s - %s (%d)\n", titulo , autor, totalPaginas);
    }

}
