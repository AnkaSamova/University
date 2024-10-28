package by.samova.university._main;

import by.samova.university.entity.Student;
import by.samova.university.entity.Teacher;
import by.samova.university.entity.University;
import by.samova.university.service.Behavior;

public class _Main {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setName("Anna");
        st1.setAge(35);
        st1.setCity("St. Petersburg");

        Student st2 = new Student();
        st2.setName("Maria");
        st2.setAge(25);
        st2.setCity("Moscow");

        Student st3 = new Student();
        st3.setName("Elena");
        st3.setAge(30);
        st3.setCity("Kazan");

        Teacher teacher1 = new Teacher();
        teacher1.setName("Yauhen");
        teacher1.setSurname("Ilyin");
        teacher1.setAge(28);

        Teacher teacher2 = new Teacher();
        teacher2.setName("Denis");
        teacher2.setSurname("Shevchenko");
        teacher2.setAge(40);

        Teacher teacher3 = new Teacher();
        teacher3.setName("Oleg");
        teacher3.setSurname("Knyazev");
        teacher3.setAge(45);

        University univ1 = new University();
        univ1.setTitle("ItGirlSchool");
        univ1.setDepartment("Backend");
        univ1.setSubject("Java");

        University univ2 = new University();
        univ2.setTitle("Skypro");
        univ2.setDepartment("Frontend");
        univ2.setSubject("JavaScript");

        University univ3 = new University();
        univ3.setTitle("Skillbox");
        univ3.setDepartment("No-Code");
        univ3.setSubject("Tilda");

        st1.setTeacher(teacher1);
        st2.setTeacher(teacher2);
        st3.setTeacher(teacher3);
        st1.setUniv(univ1);
        st2.setUniv(univ2);
        st3.setUniv(univ3);

        teacher1.setSt(st1);
        teacher2.setSt(st2);
        teacher3.setSt(st3);
        teacher1.setUniv(univ1);
        teacher2.setUniv(univ2);
        teacher3.setUniv(univ3);

        univ1.setSt(st1);
        univ2.setSt(st2);
        univ3.setSt(st3);
        univ1.setTeacher(teacher1);
        univ2.setTeacher(teacher2);
        univ3.setTeacher(teacher3);

        Behavior behavior = new Behavior();
        behavior.studies(st1);
        behavior.come(st2);
        behavior.studies(st3);
        behavior.teaching(teacher1);
        behavior.come(teacher2);
        behavior.teaching(teacher3);
    }
}