import java.util.Scanner;
public class bank {
    public void BankSystem(){
        System.out.println("欢迎进入中国工商银行！");
        System.out.println("请输入您的账户：");
        Message personMessage=new Message();
        String id;
        String YourPassword;
        Choose choose=new Choose();
        Scanner in= new Scanner(System.in);

        do {
            id = in.next();

            if (personMessage.IDcard.containsKey(id)) {
                System.out.println("请输入登录密码：");

                do {
                    YourPassword = in.next();

                    if ((personMessage.IDcard.get(id).getPassword()).equals(YourPassword)) {
                        System.out.println("登录成功！"+"你好,"+personMessage.IDcard.get(id).getName());



                        choose.YourChoose(personMessage.IDcard.get(id),in);
                    } else {

                        System.out.println("密码错误，请重新输入！");

                    }
                }while(!(personMessage.IDcard.get(id).getPassword()).equals(YourPassword));


            } else {

                System.out.println("账号不存在,请重新输入！");

            }

        }while (!personMessage.IDcard.containsKey(id));

        in.close();

    }


}
