import java.util.*;
import java.io.*;
import java.math.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {

            int highestMountain = -1;
            int indexOfHighestMountain = -1;

            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain.
                
                if(mountainH > highestMountain){
                    highestMountain = mountainH;
                    indexOfHighestMountain = i;
                }

            }

            System.out.println(indexOfHighestMountain); // The index of the mountain to fire on.
        }
    }
}