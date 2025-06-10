package POO_Aula5A;

public class exercicio1 {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.setNumConta(493);
        c1.setTipo("cc");
        c1.setDono("Joãozinho");
        c1.abrirConta("cc");
        c1.depositar(300);
        c1.pagarMensal();
        c1.estadoAtual();

        Conta c2 = new Conta();
        c2.setNumConta(4192);
        c2.setTipo ("cp"); // conta poupança
        c2.setDono("Jorgina");
        c2.abrirConta("cp");
        c2.sacar(150);
        c2.fecharConta();
        c2.estadoAtual();

    }
}
