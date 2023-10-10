package entity;

import jakarta.persistence.*;

@Entity
public class Answers {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "answer_id")
    private int answerId;

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    @Basic
    @Column(name = "question_id")
    private Integer questionId;

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    @Basic
    @Column(name = "answer_text")
    private String answerText;

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    @Basic
    @Column(name = "is_correct")
    private byte isCorrect;

    public byte getIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(byte isCorrect) {
        this.isCorrect = isCorrect;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Answers answers = (Answers) o;

        if (answerId != answers.answerId) return false;
        if (isCorrect != answers.isCorrect) return false;
        if (questionId != null ? !questionId.equals(answers.questionId) : answers.questionId != null) return false;
        if (answerText != null ? !answerText.equals(answers.answerText) : answers.answerText != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = answerId;
        result = 31 * result + (questionId != null ? questionId.hashCode() : 0);
        result = 31 * result + (answerText != null ? answerText.hashCode() : 0);
        result = 31 * result + (int) isCorrect;
        return result;
    }
}
