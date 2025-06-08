package POO_Aula5A;

public class exercicio1 {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.numConta = 493;
        c1.tipo = "cc";
        c1.setDono("Joãozinho");
        c1.abrirConta("cc");
        c1.depositar(300);
        c1.pagarMensal();
        c1.mostrarSaldo();

        Conta c2 = new Conta();
        c2.numConta = 4192;
        c2.tipo = "cp"; // conta poupança
        c2.setDono("Jorgina");

    }
}
