package by.samova.university.entity;

public class Student implements ActionStudent, ActionAll {
    private String name;
    private int age;
    private String city;
    private Teacher teacher;
    private University university;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    @Override
    public void study() {
        System.out.println("Студентка " + getName() + " пришла учиться в университет " + university.getTitle() + " к преподавателю " + teacher.getName());
    }

    @Override
    public void homework() {
        System.out.println("Студентка " + getName() + " получила ДЗ по предмету " + university.getSubject() + " от преподавателя " + teacher.getSurname());
    }

    @Override
    public void getsRating() {
        System.out.println("Студентка " + getName() + " из города " + getCity() + ", " + getAge() + " лет, получила оценку на факультете " + university.getDepartment());
    }

    @Override
    public void comeLecture() {
        System.out.println("Студентка " + getName() + " пришла на лекцию по " + university.getSubject() + " на факультете " + university.getDepartment());
    }

    @Override
    public void comeExam() {
        System.out.println("Студентка " + getName() + " пришла на экзамен в университет " + university.getTitle() + " к преподавателю " + teacher.getName());
    }

    @Override
    public void lunch() {
        System.out.println("Студентка " + getName() + " поела в столовой университета " + university.getTitle());
    }
}