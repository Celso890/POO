package Ex_Aula09b;

public class Livro implements Publicacao {
    
    // ATRIBUTOS
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    
    public String detalhes() {
        String detalhes = "Livro{ " + "titulo= " + titulo + "\n, autor=" 
                + autor + "\n, totPaginas= " + totPaginas 
                + "\n, pagAtual= " + pagAtual + "\n, aberto= " 
                + aberto + "\n, leitor= " + leitor.getNome() + 
                "\n, idade= " + leitor.getIdade() +
                "\n, sexo= " + leitor.getSexo() + '}' + "\n"
                ;
        return detalhes;
    }

    // MÉTODOS ESPECIAIS
    public Livro (String titulo, String autor, int totPaginas, Pessoa leitor) { // CONSTRUTOR
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
    }

    
    // GETTERS e SETTERS
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

    
    public int getTotPaginas() {
        return totPaginas;
    }

    
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    
    public int getPagAtual() {
        return pagAtual;
    }

    
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

   
    public boolean getAberto() {
        return aberto;
    }

    
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    
    public Pessoa getLeitor() {
        return leitor;
    }

    
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    
    // MÉTODOS ABSTRATOS
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear() {
        int tamanho = this.getTotPaginas();
        
        if(this.getAberto()){
            if (this.getPagAtual() <= tamanho){
                System.out.println("Folheando da página " + this.getPagAtual());    
                for (int i = this.getPagAtual(); i < tamanho; i++) {
                    this.setPagAtual(this.getPagAtual() + 1); 
                }
            } else {
                System.out.println("A página não está dentro do limite de páginas do livro!");
            }
       } else {
        System.out.println("O livro está fechado!");
       }
    }

    @Override
    public void avancarPag() {
       if (this.getPagAtual() < this.getTotPaginas()){
            this.setPagAtual(this.getPagAtual() + 1);
       } else {
        System.out.println("Fim do Livro");
       }
       
    }

    @Override
    public void voltarPag() {
       if (this.getPagAtual() > 0 && this.getPagAtual() <= this.getTotPaginas()){
            this.setPagAtual(this.getPagAtual() - 1);
       } else {
            System.out.println("O Livro está na página inicial.");
       } 
        
    }

}
