package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.name ="T";
        player.health = 2;
        player.weapon = "Sword";

        player.loseHealth(1);
        System.out.println("Remaining health = " + player.getHealth());

        player.loseHealth(2);
        System.out.println("Remaining health = " + player.getHealth());
    }
}
