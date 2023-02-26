/**
 *
 * Given a Matrix of Integers, reduce all the rows in a simple Array
 *
 */
public class FlattenedMatrix {
    
    public static void main(String[] args) {
        Integer[][] array = { {7, 8, 9, -3, 14, 21}, {0, 1, 2, 3}, {2, 5, 25, 8}, {1, 4, 7}};
        print(flatMap(array));
    }

    public static Integer[] flatMap(Integer[][] array) {
        Integer size = 0;
        for(Integer[] row : array) size += row.length;

        Integer[] flat = new Integer[size];
        for(int i = 0, n = 0; i < array.length; i++)
            for(int j = 0 ; j < array[i].length; j++, n++)
                flat[n] = array[i][j];
        return flat;
    }

    public static void print(Integer[] array) {
        System.out.println("Flattened matrix ");
        for(Integer data : array) System.out.println(data);
    }
}
