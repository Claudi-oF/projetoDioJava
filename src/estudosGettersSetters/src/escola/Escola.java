package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno claudio = new Aluno();
        /* set= setar um novo  */
        claudio.setNome("Claudio");
        claudio.setIdade(19);

        System.out.println("O aluno " + claudio.getNome() + " tem " + claudio.getIdade() + " anos.");

    }
}
