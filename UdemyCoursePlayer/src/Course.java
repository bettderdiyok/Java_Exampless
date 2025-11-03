import java.util.ArrayList;

public class Course {
 private String courseName;
 private ArrayList<Lesson> lessonsInTheCourse;
 private ArrayList<Instructor> instructors;
 private  ArrayList<Student> courseStudents;
 private boolean isActive;

    public Course(String courseName, Instructor headInstructor) {
        this.courseName = courseName;
        lessonsInTheCourse = new ArrayList<>();
        instructors = new ArrayList<>();
        instructors.add(headInstructor);
        courseStudents = new ArrayList<>();
        this.isActive = false;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Student> getCourseStudents() {
        return courseStudents;
    }

    public ArrayList<Lesson> getLessonsInTheCourse() {
        return lessonsInTheCourse;
    }

    public ArrayList<Instructor> getInstructors() {
        return instructors;
    }

    public void addInstructorToCourse(Instructor newInstructor){
        if (!instructors.contains(newInstructor)){
            instructors.add(newInstructor);
            System.out.println(newInstructor.getName() + " added to the course");
        }else {
            System.out.println(newInstructor.getName() + " is already in this course");
        }
    }

    public void removeInstructor(Instructor removeInstructor){
        if(!removeInstructor.getName().equalsIgnoreCase(String.valueOf(instructors.getFirst().getName()))){
            instructors.remove(removeInstructor);
            System.out.println(removeInstructor.getName() + " is removed");
        } else {
            System.out.println(removeInstructor.getName() + " is a headteacher. It can't be removed");
        }

    }

    public void addLessonToCourse(Lesson lesson){
        lessonsInTheCourse.add(lesson);

    }

    public int numberOfLessonInTCourse(){

        return lessonsInTheCourse.size();

    }

    private double totalLessonMinute(){
        double totalMinute = 0;
        for (Lesson lesson : lessonsInTheCourse){
            totalMinute += lesson.getLessonMinute();

        }
        return totalMinute;
    }

    public void addStudentTheCourse(Student student) {
        if(!courseStudents.contains(student)){
            courseStudents.add(student);
            System.out.println(student.getName() + " attended the course");
        } else {
            System.out.println(student.getName() + " is already attended");
        }

    }

    public boolean isActiveTheCourse(){
        if(lessonsInTheCourse.size() >= 5 && totalLessonMinute() >= 60){
            isActive = true;
        }
        return isActive;

    }


}
