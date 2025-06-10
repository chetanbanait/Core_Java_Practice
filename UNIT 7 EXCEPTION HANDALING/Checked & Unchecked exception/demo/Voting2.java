class Voting2 {
    public static void main(String[] args) {
        int age = 19;
        Voting v = new Voting();
        try {
            v.checkAge(age);
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    void checkAge(int age) {
        if (age >= 18) {
            youCanVote();
        } else {
            throw new RuntimeException("You cannot vote");
        }
    }

    void youCanVote() {
        System.out.println("You can vote successfully");
    }
}
