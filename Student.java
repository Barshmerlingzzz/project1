
    public record Student(String name, int grade, int classNum) {
        public String toString() {
            return "student{" + "name='" + name + '\'' + ", grade=" + grade + ", classNum=" + classNum + '}';
        }

        public boolean isStudentHS() {
            if (Student.this.grade >= 9) {
                return true;
            }
            return false;
        }

        public Student(String name, int classNum ){
            this(name,9, classNum);
        }
    }
}
