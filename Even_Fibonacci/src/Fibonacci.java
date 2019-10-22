import java.util.ArrayList;

/**
 * @author mat
 */
public class Fibonacci {

    /**
     * The main method of the program which creates an <code>ArrayList()</code> and stores the even-resulted number of
     * the sum of the first 20 fibonacci numbers.
     * @param args
     */
    public static void main(String[] args) {

        ArrayList<Integer> fib = new ArrayList<Integer>();
        //Create the first two fibonacci numbers
        fib.add(1);
        fib.add(2);

        //Store the first 20 fibonacci numbers in an ArrayList
        for (int i = 1; i < 20; i++) {
            fib.add((fib.get(i) + fib.get(i-1)));
        }

        //Save the result in a second ArrayList
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int j = 1; j < fib.size(); j++) {
            if (((fib.get(j) + fib.get(j-1)) % 2) == 0) {
                result.add((fib.get(j) + fib.get(j-1)));
            }
        }
    }
}
