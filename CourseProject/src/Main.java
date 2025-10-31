import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Trainer trainer = new Trainer("Selim", "Derdiyok");
        Trainer trainer2 = new Trainer("Hazal", "Kızıl");
        CourseManager courseManager = new CourseManager(trainer);
        CourseInputService inputService = new CourseInputService();
        Student s1 = new Student("Betül","Derdiyok");

        ArrayList<Course> createdCourses = inputService.getDataCourseFromUser();
        trainer.createCourse(courseManager, createdCourses);
        trainer.debugFunction();

        System.out.println("---- All Lessons ----");
        for (Course course : trainer.getCourses()) {
            System.out.println("Course : " + course.getName());
            course.printLesson();
        }

        System.out.println("All of the courses : ");
        courseManager.printAllCourses();
        /*System.out.print("Which course do you want to remove? Enter it's name : ");
        String userCourseName = input.nextLine();
        if(courseManager.removeCourse(userCourseName)) {
            System.out.println(userCourseName + " is removed successfully.");
        }else {
            System.out.println("Course not found");
        }

         */
        System.out.println("---- All Lessons ----");
        for (Course course : trainer.getCourses()){
            System.out.println("Course : " + course.getName());
            course.printCoursesTrainer();
        }

        courseManager.printAllCourses();
        ArrayList<Course> selectedCoursesByStudent = s1.enrollWantedCourse(courseManager);
        for (Course course : selectedCoursesByStudent) {
            courseManager.enrollStudentToCourse(s1,course);
        }

        trainer2.createCourse(courseManager, trainer.getCourses());

        System.out.println("------ The courses  that the student is enrolled in ---");
         for (Course course : s1.enrolledCourses) {
           System.out.println(course.getName());
         }






    }
}
