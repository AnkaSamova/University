package by.samova.university.entity;

public class Teacher implements ActionTeacher, ActionAll {
    private String name;
    private String surname;
    private int age;
    private Student student;
    private University university;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    @Override
    public void teach() {
        System.out.println("Преподаватель " + getName() + " учит студентку " + student.getName() + " в университете " + university.getTitle());
    }

    @Override
    public void tests() {
        System.out.println("Преподаватель " + getSurname() + ", " + getAge() + " лет, проверяет знания студентки " + student.getName());
    }

    @Override
    public void givesRating() {
        System.out.println("Преподаватель " + getName() + " выставляет оценки по предмету " + university.getSubject() + " на факультете " + university.getDepartment());
    }

    @Override
    public void comeLecture() {
        System.out.println("Преподаватель " + getSurname() + " пришёл на лекцию в университет " + university.getTitle() + " к студентке " + student.getName());
    }

    @Override
    public void comeExam() {
        System.out.println("Преподаватель " + getName() + " принимает экзамен на факультете " + university.getDepartment() + " по предмету " + university.getSubject());
    }

    @Override
    public void lunch() {
        System.out.println("Преподаватель " + getSurname() + " пришёл поесть в столовую университета " + university.getTitle());
    }
}