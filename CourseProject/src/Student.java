import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {
    ArrayList<Course>  enrolledCourses;


    public Student(String name, String surname) {
        super(name, surname);
        enrolledCourses = new ArrayList<>();
    }

    public ArrayList<Course> enrollWantedCourse(CourseManager manager){
        Scanner input = new Scanner(System.in);
        ArrayList<Course> selectedList = new ArrayList<>();
        System.out.println("How many courses do you want to enroll?");
        int wantedCourseNumber = input.nextInt();
        input.nextLine();
        boolean found;
        for (int i=0; i<wantedCourseNumber; i++){
            found = false;
            System.out.print("Which course do you want to enroll : ");
            String wantedCoursename = input.nextLine().trim();
            for (Course course: manager.trainer.getCourses()) {
                if(course.getName().equalsIgnoreCase(wantedCoursename)){
                    selectedList.add(course);
                    found = true;
                }
            }
            if(!found) {
                System.out.println("The course \"" + wantedCoursename + "\" does not exist or is inactive!");
            }


        }
        return selectedList;


    }

   /* public void watchEnrolledCourseLesson(){
        if(enrolledCourses.isEmpty()) {
            System.out.println("Firstly, You should enroll a lesson!");
        }

        System.out.println("You enrolled couses : ");
       for(int i=0; i<enrolledCourses.size(); i++) {
           System.out.println((i + 1 + "-" + enrolledCourses.get(i).getName()));
       }

        System.out.println("Select a course : ");

    }



Continue
    */


}


