public class Student {
    public record student(String name, int grade, int classNum) {
        public String toString() {
            return "student{" + "name='" + name + '\'' + ", grade=" + grade + ", classNum=" + classNum + '}';
        }
        public boolean isStudentHS(){
            if (student.this.grade >= 9){
                return true;
            }
            return false;
        }

    }
}
