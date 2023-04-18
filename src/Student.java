class Student implements Comparable<Student> {
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

//    @Override
//    public int compareTo(Student st) {
//        return -(st.name.compareTo(this.name));
//    }

    @Override
    public int compareTo(Student st) {
        if (st.rollno > this.rollno) {
            return -1;
        } else if (st.rollno < this.rollno) {
            return 1;
        } else return 0;
    }

    @Override
    public String toString() {
        return rollno + " " + name + " " + age;
    }
}
