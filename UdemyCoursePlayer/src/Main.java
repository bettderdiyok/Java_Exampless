import java.util.*;

public class Main {
    public static void main(String[] args) {
            Instructor instructor1 = new Instructor("Jenny", "Honey", "asdfg");
            Instructor instructor2 = new Instructor("Helen", "Red", "ahdjl");
            Course software = new Course("Software", instructor1);
            software.addInstructorToCourse(instructor1);
            Student student1 = new Student("Betty", "Justin", "Java");
            Lesson java = new Lesson(345, "Java", 30.20);
            Lesson python = new Lesson(2235, "Python", 40);
            Lesson c = new Lesson(3234, "C", 25);
            Lesson oop = new Lesson(4542, "OOP", 45);
            Lesson cleanArc = new Lesson(5646, "Clean Architecture", 40);
            software.addLessonToCourse(java);
            software.addLessonToCourse(python);
            software.addLessonToCourse(c);
            software.addLessonToCourse(oop);
            software.addLessonToCourse(cleanArc);

            Course english = new Course("English", instructor2);
            Lesson presentS = new Lesson(1234, "Present Simple", 50.45);
            Lesson pastS = new Lesson(2856, "Past Simple", 20);
            Lesson perfectT = new Lesson(3234, "Perfect Tense", 43);
            english.addLessonToCourse(presentS);
            english.addLessonToCourse(pastS);
            english.addLessonToCourse(perfectT);

            software.removeInstructor(instructor1);
            software.addInstructorToCourse(instructor2);
           // software.removeInstructor(instructor2);
            student1.attendTheCourse(software);

            for(Lesson  lesson : software.getLessonsInTheCourse()) {
                System.out.println(lesson.getLessonName());
            }

            for(Instructor instructor : software.getInstructors()){
                System.out.println(instructor.getName());
            }

            System.out.println(english.isActiveTheCourse());
            Lesson future = new Lesson(2, "future", 40);
            Lesson compsup = new Lesson(3, "ComparativeSuperlative", 25);
            english.addLessonToCourse(future);
            english.addLessonToCourse(compsup);
            System.out.println(english.isActiveTheCourse());
            student1.attendTheCourse(english);
            student1.addLessonsToWatch(python);
            student1.addLessonsToWatch(python);
            student1.addLessonsToWatch(presentS);
            student1.addLessonsToWatch(java);
            student1.addLessonsToWatch(pastS);

            Course androidCourse = new Course("Android Development", instructor1);
            Lesson androidJava = new Lesson(34523, "Android Dev. with Java", 30);
            androidCourse.addLessonToCourse(androidJava);
            student1.attendTheCourse(androidCourse);
            student1.addLessonsToWatch(androidJava);

            playLessonsToWatch(student1.getListLessonsToWatch());

    }

    public static void playLessonsToWatch(LinkedHashSet<Lesson> watchLesson){
        List<Lesson> list = new ArrayList<>(watchLesson);
        ListIterator<Lesson> listIterator = list.listIterator();
        boolean forward = true;

        Scanner input = new Scanner(System.in);
        boolean exit = false;

        if(watchLesson.isEmpty()) {
            System.out.println("Lesson is not added yet");
        } else {
            Lesson lessons = listIterator.next();
            System.out.println("Current lesson : " + lessons.getLessonName() + "\nTime : " + lessons.getLessonMinute());
        }
        showTheMenu();
        while(!exit) {
            System.out.print("Your choice: ");
            int choice  = input.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Exiting the application...");
                    exit = true;
                    break;
                case 1:
                    if (!forward) {
                        forward = true;
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                    }
                    if (listIterator.hasNext()) {
                        Lesson lessons = listIterator.next();
                        System.out.println("Next Lesson Name : " + lessons.getLessonName() + "\nTime : " + lessons.getLessonMinute());
                    } else {
                        System.out.println("There is not lesson anymore");
                    }
                    break;
                case 2:
                    if(forward) {
                        forward = false;
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                    }
                    if(listIterator.hasPrevious()) {
                        Lesson lessons = listIterator.previous();
                        System.out.println("Previous Lesson Name : " + lessons.getLessonName() + "\nTime: " + lessons.getLessonMinute());
                    } else {
                            System.out.println("There is not lesson anymore");
                    }
                    break;



                case 9:
                    showTheMenu();
                    break;

            }
        }
    }

    public static void showTheMenu(){
        System.out.println("----- MENU -----");
        System.out.println("0-Exit\n1-For next lesson\n2-For previous lesson\n3-Show the all list\n9-Menu");



    }


}
