
    public record Student(String name, int grade, int classNum) {

        private static final int GRADE_TET = 9;


        public String toString() {
            return "student{" + "name='" + name + '\'' + ", grade=" + grade + ", classNum=" + classNum + '}';
        }

        public boolean isStudentHS() {
            return grade >= GRADE_TET;
        }

        public Student(String name, int classNum ){
            this(name,GRADE_TET, classNum);
        }
    }

