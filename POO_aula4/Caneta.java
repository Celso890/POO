package POO_aula4;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    private boolean tampada;

    public Caneta(String m, String c, float p) { //recebe o mesmo nome da sua classe --> método construtor
        this.modelo = m;
        this.tampar();
        this.cor = c;
        this.ponta = p;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta(){ // é necessário definir o tipo de dado do get no caso ao lado float
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("MODELO: " + this.getModelo());
        System.out.println("PONTA: " + this.getPonta());
        System.out.println("COR: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
    
}
