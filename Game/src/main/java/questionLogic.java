import java.util.List;

public class questionLogic {
    private String questionText;
    private List<answerLogic> answers;

    public questionLogic(String questionText, List<answerLogic> answers) {
        this.questionText = questionText;
        this.answers = answers;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<answerLogic> getAnswers() {
        return answers;
    }

}
