/**
 * @author mat
 * Program to reverse a given integer
 */
public class Reverse_Int {
    public static void main(String[] args) {
        int numbToReverse = 12345;
        System.out.println("The number to reverse: " + numbToReverse);
        int length = String.valueOf(numbToReverse).length();
        int[] reversed = new int[length];
        while (numbToReverse >= 10) {
            for(int i = 0; i < length; i++) {
                reversed[i] = numbToReverse % 10;
                numbToReverse = numbToReverse / 10;
            }
        }

        //Give out the reversed int
        System.out.print("Reversed: ");
        for(int j : reversed) {
            System.out.print(j + "");
        }
    }
}
