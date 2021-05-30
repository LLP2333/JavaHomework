public class StudentMessage {

        static String school = "河南师范大学";
        private String studentName;//姓名
        private Long studentNumber;//学号
        private double Score;//成绩
        private int studentAge;//年龄
        private  Long   phoneNumber;//联系方式

        // 学生姓名
        public String getStudentName() {
            return this.studentName;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }
        //学生年龄

    public int getStudentAge(){
            return studentAge;
    }
    public void setStudentAge(int studentAge){
        this.studentAge=studentAge;
    }

        // 学生学号
        public Long getStudentNumber() {
            return this.studentNumber;
        }

        public void setStudentNumber(Long studentNumber) {
            this.studentNumber = studentNumber;
        }

        // 学生成绩
        public double getScore() {
            return this.Score;
        }

        public void setScore(double Score) {
            this.Score = Score;

        }
        //联系方式
    public Long getPhoneNumber(){
            return phoneNumber;
    }
    public void setPhoneNumber(Long phoneNumber){
            this.phoneNumber=phoneNumber;

    }
    //自我介绍
    public void Introduce(){
       System.out.println("大家好，我是一名来自"+school+"的学生。");
       System.out.println("我的名字是"+studentName+"，今年"+studentAge+"岁了。");
       System.out.println("我的学号是："+studentNumber+",联系方式为："+phoneNumber);

    }
    public void work(){
            System.out.println("学生"+studentName+"正在上课.....");
    }


}
