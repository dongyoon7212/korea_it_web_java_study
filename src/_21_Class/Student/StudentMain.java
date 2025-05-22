package _21_Class.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "이동윤";
        student.age = 27;
        student.email = "dongyoon7212@naver.com";
        student.address = "부산광역시 ...";

        student.showInfo();
    }
}
