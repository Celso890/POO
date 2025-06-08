package POO_Aula5A;

public class Conta {
    public int numConta;
    protected String tipo; // aceita conta corrente ou conta poupança
    private String dono;
    private float saldo;
    private boolean status;

    
    public Conta (){
        this.status = false;
        this.saldo = 0;
    }
    
    public void abrirConta(String t){ // muda o
        this.setTipo(t);
        this.status = true;
        if (this.tipo == "cc"){
            this.saldo = 50;
            System.out.println("Sua Conta Corrente foi criada com sucesso!");
            System.out.println("Seu saldo é R$ " + this.getSaldo());
        } else {
            this.saldo = 150;
            System.out.println("Sua Conta Poupança foi criada com sucesso!");
            System.out.println("Seu saldo é R$ " + this.getSaldo());
        }
    }

    public void fecharConta(){
        this.status = false;
        if (this.saldo < 0){
            System.out.println("Você não pode encerrar a sua conta com saldo negativo. \nPor favor, regularize sua situação antes de encerrar a conta!");
        } else if (this.saldo > 0){
            System.out.println("Por favor, efetue o saque de todo o valor na sua conta para que o enerramento seja concluído com sucesso!");
        } else {
            this.setStatus(false);
            System.out.println("Foi muito bom tê-lo conosco!\nAgradecemos pela sua confiança.");
        }
            
        }
    

    public void depositar(float v){
        if (this.status == true){
            this.saldo += v;
            System.out.println("Depósito efetuado com sucesso! \n Seu saldo é de R$ " + this.getSaldo());
        } else {
            System.out.println("Realize a aberta de sua conta para efetuar depósitos.");
        }
    }

    public void sacar(float v) {
        if(this.status == true && this.saldo > 0){
            this.saldo -= v;
        } else {
            System.out.println("Saldo insuficiente!");
        }
        
    }

    public void pagarMensal(){
        float r = 0.0f; 
        if (this.tipo == "cc"){
            r = 12.0f;
        }else{
            r= 20.0f;
        }

        if(this.status == true){
            if (this.saldo > 0){
                this.saldo -= r;
            } else {
                System.out.println("Saldo insuficiente!");
            }
            
        } else {
            System.out.println("Impossível pagar, pois a conta ainda está fechada!");
        }
    }

    public void mostrarSaldo(){
        System.out.println("Seu saldo atual é de R$ " + this.getSaldo());
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
