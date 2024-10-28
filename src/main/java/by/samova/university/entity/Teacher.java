package by.samova.university.entity;

public class Teacher implements ActionTeacher, ActionAll {
    private String name;
    private String surname;
    private int age;
    private Student st;
    private University univ;

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

    public Student getSt() {
        return st;
    }

    public void setSt(Student st) {
        this.st = st;
    }

    public University getUniv() {
        return univ;
    }

    public void setUniv(University univ) {
        this.univ = univ;
    }

    @Override
    public void teach() {
        System.out.println("Преподаватель " + getName() + " учит студентку " + st.getName() + " в университете " + univ.getTitle());
    }

    @Override
    public void tests() {
        System.out.println("Преподаватель " + getSurname() + ", " + getAge() + " лет, проверяет знания студентки " + st.getName());
    }

    @Override
    public void givesRating() {
        System.out.println("Преподаватель " + getName() + " выставляет оценки по предмету " + univ.getSubject() + " на факультете " + univ.getDepartment());
    }

    @Override
    public void comeLecture() {
        System.out.println("Преподаватель " + getSurname() + " пришёл на лекцию в университет " + univ.getTitle() + " к студентке " + st.getName());
    }

    @Override
    public void comeExam() {
        System.out.println("Преподаватель " + getName() + " принимает экзамен на факультете " + univ.getDepartment() + " по предмету " + univ.getSubject());
    }

    @Override
    public void lunch() {
        System.out.println("Преподаватель " + getSurname() + " пришёл поесть в столовую университета " + univ.getTitle());
    }
}