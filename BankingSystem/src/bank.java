import java.util.Scanner;
public class bank {
    public static void main(String[] args){
        System.out.println("欢迎进入中国工商银行！");
        System.out.println("请输入您的账户：");
        Message personMessage=new Message();
        Scanner in= new Scanner(System.in);
        String id;
        String YourPassword;
        String YourChoose;
        do {
            id = in.next();
            if (personMessage.IDcard.containsKey(id)) {
                System.out.println("请输入登录密码");
                do {
                    YourPassword = in.next();
                    if ((personMessage.IDcard.get(id).getPassword()).equals(YourPassword)) {
                        System.out.println("登录成功！"+"你好,"+personMessage.IDcard.get(id).getName());
                        System.out.println("请选择您要办理的业务");
                        YourChoose=in.next();

                        in.close();


                    } else {
                        System.out.println("密码错误，请重新输入");
                        continue;


                    }
                }while(!(personMessage.IDcard.get(id).getPassword()).equals(YourPassword));


                // System.out.println(in.next());
            } else {
                System.out.println("账号不存在,请重新输入！");
                continue;

            }
        }while (!personMessage.IDcard.containsKey(id));



       // Choose.BusinessChoose(in);

    }

}
