package homework.homework9;

public class Main {
    
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            Voter voter = new Voter();
            voter.vote();
        }
        printVote();

        test();
    }
    private static void printVote() {
        int firstCount = OfficialCandidate.getVoteCount();
        int secondCount = RandomCandidate.getVoteCount();
        int thirdCount = IllegalCandidate.getVoteCount();

        System.out.println("Count of vote of OfficialCandidate: " + firstCount);
        System.out.println("Count of vote of IllegalCandidate: " + thirdCount);
        System.out.println("Count of vote of RandomCandidate: " + secondCount);
        vote(firstCount, secondCount, thirdCount);
    }
    private static void vote(int firstCount, int secondCount, int thirdCount) {
        if (firstCount > thirdCount && firstCount > secondCount) {
            System.out.println("OfficialCandidate win!");
        } else if (secondCount > firstCount && secondCount > thirdCount) {
            System.out.println("RandomCandidate win!");
        } else if (thirdCount > secondCount && thirdCount > firstCount) {
            System.out.println("IllegalCandidate");
        } else {
            System.out.println("Repeat voting");
        }
    }

    private static void test() {
        OfficialCandidate.setVoteCount(2);
        RandomCandidate.setVoteCount(1);
        IllegalCandidate.setVoteCount(2);
        printVote();
    }
}




































