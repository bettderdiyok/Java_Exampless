import java.util.ArrayList;
import java.util.LinkedHashSet;


public class Student extends Person {
    private ArrayList<Course> coursesAttendStudent;
    private LinkedHashSet<Lesson> listLessonsToWatch;

    public Student(String name, String userName, String introductionText) {
        super(name, userName, introductionText);
        coursesAttendStudent = new ArrayList<>();
        listLessonsToWatch = new LinkedHashSet<>();
    }

    public ArrayList<Course> getCoursesAttendStudent() {
        return coursesAttendStudent;
    }

    public void setCoursesAttendStudent(ArrayList<Course> coursesAttendStudent) {
        this.coursesAttendStudent = coursesAttendStudent;
    }

    public LinkedHashSet<Lesson> getListLessonsToWatch() {
        return listLessonsToWatch;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "coursesAttendStudent=" +
                '}';
    }

    public void attendTheCourse(Course course) {
        if (course.isActiveTheCourse()) {
            course.addStudentTheCourse(this);
            getCoursesAttendStudent().add(course);

        } else {
            System.out.println(course.getCourseName() + " is not active!");
        }
    }

    public void addLessonsToWatch(Lesson watchedLesson) {
        boolean found = false;
        Course foundCourse = null;
        if (!getCoursesAttendStudent().isEmpty()) {
            for (Course course : getCoursesAttendStudent()) {
                if (course.getLessonsInTheCourse().contains(watchedLesson)) {
                    found = true;
                    foundCourse = course;
                    break;
                }
            }
            if (!found) {
                System.out.println("There is not this lesson in the course");
            } else {
                boolean added = listLessonsToWatch.add(watchedLesson);
                if (added) {
                    System.out.println("\"" + watchedLesson.getLessonName()
                            + "\" added to the watch list (from \"" + foundCourse.getCourseName() + "\").");
                } else {
                    System.out.println(watchedLesson.getLessonName() + " is already this lesson in the watch list.");
                }
                }


            }
        }
    }




