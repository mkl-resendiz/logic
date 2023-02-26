
/**
 *
 * Given a list of Integers, print the largest number
 *
 */
public class MaxNumber {
    
    public static void main(String[] args) {

        Integer[] array = { 105, 94, 17, 84, 103, 35, 104, 107};
        System.out.println("Data 1.- Second largest is " + search(array));

        array = new Integer[] { 105, 94, 17, 84, 107, 35, 104, 102};
        System.out.println("Data 2.- Second largest is " + search(array));

        array = new Integer[] { 107, 94, 17, 84, 103, 35, 104, 105};
        System.out.println("Data 3.- Second largest is " + search(array));


        array = new Integer[] { 105, 94, 17, 84, 103, 35, 104, 105};
        System.out.println("Data 4.- Second largest is " + search(array));
    }

    public static Integer search(Integer[] array) {
        Integer max = array[0];
        for(int i = 1; i < array.length; i++)
            if(array[i] > max) max = array[i];
        return max;
    }
}