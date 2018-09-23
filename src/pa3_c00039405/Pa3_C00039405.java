// Your Name: Coadiey Bryan
// Your ID: C00039405
// CMPS 260
// Programming Assignment : #3
// Due Date : 2/18/18 
// Program Description: makes a list of user defined length, sums,averages,counts even and odd number of elements, and produces array with reversed elements from initial list
// Certificate of Authenticity:
// I certify that the code in the method function main of this project is entirely my own
// work.
package pa3_c00039405;

/**
 *
 * @author CodyB
 */
public class Pa3_C00039405 {

    // This method receives a parameter giving the size of an array to
    // create, creates the array, fills the elements of the array with 
    // random integer numbers within the range ­size/2 to +size/2, and
    // returns the reference (address) of the array.
    public static int[] makeArray(int size) {
        if (size < 1) {
            return null;
        }
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = (int) (Math.random() * size) - size / 2;
        }
        return a;
    }

    public static int arraySum(int[] array) {
        int i = 0;
        int sum = 0;
        for (; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int arrayAvg(int[] array) {
        int i = 0;
        int sum = 0;
        int avg;
        for (; i < array.length; i++) {
            sum += array[i];
        }
        avg = sum / i;
        return avg;
    }

    public static void arrayEven(int[] array) {
        int i = 0;
        int evenSum = 0;
        for (; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                evenSum += array[i];
            }
        }
    }

    public static void arrayOdd(int[] array) {
        int i = 0;
        int oddSum = 0;
        for (; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddSum += array[i];
            }
        }
    }

    public static int[] arrayReverser(int[] array) {
        int i = 0;
        int[] arrayReversed = new int[array.length];
        for (; i < array.length; i++) {
            arrayReversed[i] = array[array.length - 1 - i];
        }
        return arrayReversed;
    }

    public static void main(String[] args) {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        System.out.println("Please give the size of the array you'd like to start with(integer bigger than 0): ");
        int size = keyboard.nextInt();
        int[] initArray = makeArray(size);
        int sum = arraySum(initArray);
        System.out.printf("The sum of the array elements is %d", sum);
        System.out.println();
        int avg = arrayAvg(initArray);
        System.out.printf("The average of the array elements is %d", avg);
        System.out.println();
        arrayEven(initArray);
        arrayOdd(initArray);
        int[] reversedArray = arrayReverser(initArray);
        int i = 0;
        for (; i < reversedArray.length; i++) {
            System.out.println(initArray[i] + "," + reversedArray[i]);
        }
    }
}
