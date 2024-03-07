public class Operator {

    public static void main(String[] args) {

        // create variables
        int num1 = 10;
        int num2 = 20;

        // Equal to (==) operator
        boolean isEqual = (num1 == num2);
        System.out.println("num1 is equal to num2: " + isEqual);

        // Not equal to (!=) operator
        boolean isNotEqual = (num1 != num2);
        System.out.println("num1 is not equal to num2: " + isNotEqual);

        // Greater than (>) operator
        boolean isGreaterThan = (num1 > num2);
        System.out.println("num1 is greater than num2: " + isGreaterThan);

        // Less than (<) operator
        boolean isLessThan = (num1 < num2);
        System.out.println("num1 is less than num2: " + isLessThan);

        // Greater than or equal to (>=) operator
        boolean isGreaterThanOrEqual = (num1 >= num2);
        System.out.println("num1 is greater than or equal to num2: " + isGreaterThanOrEqual);

        // Less than or equal to (<=) operator
        boolean isLessThanOrEqual = (num1 <= num2);
        System.out.println("num1 is less than or equal to num2: " + isLessThanOrEqual);
        // ---------------------------------------
        // // && operator
        // System.out.println((6 > 3) && (8 > 6)); // true
        // System.out.println((6 > 3) && (8 < 6)); // false

        // // || operator
        // System.out.println((6 < 3) || (8 > 6)); // true
        // System.out.println((6 > 3) || (8 < 6)); // true
        // System.out.println((6 < 3) || (8 < 6)); // false

        // // ! operator
        // System.out.println(!(6 == 3)); // true
        // System.out.println(!(6 > 3)); // false

    }
}
