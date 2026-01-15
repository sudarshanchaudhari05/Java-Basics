class OddNumber {
    static boolean isOdd(int num) {
        return num % 2 != 0;
    }
    
    public static void main(String[] args) {
        int number = 15; // Example number
        if (isOdd(number)) {
            System.out.println(number + " is an odd number.");
        } else {
            System.out.println(number + " is an even number.");
        }
    }
}
