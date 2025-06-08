public class App {
    public static void main(String[] args) throws Exception {
       
        // instanciando a classe caneta para criar um objeto
        Caneta c1 = new Caneta(); 
        
        // declarando os atributos do objeto c1
        c1.modelo = "BIC Crystal";
        c1.cor = "Azul";
        // c1.ponta = 0.5f; não deixa mexer nesse atributo pq é privado
        c1.carga = 80; // deixa utilizar mesmo sendo protegida pois é originado da classe Caneta
        c1.tampada = true;
        c1.status();
        
    }
}
