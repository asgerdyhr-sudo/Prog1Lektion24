package Opgave05;

public class Opgave05Test {
    public static void main(String[] args) {

    }

    public int helTalsKvadratrodLinærSøgning(int n) {
        int r = 0;
        while ((r + 1) * (r + 1) <= n) {
            r++;
        }
        return r;
    }

    public int helTalsKvadratrodBinærSøgning(int n) {
        int left = 1;
        int right = n;
        int result = 0;

        if (n == 0) {
            return n;
        }

        while (left <= right) {
            int middel = (left + right) / 2;
            int k = middel;
            if (k == n) {
                return n;
            } else {
                if (k > n) {
                    right = middel - 1;
                } else {
                    left = middel + 1;
                }
            }
        }
        return result;
    }
}
