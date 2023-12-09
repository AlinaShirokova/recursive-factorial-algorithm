public class Factorial {

    public static int recursiveFactorial(int num) {
        if (num == 1 || num == 0) { // because 0!=1
            return 1;
        } else {
            return num * recursiveFactorial(num - 1);
        }
    }
}