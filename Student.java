public class Student {
    public record student(String name, int grade, int classNum) {
        public String toString() {
            return "student{" + "name='" + name + '\'' + ", grade=" + grade + ", classNum=" + classNum + '}';
        }
    }
}
