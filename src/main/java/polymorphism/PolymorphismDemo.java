package polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Tính đa hình
        // Student -> Person

        // Nếu 1 đối tuong được tạo tu class nào thì sẽ chạy trong khôi code cua class do
        Student student = new Student("tuấn", 21);
        student.run();
        Person person =(Person) student;
        person.run();


        // instanceof
        boolean isStudent = person instanceof Student;
        System.out.println("isStudent = " + isStudent);
        if(isStudent)
            ((Student)person).study();
    }

}
