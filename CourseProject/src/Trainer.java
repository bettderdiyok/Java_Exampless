import java.util.ArrayList;

public class Trainer extends Person{
    private ArrayList<Course> courses;

    public Trainer(String name, String surname) {
        super(name, surname);
        courses = new ArrayList<>();
    }

    private Course findCourseSameName(String courseName) {
        for (Course course : courses) {
            if (course.getName().equalsIgnoreCase(courseName)) {
                return course;
            }
        }
        return null;
    }

    public void createCourse(CourseManager manager, ArrayList<Course> newCourse) {
        for (Course course : newCourse) {
            Course existingCourse = findCourseSameName(course.getName());

            if (existingCourse == null) {
                course.getTrainerList().add(this);

            if (manager.isActiveTheCourse(course)) {
                course.setActive(true);
                courses.add(course);
            } else {
                course.setActive(false);
            }
        }

            else {
                    if(!existingCourse.getTrainerList().contains(this)) {
                        course.getTrainerList().add(this);
                        System.out.println("Trainer added to existing course: " + existingCourse.getName());
                        }else {
                        System.out.println("The trainer is already added.");
                    }
                }
        }

    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public  void  debugFunction(){
        for (Course coursse : courses){
            System.out.println("Debug -> " + coursse.getName());
        }
    }
}
