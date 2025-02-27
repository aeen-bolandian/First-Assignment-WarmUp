public class Exercises {

    /*
        complete this function to check if the input number is prime or not
     */
    public boolean isPrime(long n) {
        // todo
        if (n == 1)
            return true;
        for(long i = 2; i <= n; i++)
        {
            if(n % i == 0)
                    return true;
        }
        return false;
    }

    /*
        implement an algorithm to find out the index of input number in a fibonacci sequence starting from 0, 1
        e.g. 0, 1, 1, 2, 3, 5, ...
        indices start from 0, e.g. 3 is the index 4 of this sequence
        if the input is not a fibonacci number with description above, return -1
     */
    public long fibonacciIndex(long n) {
        // todo
        int first = 0;
        int second = 1;
        int temp = 0;
        int counter = 2;
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        while (temp < n)
        {
            temp = first + second;
            first = second;
            second = temp;
            if(temp == n)
                return counter;
            counter++;
        }
        return -1;
    }

    /*
        you should create a triangle with "*" and return a two-dimensional array of characters based on that
        the triangle's area is empty, which means some characters should be " "

        example 1, input = 3:
        *
        **
        ***

        example 2, input = 5:
        *
        **
        * *
        *  *
        *****

        the output has to be a two-dimensional array of characters, so don't just print the triangle!
     */
    public char[][] generateTriangle(int n) {
        // todo
        return null;
    }

    public static void main(String[] args) {
        // you can test your code here, but then it should be checked with test cases
    }
}
