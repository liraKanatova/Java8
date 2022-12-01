package java8.services.impl;

import java8.classes.Student;
import java8.enums.Gender;
import java8.services.StudentServiceAble;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentServiceAble {
    @Override
    public List<Student> getByName(List<Student> students, String name) {
        ArrayList<Student> students1 = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().equals(name)) {
                students1.add(student);
            }


        }
        return students1;
    }



    @Override
    public List<Student> getBoyGender(List<Student> students) {
        ArrayList<Student> male=new ArrayList<>();
        for (Student student:students){
            if(student.getGender().equals(Gender.MALE)){
                male.add(student);
            }
        }
        return male;
    }

    @Override
    public List<Student> getGirlGender(List<Student> students) {
        ArrayList<Student> female = new ArrayList<>();
        for (Student student : students) {
            if (student.getGender().equals(Gender.FEMALE)) {
                female.add(student);
            }
        }
        return female;
    }
}




