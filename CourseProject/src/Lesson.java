public class Lesson {
    private String name;
    private Integer timeMinute;
    private boolean watched;



    public Lesson(int timeMinute, String name) {
        this.timeMinute = timeMinute;
        this.name = name;
        this.watched = false;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTimeMinute() {
        return timeMinute;
    }

    public void setTimeMinute(Integer timeMinute) {
        this.timeMinute = timeMinute;
    }



}


