public class ProjetoPessoas {
    public static void main(String[] args) {
        //Programa Principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");



        p2.setCurso("Informática");
        p3.setSalario((float) 2500.75);
        p4.setSetor("Estoque");
        p4.mudarTrabalho();
        System.out.println(p2.toString());

       // p1.receberAumento(550.20); //Não é possível pois a classe pessoa não possui o método citado
       // p2.mudarTrabalho(); //Não é possível pois a classe Aluno não possui o método citado
       // p4.cancelarMatr(;) //Não é possível pois a classe Funcionario não possui o método citado
    }
}
