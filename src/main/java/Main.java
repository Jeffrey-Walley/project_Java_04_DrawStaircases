// project 04 Draw Staircases with 'for' loops
/*
 1. enter number of steps and step width
 2. draw step using 'for' loop

 */
public class Main {

    public static void main(String[] args) {
        int numSteps = 15;
        int stepWidth = 5;

        for (int i = 0; i < numSteps; i++) {
            for (int star = 0; star < (i + 1) * stepWidth; star++) {
                System.out.print("*");
            }
            // change to next row
            System.out.println();
        }

    }
}
