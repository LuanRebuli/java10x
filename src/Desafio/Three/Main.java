package Desafio.Three;

public class Main {
    public static void main(String[] args) {
        NinjaBasico Naruto = new NinjaBasico("Naruto", 16, "Invadir aldeia rival", "dificil", "Em progresso");
        Naruto.mostrarInformacoes();

        NinjaAvançado Sasuke = new NinjaAvançado("Sasuke", 17, "Invadir aldeia rival", "dificil", "Em progresso", "Habilidade Especial: Shinrai");
        Sasuke.mostrarInformacoes();
    }
}
