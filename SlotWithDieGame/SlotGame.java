package SlotWithDieGame;

import java.util.Scanner;

public class SlotGame {
    private Die d1;
    private Die d2;
    private Die d3;

    public SlotGame() {
        d1 = new Die();
        d2 = new Die();
        d3 = new Die();
    }

    public void spin() {
        d1.roll();
        d2.roll();
        d3.roll();
    }

    public String getResults() {
        return "Results: " + d1 + " | " + d2 + " | " + d3;
    }

    public boolean isJackpot() {
        return d1.getFaceValue() == d2.getFaceValue() && d2.getFaceValue() == d3.getFaceValue();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SlotGame game = new SlotGame();

        System.out.print("Press Enter to spin!");
        scan.nextLine();

        game.spin();
        System.out.println(game.getResults());

        if (game.isJackpot()) {
            System.out.println("JACKPOT! A Perfect Match!");
        } else {
            System.out.println("No match. Spin again!");
        }

        scan.close();
    }
}

