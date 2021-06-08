public class Main {
    public static void main(String[] args){
        StudentMessage person=new StudentMessage();
        person.setStudentName("李华");
        person.setStudentAge(18);
        person.setStudentNumber(2028324153L);
        person.setPhoneNumber(15136756309L);
        
        person.Introduce();
        person.work();
    }



}
