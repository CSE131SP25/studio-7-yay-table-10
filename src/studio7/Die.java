package studio7;

import java.util.Random;

class Die {
    private int sides;
    private Random rand;

    public Die(int sides) {
        this.sides = sides;
        this.rand = new Random();
    }

    public int roll() {
        return rand.nextInt(sides) + 1;
    }

    public String toString() {
        return "Die with " + sides + " sides";
    }

    public static void main(String[] args) {
        Die d6 = new Die(6);
        System.out.println(d6);
        System.out.println("Roll: " + d6.roll());
    }
}