package Animal;
import java.util.ArrayList;
import java.util.List;

class Promo {
    private List<Student> students;

    public Promo(List<Student> students) {
        this.students = students;
    }
    public Promo() {
        this.students = new ArrayList<>();
    }

    public List<Student> getStudentList() {
        return this.students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    @Override
    public String toString() {
        return "Promo [students=" + students + "]";
    }
    public static void main(String[] args) {
        Promo promo2024 = new Promo();

        Student student = new Student("Flavien", "CADET");
        Student student2 = new Student("Flavien", "CADET");
        Student student3 = new Student("Flavien", "CADET");

        promo2024.addStudent(student);
        promo2024.addStudent(student2);
        promo2024.addStudent(student3);

        System.out.println(promo2024);
    }
}