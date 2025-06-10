class SumOfAllPrimeNos {
    public static void main(String[] args) {
        int sum = 0;
        for (int no = 2; no <= 100; no++) {
            boolean isPrime = true;

            for (int i = 2; i <= no / 2; i++) {
                if (no % i == 0) {
                    isPrime = false;
                    break;  // Exit early if not prime
                }
            }

            if (isPrime) {
                sum += no;
            }
        }
        System.out.println("Sum of all prime numbers from 2 to 100 is: " + sum);
    }
}
