package java8.services;

import java8.classes.Student;

import java.util.List;

public interface StudentServiceAble {



   List<Student> getByName(List<Student> students,String name);
    List<Student> getBoyGender(List<Student> students);
    List<Student>  getGirlGender(List<Student> students);

}
