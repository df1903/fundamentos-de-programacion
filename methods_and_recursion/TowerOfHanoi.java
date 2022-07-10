/** 6) Tower of Hanoi: move N disks from rod A to rod C using rod B
 *  as help. A big disk can never be over a smaller one. */

// imports
import java.util.Scanner;

public class TowerOfHanoi {

    public static void hanoi(int disks, char from, char to, char help) {
        if (disks == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }
        hanoi(disks - 1, from, help, to);
        System.out.println("Move disk " + disks + " from " + from + " to " + to);
        hanoi(disks - 1, help, to, from);
    }

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int disks = 0;

        // data entry
        System.out.print("How many disks? ");
        disks = in.nextInt();

        // show results
        hanoi(disks, 'A', 'C', 'B');
        System.out.println("Total moves: " + ((1 << disks) - 1));
    }
}
