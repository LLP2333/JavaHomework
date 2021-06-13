
import  java.util.Scanner;
public class Choose {

    //String t;
    public void YourChoose(Person person,Scanner in){
           String YourChoose;
           do{
               System.out.println("请选择您要办理的业务(1,存款 2,取款 3,余额 4,修改个人密码 0,退出)");
               YourChoose=in.next();
               System.out.println("选择成功！");
           switch(YourChoose) {
               case "1": {

                   deposit(person, in);
                   break;

               }
               case "2": {
                   withdrawal(person, in);
                   break;
               }
               case "3": {
                   Search(person);
                   break;
               }
               case "4": {
                   ChangePassword(person, in);
                   break;
               }
               case "0": {
                   System.exit(0);
               }
               default: {
                   System.out.println("业务办理失败！");
                   break;
               }
           }



       }while (true);


    }
    //存款
    void deposit(Person person,Scanner in){

        int k=in.nextInt();
        //in.close();
        int t=person.getAccountBalance();
    person.setAccountBalance(t+k);

    }
    //取款
    void withdrawal(Person person,Scanner in)
    {

        int k=in.nextInt();
        //in.close();
        int t=person.getAccountBalance();
        if(k>t){
            System.out.println("余额不足，请重新尝试！");
        }
        else{
            person.setAccountBalance(t-k);
            System.out.println("取款成功");
        }

    }
    void Search(Person person)
    {
        int t=person.getAccountBalance();
        System.out.println("您的余额为"+t);

    }


    void ChangePassword(Person person,Scanner in){
        System.out.println("请输入新密码：");
        String k=in.next();
        System.out.println("请再次确认您的新密码：");
        String t=in.next();
        if(t.equals(k)){
            person.setPassword(k);
            System.out.println("密码修改成功！");
        }
        else{
            System.out.println("两次输入不一致，密码修改失败！");
        }

    }




}
