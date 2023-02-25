
/**
 *
 * Given two numbers, calculate multiplicatión without using the multiplication operator
 *
 */
public class Multiply {
    
    public static void main(String[] args) {
        System.out.println(multiply(30, -25));
    }

    public static Integer multiply(Integer a, Integer b) {
        Boolean isPositive = b == Math.abs(b);
        Integer answer = 0;
        for(int i = 0; i < Math.abs(b); i++)
            answer = isPositive ? answer + a : answer -a;
        return answer;
    }

}
