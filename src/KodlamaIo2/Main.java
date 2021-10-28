package KodlamaIo2;

public class Main {

    public static void main(String[] args) {


        User user = new User();
        user.setUserName("Merrt.topal");
        user.setFirstName("Mert");
        user.setLastName("Topal");
        user.setDateOfBirth("04.12.2001");
        user.seteMail("merrt.topal@gmail.com");

        UserManager userManager = new UserManager();
        userManager.add(user);
        userManager.remove(user);
        userManager.update(user);

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        Student student = new Student();
        student.setUserName("Merrt.topal");
        student.setFirstName("Mert");
        student.setLastName("Topal");
        student.setDateOfBirth("04.12.2001");
        student.seteMail("merrt.topal@gmail.com");
        student.setSchool("Maltepe Üniversitesi.");

        StudentManager studentManager = new StudentManager();
        studentManager.add(student);
        studentManager.remove(student);
        studentManager.update(student);

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        Instructor instructor = new Instructor();
        instructor.setUserName("Engin.Demirog");
        instructor.setFirstName("Engin");
        instructor.setLastName("Demirog");
        instructor.setDateOfBirth("00.0.0000");
        instructor.seteMail("engindemiroğ.com");
        instructor.setExperiences("Ulastırma Bakanlığı - Yazılım Danısmanlığı - 7 yıl");
        instructor.setDetail("Başken Üniversitesi Mezunu");

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor);
        instructorManager.remove(instructor);
        instructorManager.update(instructor);

    }
}
