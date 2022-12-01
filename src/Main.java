import java8.classes.MyException;
import java8.classes.Student;
import java8.enums.Gender;
import java8.services.StudentServiceAble;
import java8.services.impl.StudentServiceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alex", 22, Gender.MALE, LocalDate.of(2022, 11, 10)));
        students.add(new Student("Alina", 20, Gender.FEMALE, LocalDate.of(2002, 8, 5)));
        students.add(new Student("Alen", 23, Gender.MALE, LocalDate.of(1999, 4, 9)));
        students.add(new Student("Arina", 19, Gender.FEMALE, LocalDate.of(2003, 9, 1)));
        students.add(new Student("Arina", 18, Gender.FEMALE, LocalDate.of(2004, 9, 1)));
        Scanner scanner = new Scanner(System.in);
        StudentServiceImpl student = new StudentServiceImpl();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("1 ByName,2 BoyGender,3 GirlGender ");
        while (true) {
            switch (scanner1.nextInt()) {
                case 1:
                    System.out.println(student.getByName(students, scanner.nextLine()));
                    break;
                case 2:
                    System.out.println(student.getBoyGender(students));
                    break;
                case 3:
                    System.out.println(student.getGirlGender(students));
                    break;
                default:
                    System.out.println("Mindai method jok");
            }
        }
    }

    }
