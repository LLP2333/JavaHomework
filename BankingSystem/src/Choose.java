import java.util.Map;
import  java.util.Scanner;
public class Choose {

    //String t;
    public void YourChoose(Person person,String YourChoose,String id,Map IDcard){
       while(true){
           switch(YourChoose){
                  case "1": {

                      deposit(person);
                      break;

                  }
                  case "2": {
                      withdrawal(person);
                      break;
                  }
                  case "3": {
                      Search(person);
                      break;
                  }
                  case "4": {
                      ChangePassword(id, IDcard);
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
       }


    }
    //存款
    void deposit(Person person){
        Scanner in=new Scanner(System.in);
        int k=in.nextInt();
        in.close();
        int t=person.getAccountBalance();
    person.setAccountBalance(t+k);

    }
    //取款
    void withdrawal(Person person)
    {
        Scanner in=new Scanner(System.in);
        int k=in.nextInt();
        in.close();
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


    void ChangePassword(String id,Map IDcard){
        System.out.println("请输入新密码");
        Scanner in=new Scanner(System.in);
        String k=in.next();
        in.close();
        IDcard.put(k,IDcard.remove(id));
        System.out.println("密码修改成功！");
    }




}
