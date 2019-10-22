import java.util.ArrayList;

/**
 * @author mat
 */
public class Multiples {

    /**
     * Main method of the program which finds the sum of all the multiples of 3 and 5 below 1000
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int counter = 3;

        while (counter <= 1000) {
            if (((counter % 3) == 0) || (counter % 5) == 0) {
                result.add(counter);
            }
            counter++;
        }

        int sum = 0;
        for (int i = 0; i < result.size(); i++) {
            sum += result.get(i);
        }
    }
}
