import models.Emprestimo;
import models.Funcionario;
import models.Livro;
import models.Revista;
import models.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("João Pedro", "joao.pedro@email.com", 12345);
        Funcionario funcionario = new Funcionario("Maria Souza", "maria.souza@email.com", "Bibliotecária");

        Livro livro = new Livro("Percy Jackson", 2005, "1ª Edição");
        Revista revista = new Revista("Capricho", 2015, "Victor Civita");

        Emprestimo emprestimo1 = new Emprestimo(usuario, livro, "01/10/2025", "15/10/2025");
        Emprestimo emprestimo2 = new Emprestimo(funcionario, revista, "02/10/2025", "16/10/2025");

        System.out.println("\n--- Empréstimo 1 ---");
        emprestimo1.exibirDetalhes();

        System.out.println("\n--- Empréstimo 2 ---");
        emprestimo2.exibirDetalhes();
    }
}
