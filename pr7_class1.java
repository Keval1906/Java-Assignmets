//Created by Keval Hadiyal 21ce038
class pr7_class1 implements Comparable<pr7_class1> {
    String Name;
    int age;
    int javaMarks;
    pr7_class1() {
        Name = null;
        age = 0;
        javaMarks = 0;
    }
    pr7_class1(String name, int age, int javaMarks) {
        this.Name = name;
        this.age = age;
        this.javaMarks = javaMarks;
    }
    public int compareTo(pr7_class1 s) {
        return this.javaMarks - s.javaMarks;
    }public String toString() {
        return String.format("[%s, %d]", Name, javaMarks);
    }
}
