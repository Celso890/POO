package Ex_Aula09b;

public class Pessoa {
    // ATRIBUTOS
    private String nome;
    private int idade;
    private String sexo;

    
    
    //MÉTODOS ESPECIAIS
   
   public Pessoa(String no, int id, String sex){  // CONSTRUTOR
    nome = no;
    idade = id;
    sexo = sex;
   }
   
    public void fazerAniver(){
        this.setIdade(this.getIdade() + 1);
    }

   // GETTERS e SETTERS
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public int getIdade() {
        return idade;
    }

    
    public void setIdade(int idade) {
        this.idade = idade;
    }

    
    public String getSexo() {
        return sexo;
    }

    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
