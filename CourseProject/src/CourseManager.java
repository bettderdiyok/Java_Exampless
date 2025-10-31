import java.util.Iterator;

public class CourseManager {
    Trainer trainer;
    public CourseManager(Trainer trainer) {
        this.trainer = trainer;
    }

    public boolean removeCourse(String userCourseName){
        Iterator<Course> iterator;
        iterator =trainer.getCourses().iterator();
         while(iterator.hasNext()){
             Course course = iterator.next();
             if(course.getName().equals(userCourseName)){
                 iterator.remove();
                 course.setActive(false);
                 return true;
             }

         }
         return false;
    }

    public void printAllCourses(){
        for (Course course : trainer.getCourses()) {
            System.out.println(course.getName());
        }
    }

    public void enrollStudentToCourse(Student student, Course course){
        Iterator<Course> iterator = trainer.getCourses().iterator();
        boolean found = false;
        if(course == null) {
            System.out.println("⚠️ You tried to enroll in a course that doesn't exist or is inactive!");
            return; //
        } else {
            while(iterator.hasNext()){
                Course current = iterator.next();
                if(current.getName().equals(course.getName())){
                    found = true;
                    if(isActiveTheCourse(current)){
                        if(!current.getStudents().contains(student)) {
                            current.getStudents().add(student);
                            student.enrolledCourses.add(current);
                            System.out.println("The student is enrolled " + current.getName());
                        }else {
                            System.out.println("The student is aldready enrolled to this course");
                        }
                    } else {
                        System.out.println("The course is not active bacuse there are not 5 lessons ...");
                    }
                    break;

                }else {
                    continue;
                }
            }
            if (!found) {
                System.out.println("The course is not found");
            }

        }


    }

    public boolean isActiveTheCourse(Course course){
        return course.getLessonsList().size() >= 5 && course.getTotalTime() > 60;
    }




}


