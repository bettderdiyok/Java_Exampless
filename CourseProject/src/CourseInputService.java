import java.util.ArrayList;
import java.util.Scanner;

public class CourseInputService {
    private Scanner input = new Scanner(System.in);
    public ArrayList<Course> getDataCourseFromUser() {
        String courseName;
        int addedLessonNum;
        System.out.print("How many courses do you want to create? ");
        int courseNum = input.nextInt();
        input.nextLine();

        ArrayList<Course> createdCourses = new ArrayList<>();

        for (int i = 0; i < courseNum; i++) {
            System.out.print("Please enter the course name:");
            courseName = input.nextLine();
            Course course = new Course(courseName);

            System.out.print("How many lessons do you want to add? ");
            addedLessonNum = input.nextInt();
            input.nextLine();
            for (int j = 0; j < addedLessonNum; j++) {
                System.out.print("Please enter the lesson name: ");
                String lessonName = input.nextLine();
                System.out.print("Please enter the lesson minute: ");
                int lessonMinute = input.nextInt();
                input.nextLine();
                Lesson lesson = new Lesson(lessonMinute, lessonName);
                course.getLessons().put(lessonName, lesson);
                course.setTotalTime(course.getTotalTime() + lesson.getTimeMinute());
            }
            createdCourses.add(course);


        }
        return createdCourses;
    }
}
