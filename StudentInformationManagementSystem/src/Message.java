public class Message {

        static String school = "河南师范大学";
        private String stuName;
        private int stuNumber;
        private double Score;

        // 学生姓名
        public String getStudentName() {
            return this.stuName;
        }

        public void setStudentName(String stuName) {
            this.stuName = stuName;
        }

        // 学生学号
        public int getStudentNumber() {
            return this.stuNumber;
        }

        public void setStudentNumber(int stuNumber) {
            this.stuNumber = stuNumber;
        }

        // 学生成绩
        public double getScore() {
            return this.Score;
        }

        public void setScore(double Score) {
            this.Score = Score;

        }


}
