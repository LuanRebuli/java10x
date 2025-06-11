package Desafio.DesafioTwo;

public class Main extends Ninja {
    public static void main(String[] args) {
        Ninja Uchiha = new Ninja();

        Uchiha.name = "Sasuke Uchiha";
        Uchiha.age = 17;
        Uchiha.mission = "Revenge against the Uchiha clan";
        Uchiha.difficultyLevel = "High";
        Uchiha.statusOfMission = "In progress";
        Uchiha.showInfos();
    }
}
