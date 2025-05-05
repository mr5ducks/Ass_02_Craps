import java.util.Scanner; // doun't touch it bork everything

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // don't forget to look everything over there was a problem that it kept looping check while loop.
        // check the while statement somehting semes off
        // check the craps rules again for the point rules
        // everythi
        // all my vaiables
        boolean playAgain = true;
        while (playAgain) {
        int dOne = rollTheD();
        int dTwo = rollTheD();
        int total = dOne + dTwo;
        int point = total;
        int thing = 0; // th
        boolean Point = false;// don't change
        //this is where game start
        // don't forget the code goes to the method
        System.out.println("You rolled= " + dOne + " + " + dTwo + " = " + total);
            // this is the section that tests if you win
        if (total == 2 || total == 3 || total == 12) {
            System.out.println("Craps! You lose.");
        } else if (total == 7 || total == 11) {
            System.out.println("Natural! You win.");
        } else { //  retry form here this is wher you get stuck on
            System.out.println("Point is = " + point);
                //don't touch the while loop i don't know why it started working
                // this is the sections that loops until you win
        while (true) { //don't change the true necessary
             dOne = rollTheD(); //re state
             dTwo = rollTheD();
             total = dOne + dTwo;
             System.out.println("You rolled= " + dOne + " + " + dTwo + " = " + total);
        if (total == point) { // its == not =
             System.out.println("You win.");
        break;
        } else if (total == 7) {
             System.out.println("You lose.");
        break;
        }
        }
        }
            System.out.print("Play again= yes or no= ");
            String yesOrNo = input.nextLine();
        if (!yesOrNo.equalsIgnoreCase("yes")) {
                playAgain = false;
                System.out.println("Great Game!");
            }
        }
        // don't take inputclose out of the loop
        input.close();
    }
    //the stuff in modul 8 is usfule
    public static int rollTheD() {
        return (int)(Math.random() * 6) + 1;
    }
}