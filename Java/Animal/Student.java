package Animal;

public class Student {

    private String firstname;
    private String lastname;

    public Student(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Student [firstname=" + firstname + ", lastname=" + lastname + "]";
    }

}
