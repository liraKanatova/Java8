package java8.classes;

import java8.enums.Gender;
import java8.services.StudentServiceAble;

import java.time.LocalDate;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private Gender gender;
    private LocalDate dataOfBirth;

    public Student(String name, int age, Gender gender, LocalDate dataOfBirth) throws MyException {
        if(!name.matches("[a-zA-Za-яА-Я]*")) {
            throw new MyException("Name can't be a number!");
        }
        else {
            this.name = name;
        }
        if(age < 0){
            throw new MyException("Berilgen san ters san bolso");
        }else {
            this.age = age;
        }
        this.gender = gender;
        LocalDate l = LocalDate.now();
        if(dataOfBirth.isBefore(l)) {
            this.dataOfBirth = dataOfBirth;
        }else {
            throw new MyException("Tuulgan jil tuura emes!");
        }

    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws MyException {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender){
        this.gender = gender;
    }

    public LocalDate getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(LocalDate dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dataOfBirth=" + dataOfBirth +
                '}';
    }


}
