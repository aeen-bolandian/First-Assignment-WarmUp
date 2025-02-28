public class Exercises {

    public boolean isPrime(long n) {
        // todo
        if (n == 1)
            return false;
        for(long i = 2; i < n; i++)
        {
            if(n % i == 0)
                    return false;
        }
        return true;
    }


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

    public char[][] generateTriangle(int n) {
        // todo
        char[][] triangle = new char[n][];
        for (int i = 0; i < n; i++) {
            triangle[i] = new char[i + 1];
            triangle[i][0] = '*';
            triangle[i][i] = '*';
            for(int j = 1; j < i; j++) {
                triangle[i][j] = ' ';
            }
        }
        for(int j = 0; j < n; j++)
        {
            triangle[n - 1][j] = '*';
        }
        return triangle;
    }

    public static void main(String[] args) {
        // you can test your code here, but then it should be checked with test cases
    }
}
