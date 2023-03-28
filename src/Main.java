import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int[] nums = new int[10];
        int points =0;
        int tries = 0;
        int randNum;
        int userNum;
        while (tries < 10){

            try{
                System.out.println("Enter a number between 1 and 10");
                userNum = sc.nextInt();
                sc.nextLine();
                randNum = rand.nextInt(10) + 1;
                if (userNum == randNum){
                    points = points + 1;
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Wrong");
                }
                tries = tries + 1;
            }
            catch(Exception e) {
                System.out.println("Please enter a number, not anything else");
                System.out.println(e);
                sc.nextLine();
            }
        }
    }
}