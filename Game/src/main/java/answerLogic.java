public class answerLogic {
    private String answerText;
    private boolean isCorrect;

    public answerLogic(String answerText, boolean isCorrect) {
        this.answerText = answerText;
        this.isCorrect = isCorrect;
    }

    public String getAnswerText() {
        return answerText;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

}
