package POO_aula7a;

import java.util.Random;

public class Luta {
    // ATRIBUTOS
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // MÉTODOS

    /* REGRAS DA LUTA =>
    1) SÓ PODE SER MARCADA ENTRE LUTADORES DA MESMA CATEGORIA;
    2) DESAFIADO E DESAFIANTE DEVEM SER LUTADORES DIFERENTES; 
    3) SÓ PODE ACONTECER SE A LUTA ESTIVER APROVADA;
    4) SÓ PODE TER COMO RESULTADO A VITÓRIA DE UM DOS LUTADORES OU EMPATE;
    */  
    

    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria() == l2.getCategoria() && (l1 != l2)){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
            System.out.println("Atenção!! \n Discrepância de categorias ou não há diferenciação de lutadores!");
        }

    }

    public void Lutar(){
        if (this.getAprovada()){
            System.out.println("##### DESAFIADO #####");
            this.getDesafiado().apresentar();
            System.out.println("\n##### DESAFIANTE #####");
            this.getDesafiante().apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 ou 2

            switch (vencedor) {
                case 0: //EMPATE
                    System.out.println("\nEmpatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();    
                    break;
                case 1: //GANHOU DESAFIADO
                    System.out.println("\nO lutador " + this.desafiado.getNome() + " venceu!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //GANHOU O DESAFIANTE 
                    System.out.println("\nO lutador " + this.desafiante.getNome() + " venceu!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        } else {
            System.out.println("A luta não pode acontecer!!");
        }
    }

    // MÉTODOS ESPECIAIS
    
    public Lutador getDesafiado() {
        return desafiado;
    }

    
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    
    public Lutador getDesafiante() {
        return desafiante;
    }

    
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

   
    public int getRounds() {
        return rounds;
    }

    
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    
    public boolean getAprovada() {
        return aprovada;
    }

  
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
