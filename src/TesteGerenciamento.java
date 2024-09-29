
public class TesteGerenciamento {
    public static void main(String[] args) {
        GerenciadorDePessoas gerenciador = new GerenciadorDePessoas();

        // Cadastrando duas pessoas
        Pessoa pessoa1 = new Pessoa("Juliana", "123.456.789-00", 30);
        Pessoa pessoa2 = new Pessoa("Carlos", "987.654.321-00", 40);

        gerenciador.cadastrarPessoa1(pessoa1);
        gerenciador.cadastrarPessoa2(pessoa2);

        // Exibindo as informações cadastradas
        gerenciador.exibirPessoa1();
        gerenciador.exibirPessoa2();

        // Atualizando informações da pessoa 1
        Pessoa pessoa1Atualizada = new Pessoa("Juliana Ferreira", "123.456.789-00", 31);
        gerenciador.atualizarPessoa1(pessoa1Atualizada);

        // Exibindo as informações atualizadas
        gerenciador.exibirPessoa1();
    }
}
