public class Divisors {

    // Returns the greatest common divisor of a and b.
    public static int gcd(int a, int b) {
        int absA = Math.abs(a);
        int absB = Math.abs(b);
        if (absA == 0 || absB == 0) {
            if (absA == 0)
                return absB;
            else
                return absA;
        }

        int r = absA % absB;
        while (r != 0) {
            absA = absB;
            absB = r;
            r = absA % absB;
        }
        return absB;
    }

    // Returns the least common multiple of a and b.
    public static int lcm(int a, int b) {
        if (a == 0 || b == 0)
            return 0;
        return Math.abs(a) * Math.abs(b) / gcd(a, b);
    }

    // Returns true if a and b are relatively prime; false otherwise.
    public static boolean areRelativelyPrime(int a, int b) {
        return gcd(a, b) == 1;
    }

    // Returns the number of integers between 1 and n that are
    // relatively prime with n.
    public static int totient(int n) {
        if (n < 0)
            return 0;

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt = areRelativelyPrime(i + 1, n) ? cnt + 1 : cnt;
        }
        return cnt;
    }

    // Takes two integer command-line arguments a and b and prints
    // each function, evaluated in the format (and order) given below.
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        String tmp = a + "," + b;

        System.out.println("gcd(" + tmp + ") = " + gcd(a, b));
        System.out.println("lcm(" + tmp + ") = " + lcm(a, b));
        System.out.println("areRelativelyPrime(" + tmp + ") = " + areRelativelyPrime(a, b));
        System.out.println("totient(" + a + ") = " + totient(a));
        System.out.println("totient(" + b + ") = " + totient(b));
    }
}