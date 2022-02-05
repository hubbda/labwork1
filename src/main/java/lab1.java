public class lab1 {
    static boolean isPrime(int x) {
        for(int i = 2; i < x; i++)
            if(x%i == 0)
                return false;
        return true;
    }

    static int getSumOfPrimes(int num) {
        int sum = 0;
        for(int i = 2; i <= num; i++)
            if(isPrime(i))
                sum = sum + i;
        return sum;
    }

    static boolean checkDigit(int x, int digit) {
        String str = ""+x;
        return str.contains(""+digit);
    }

    static int getSumOfPrimesWithDigit(int n) {
        int sum = 0;
        for(int i = 2; i <= n; i++)
            if((isPrime(i) &&checkDigit(i, 3)))
                sum = sum + i;
        return sum;
    }
    static int getSumOfPrimesWithTwoDigits(int n) {
        int sum = 0;
        for(int i = 2; i <= n; i++)
            if(isPrime(i) &&checkDigit(i, 3) &&checkDigit(i, 5)) {
                sum = sum + i;
            }
        return sum;
    }

    public static void main(String[] args ) {
        System.out.println(getSumOfPrimes(5));
        System.out.println(getSumOfPrimesWithDigit(15));
        System.out.println(getSumOfPrimesWithTwoDigits(60));
    }
}
