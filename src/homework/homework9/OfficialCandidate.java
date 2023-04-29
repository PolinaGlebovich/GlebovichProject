package homework.homework9;
//Любимое развлечение белорусов — избирательный участок)
//
//представим что у нас есть классы OfficialCandidate, IllegalCandidate, RandomCandidate – кандидаты на пост председателя кооператива
//и Voter – класс человека, который может голосовать.
//
//Давайте сделаем процесс выбора председателя кооператива, где случайным образом создается 100 объектов класса Voter
// и у них вызывается метод vote, в котором генерируется случайное число (допустим от 1 до 100) и в зависимости от того,
// как вы пропишете логику какому нибудь из кандидатов добавляется голос.
//
//В итоге, нужно вывести в методе main результаты голосования.
public class OfficialCandidate {
    private static int voteCount;

    public static int getVoteCount() {
        return voteCount;
    }

    public static void setVoteCount(int voteCount) {
        OfficialCandidate.voteCount = voteCount;
    }

    public static void addVoteCount() {
        voteCount = voteCount + 1;
    }
}
