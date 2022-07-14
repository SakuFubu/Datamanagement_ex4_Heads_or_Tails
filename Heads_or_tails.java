import java.util.Random;
import java.util.Scanner;

class Heads_or_tails {

    static void Randomjudge() {
        int Hcount = 0;
        int Tcount = 0;
        String[] hands = { "Heads", "Tails" };
        Random r = new Random();
        for (int i = 1; i <= 3; i++) {
            String hand = hands[r.nextInt(2)];
            if (hand.equals("Heads")) {
                Hcount++;
            } else if (hand.equals("Tails")) {
                Tcount++;
            }
            System.out.print("Round " + i + ": ");
            System.out.println(hand);
        }
        System.out.print("Heads: " + Hcount + ", ");
        System.out.println("Tails: " + Tcount);
        if (Hcount > Tcount) {
            System.out.println("You win!");
        } else {
            System.out.println("You lost");
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Who are you?");
        System.out.print(">");
        String user_name = sc.next();
        System.out.println("Hello, " + user_name + "!");

        System.out.println("Tossing a coin...");
        Randomjudge();
    }
}