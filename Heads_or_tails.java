import java.util.Random;

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

    }

    public static void main(String args[]) {
        System.out.println("Tossing a coin...");
        Randomjudge();
    }
}