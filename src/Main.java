import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(100, "Blue", 20));
        al.add(new Student(104, "Yellow", 35));
        al.add(new Student(105, "Blue", 18));
        al.add(new Student(102, "Green", 18));
        al.add(new Student(103, "Blue", 30));
        al.add(new Student(106, "Blue", 32));

        for (Student s : al) {
            System.out.println(s);
        }

        System.out.println("---Sorting by Comparable---");
        System.out.println("Sort by roll number :");
        Collections.sort(al);
        Collections.sort(al);
        al.forEach(s -> System.out.println(s.rollno + " " + s.name + " " + s.age));

        System.out.println("---Sorting by Comparator---");
        System.out.println("Sort by age :");
        Collections.sort(al, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.age - o2.age;
            }
        });
        for (Student s : al) {
            System.out.println(s);
        }

        System.out.println("Sort by name :");
        Collections.sort(al, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        for (Student s : al) {
            System.out.println(s);
        }

        System.out.println("Sorting :");
        Collections.sort(al, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int ageDiff = o1.age - o2.age;
                int nameDiff = o1.name.compareTo(o2.name);
                return (nameDiff == 0) ? ageDiff : nameDiff;
            }
        });
        for (Student s : al) {
            System.out.println(s);
        }

        System.out.println("---Sorting by Lambda Expression---");
        System.out.println("Sort by age :");
        Collections.sort(al, Comparator.comparingInt((Student stu) -> stu.age));
        for (Student s : al) {
            System.out.println(s);
        }

        System.out.println("Sort by name :");
        Collections.sort(al, Comparator.comparing((Student stu) -> stu.name));
        for (Student s : al) {
            System.out.println(s);
        }

        System.out.println("Sort by roll number :");
        Collections.sort(al, Comparator.comparingInt((Student stu) -> stu.rollno));
        for (Student s : al) {
            System.out.println(s);
        }
    }
}