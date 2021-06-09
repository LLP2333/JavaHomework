import  java.util.Scanner;
public class Choose {

    //String t;
    public void Choose(Person person,String YourChoose){
        switch(YourChoose){
            case "1":
            {



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




}
