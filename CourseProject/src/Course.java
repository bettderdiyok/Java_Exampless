import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
public class Course {
    private String name;
    private TreeMap<String,Lesson> lessonsList;
    private ArrayList <Student> students;
    private ArrayList <Trainer> trainerList;
    private boolean isActive;
    private int totalTime;

    public Course(String name) {
        this.name = name;
        this.isActive = true;
        this.lessonsList = new TreeMap<>();
        students = new ArrayList<>();
        trainerList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeMap<String, Lesson> getLessons() {
        return lessonsList;
    }

    public void setLessons(TreeMap<String, Lesson> lessons) {
        this.lessonsList = lessons;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }


    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public TreeMap<String, Lesson> getLessonsList() {

        return lessonsList;
    }

    public void setLessonsList(TreeMap<String, Lesson> lessonsList) {
        this.lessonsList = lessonsList;
    }

    public ArrayList<Trainer> getTrainerList() {
        return trainerList;
    }

    public void setTrainerList(ArrayList<Trainer> trainerList) {
        this.trainerList = trainerList;
    }

    public void printLesson(){
        Iterator<Map.Entry<String, Lesson>> iterator = lessonsList.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Lesson> entry = iterator.next();
            Lesson lesson = entry.getValue();
            System.out.println(lesson.getName() + "->" + lesson.getTimeMinute() + " minute ");

        }


    }
    public void printCoursesTrainer(){
       if (trainerList.isEmpty()){
           System.out.println("No trainers assigned to this course yet.");
       }else {
           for(Trainer trainer : trainerList) {
               System.out.println("_" + trainer.getName() + trainer.getSurname());
           }
       }

    }

}
