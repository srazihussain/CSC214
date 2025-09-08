import java.util.ArrayList;

public class Factorizer {

    public ArrayList<Integer> primeFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        if (n <= 1) return factors;

        int x = n;
        while (x % 2 == 0) {
            factors.add(2);
            x /= 2;
        }

        for (int p = 3; p * p <= x; p += 2) {
            while (x % p == 0) {
                factors.add(p);
                x /= p;
            }
        }

        if (x > 1) factors.add(x);
        return factors;
    }

    public boolean isPrime(int n) {
        if (n <= 1) return false;
        ArrayList<Integer> f = primeFactors(n);
        return f.size() == 1 && f.get(0) == n;
    }

    public boolean isComposite(int n) {
        return n > 1 && !isPrime(n);
    }

    public String reduce(int numerator, int denominator) {
        if (denominator == 0) return "undefined";
        if (numerator == 0) return "0";
        boolean neg = (numerator < 0) ^ (denominator < 0);
        int a = Math.abs(numerator);
        int b = Math.abs(denominator);
        ArrayList<Integer> top = primeFactors(a);
        ArrayList<Integer> bottom = primeFactors(b);
        int gcd = 1;
        for (int i = 0; i < top.size(); i++) {
            int p = top.get(i);
            int idx = bottom.indexOf(p);
            if (idx != -1) {
                gcd *= p;
                bottom.remove(idx);
            }
        }
        int numRed = a / gcd;
        int denRed = b / gcd;
        String sign = neg ? "-" : "";
        if (denRed == 1) return sign + numRed;
        return sign + numRed + "/" + denRed;
    }

    public static void main(String[] args) {
        Factorizer f = new Factorizer();
        System.out.println(f.primeFactors(0));
        System.out.println(f.primeFactors(1));
        System.out.println(f.primeFactors(9));
        System.out.println(f.primeFactors(10));
        System.out.println(f.isPrime(36));
        System.out.println(f.isPrime(17));
        System.out.println(f.isComposite(12));
        System.out.println(f.isComposite(1));
        System.out.println(f.reduce(36, 12));
        System.out.println(f.reduce(12, 14));
        System.out.println(f.reduce(12, 37));
        System.out.println(f.reduce(-12, 14));
    }
}
