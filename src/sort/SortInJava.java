package sort;

import java.util.Arrays;
import java.util.Comparator;

public class SortInJava {

    static class Student implements Comparable {
        String name;
        int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public int compareTo(Object other) {
            // so sanh this and other
            Student otherStudent = (Student) other;
            // 0 ? this = other
            // 1 ? this > other
            // -1 ? this < other
            if (this.age == otherStudent.age) {
                return 0;
            } else if (this.age > otherStudent.age) {
                return 1;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 2, 3, 7, 8, 5, 9, 5};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        String[] stringArray = {"1", "0000", "22", "d", "l", "k"};
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));

        Student[] students = {new Student("A", 10), new Student("D", 9), new Student("C", 11)};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student before, Student after) {
                // 0 ? before = after
                // 1 ? before > after
                // -1 ? before < after
                if (before.name.equals(after.name)) {
                    return 0;
                }
                return before.name.compareTo(after.name);
            }
        });
        System.out.println(Arrays.toString(students));
    }
}
