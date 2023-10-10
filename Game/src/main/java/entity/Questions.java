package entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Questions {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "question_id")
    private int questionId;
    @Basic
    @Column(name = "question_text")
    private String questionText;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Questions questions = (Questions) o;

        if (questionId != questions.questionId) return false;
        if (!Objects.equals(questionText, questions.questionText))
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = questionId;
        result = 31 * result + (questionText != null ? questionText.hashCode() : 0);
        return result;
    }
}
