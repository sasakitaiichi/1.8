package recursive;
import java.util.Scanner;

public class TowersOfHanoi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of disks: ");
        int n =input.nextInt();

        System.out.println("The moves are: ");
        moveDisks(n,'A','B','C');
    }

    private static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
        if (n==1) {
            System.out.println("Move disk "+n+" from "
            +fromTower+" to "+toTower);
        }else {
            moveDisks(n-1,fromTower,auxTower,toTower);
            System.out.println("Move disk "+n+" from "
                    +fromTower+" to "+toTower);
            moveDisks(n-1,auxTower,toTower,fromTower);
        }

    }

}
