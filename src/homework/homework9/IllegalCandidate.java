package homework.homework9;

public class IllegalCandidate {

    private static int voteCount;

    public static int getVoteCount() {
        return voteCount;
    }

    public static void addVoteCount() {
        voteCount = voteCount + 1;
    }

    public static void setVoteCount(int voteCount) {
        IllegalCandidate.voteCount = voteCount;
    }
}
