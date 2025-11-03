import java.util.Objects;

public class Lesson {
    private int lessonId;
    private String lessonName;
    private double lessonMinute;

    public Lesson(int lessonNo, String lessonName, double lessonMinute) {
        this.lessonId = lessonNo;
        this.lessonName = lessonName;
        this.lessonMinute = lessonMinute;
    }

    public int getLessonNo() {
        return lessonId;
    }

    public void setLessonNo(int lessonNo) {
        this.lessonId = lessonNo;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public double getLessonMinute() {
        return lessonMinute;
    }

    public void setLessonMinute(int lessonMinute) {
        this.lessonMinute = lessonMinute;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lessonNo=" + lessonId +
                ", lessonName='" + lessonName + '\'' +
                ", lessonMinute=" + lessonMinute +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Lesson lesson = (Lesson) o;
        return lessonId == lesson.lessonId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(lessonId);
    }
}
