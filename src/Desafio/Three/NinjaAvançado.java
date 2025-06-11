package Desafio.Three;

public class NinjaAvançado implements Ninja{
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;
    String habilidadeEspecial;

    public NinjaAvançado(String nome, int idade, String missao, String nivelDificuldade, String statusMissao, String habilidadeEspecial) {
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
        this.nivelDificuldade = nivelDificuldade;
        this.statusMissao = statusMissao;
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nMissão: " + missao + "\nNível de Dificuldade: " + nivelDificuldade + "\nStatus da Missão: " + statusMissao + "\nHabilidade Especial: " + habilidadeEspecial);
    }

    public void executarHabilidade() {
        System.out.println(nome + " está executando uma habilidade avançada.");
    }
}
