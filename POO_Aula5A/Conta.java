package POO_Aula5A;

public class Conta {
    public int numConta;
    protected String tipo; // aceita conta corrente ou conta poupança
    private String dono;
    private float saldo;
    private boolean status;

    
    public Conta (){
        this.setStatus(false);
        this.setSaldo(0) ;
    }
    
    public void abrirConta(String t){ // muda o
        this.setTipo(t);
        this.setStatus(true);
        if (t == "cc"){
            this.setSaldo(50);
            System.out.println("Sua Conta Corrente foi criada com sucesso!");
            System.out.println("Seu saldo é R$ " + this.getSaldo());
        } else if (t == "cp") {
            this.setSaldo(150);
            System.out.println("Sua Conta Poupança foi criada com sucesso!");
            System.out.println("Seu saldo é R$ " + this.getSaldo());
        }
    }

    public void fecharConta(){
        this.status = false;
        if (this.getSaldo() < 0){
            System.out.println("Você não pode encerrar a sua conta com saldo negativo. \nPor favor, regularize sua situação antes de encerrar a conta!");
        } else if (this.getSaldo() > 0){
            System.out.println("Por favor, efetue o saque de todo o valor na sua conta para que o enerramento seja concluído com sucesso!");
        } else {
            this.setStatus(false);
            System.out.println("Foi muito bom tê-lo conosco!\nAgradecemos pela sua confiança.");
        }
            
        }
    

    public void depositar(float v){
        if (this.getStatus() == true){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito efetuado com sucesso!");
        } else {
            System.out.println("Realize a abertura de sua conta para efetuar depósitos.");
        }
    }

    public void sacar(float v) {
        if(this.getStatus() == true && this.getSaldo() >= v){
            this.setSaldo(this.getSaldo() - v);
            System.err.println("Saque realizado com sucesso da conta de " + this.getDono());
        } else {
            System.out.println("Saldo insuficiente!");
        }  
    }

    public void pagarMensal(){
        float r = 0.0f; 
        if (this.getTipo() == "cc"){
            r = 12.0f;
        }else{
            r= 20.0f;
        }

        if(this.getStatus() == true){
            if (this.getSaldo() > 0){
                this.setSaldo(this.getSaldo() - r);
                System.out.println("Mensalidade paga com sucesso por " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente!");
            }
            
        } else {
            System.out.println("Impossível pagar, pois a conta ainda está fechada!");
        }
    }

    public void estadoAtual(){
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: R$ " + this.getSaldo());
        System.out.println("Status: " + this.getStatus() + "\n");
    }

    //   MÉTODOS ESPECIAIS 

    public int getNumConta(){
        return this.numConta;
    }

    public void setNumConta(int x){
        this.numConta = x;
    }

    public String getTipo(){
        return this.tipo;
    } 

    public void setTipo(String type){
        this.tipo = type;
    }

    public String getDono(){
        return this.dono;
    }

    public void setDono(String name){
        this.dono = name;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void setSaldo(float y){
        this.saldo = y;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }
}
