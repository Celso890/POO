package POO_Aula1.src;
public class App {
    public static void main(String[] args) throws Exception {
       
        // instanciando a classe caneta para criar um objeto
        Caneta c1 = new Caneta(); 
        
        // declarando os atributos do objeto c1
        c1.modelo = "BIC";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        //instanciando novamente a classe caneta para criar outro objeto
        Caneta c2 = new Caneta();

        // declarando os atributos do objeto c2
        c2.modelo = "Compactor";
        c2.cor = "Vermelha";
        c2.ponta = 0.7f;
        c2.tampada = true;
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
