package POO_aula4;

public class aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Pentel", "Amarela", 0.4f);
        //c1.setModelo("BIC"); //altera o atributo sem mexer no atributo da classe 
        //c1.modelo = "BIC"; acessa diretamente o atributo da classe
        //c1.setPonta(0.5f);
        //c1.ponta = 0.5f; não é possível alterar diretamente pois o atributo é private na classe 
        c1.status();

        Caneta c2 = new Caneta ("Compactor", "Vermelha", 1.0f);
        c2.status();
    }
}
