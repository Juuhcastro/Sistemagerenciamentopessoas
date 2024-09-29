
public class GerenciadorDePessoas {
    // Atributos para armazenar duas pessoas
    private Pessoa pessoa1;
    private Pessoa pessoa2;

    // Métodos para cadastrar pessoas
    public void cadastrarPessoa1(Pessoa pessoa) {
        this.pessoa1 = pessoa;
        System.out.println("Pessoa 1 cadastrada com sucesso.");
    }

    public void cadastrarPessoa2(Pessoa pessoa) {
        this.pessoa2 = pessoa;
        System.out.println("Pessoa 2 cadastrada com sucesso.");
    }

    // Métodos para atualizar as informações das pessoas
    public void atualizarPessoa1(Pessoa pessoa) {
        this.pessoa1 = pessoa;
        System.out.println("Pessoa 1 atualizada com sucesso.");
    }

    public void atualizarPessoa2(Pessoa pessoa) {
        this.pessoa2 = pessoa;
        System.out.println("Pessoa 2 atualizada com sucesso.");
    }

    // Métodos para exibir as informações das pessoas
    public void exibirPessoa1() {
        if (pessoa1 != null) {
            System.out.println("Pessoa 1: Nome = " + pessoa1.getNome() + ", CPF = " + pessoa1.getCpf() + ", Idade = " + pessoa1.getIdade());
        } else {
            System.out.println("Pessoa 1 não cadastrada.");
        }
    }

    public void exibirPessoa2() {
        if (pessoa2 != null) {
            System.out.println("Pessoa 2: Nome = " + pessoa2.getNome() + ", CPF = " + pessoa2.getCpf() + ", Idade = " + pessoa2.getIdade());
        } else {
            System.out.println("Pessoa 2 não cadastrada.");
        }
    }
}
