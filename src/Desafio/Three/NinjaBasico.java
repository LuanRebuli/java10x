package Desafio.Three;

public class NinjaBasico implements Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public NinjaBasico(String nome, int idade, String missao, String nivelDificuldade, String statusMissao) {
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
        this.nivelDificuldade = nivelDificuldade;
        this.statusMissao = statusMissao;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nMissão: " + missao + "\nNível de Dificuldade: " + nivelDificuldade + "\nStatus da Missão: " + statusMissao);
    }

    @Override
    public void executarHabilidade() {
        System.out.println(nome + " está executando uma habilidade básica.");
    }
}
