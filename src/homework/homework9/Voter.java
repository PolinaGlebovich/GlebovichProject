package homework.homework9;

import java.util.Random;

public class Voter {

    public void vote(){
        Random random = new Random();
        int n = random.nextInt(5);
        switch (n){
            case 1:
                RandomCandidate.addVoteCount();
                break;
            case 2:
                IllegalCandidate.addVoteCount();
                break;
            case 3:
                OfficialCandidate.addVoteCount();
                break;
        }
    }


}
