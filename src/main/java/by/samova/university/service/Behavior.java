package by.samova.university.service;

import by.samova.university.entity.ActionAll;
import by.samova.university.entity.ActionStudent;
import by.samova.university.entity.ActionTeacher;

public class Behavior {
    public void come(ActionAll actionAll) {
        actionAll.comeLecture();
        actionAll.comeExam();
        actionAll.lunch();
    }

    public void studies(ActionStudent actionStudent) {
        actionStudent.study();
        actionStudent.homework();
        actionStudent.getsRating();
    }

    public void teaching(ActionTeacher actionTeacher) {
        actionTeacher.teach();
        actionTeacher.tests();
        actionTeacher.givesRating();
    }
}