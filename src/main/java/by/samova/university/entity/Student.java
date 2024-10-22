package by.samova.university.entity;

import by.samova.university.util.ActionAll;
import by.samova.university.util.ActionStudent;

public class Student implements ActionStudent, ActionAll {
    private String name;
    private int age;
    private String city;
    public Teacher teacher;
    public University univ;

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

    @Override
    public void study() {
        System.out.println("Студентка " + getName() + " пришла учиться в университет " + univ.getTitle() + " к преподавателю " + teacher.getName());
    }

    @Override
    public void homework() {
        System.out.println("Студентка " + getName() + " получила ДЗ по предмету " + univ.getSubject() + " от преподавателя " + teacher.getSurname());
    }

    @Override
    public void getsRating() {
        System.out.println("Студентка " + getName() + " из города " + getCity() + ", " + getAge() + " лет, получила оценку на факультете " + univ.getDepartment());
    }

    @Override
    public void comeLecture() {
        System.out.println("Студентка " + getName() + " пришла на лекцию по " + univ.getSubject() + " на факультете " + univ.getDepartment());
    }

    @Override
    public void comeExam() {
        System.out.println("Студентка " + getName() + " пришла на экзамен в университет " + univ.getTitle() + " к преподавателю " + teacher.getName());
    }

    @Override
    public void lunch() {
        System.out.println("Студентка " + getName() + " поела в столовой университета " + univ.getTitle());
    }
}