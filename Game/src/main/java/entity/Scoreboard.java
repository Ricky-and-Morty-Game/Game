package entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Scoreboard {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "userName")
    private String userName;
    @Basic
    @Column(name = "score")
    private int score;
    @Basic
    @Column(name = "timestamp")
    private Timestamp timestamp;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Scoreboard that = (Scoreboard) o;

        if (id != that.id) return false;
        if (score != that.score) return false;
        if (!Objects.equals(userName, that.userName)) return false;
        if (!Objects.equals(timestamp, that.timestamp)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + score;
        result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
        return result;
    }
}
