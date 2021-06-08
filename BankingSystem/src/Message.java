
import java.util.HashMap;
import java.util.Map;
public  class Message {
     Map<String,Person> IDcard=new HashMap<>();
    public  Message(){
        Person person1= new Person();
        Person  person2=new  Person();
        Person  person3=new  Person();
        //张三个人信息
        person1.setName("张三");
        person2.setAge(18);
        person1.setPassword("123456");
        person1.setAccountBalance(2000);
        //李四个人信息
        person2.setName("李四");
        person2.setAge(19);
        person2.setPassword("123456");
        person2.setAccountBalance(1500);
        //王五
        person3.setName("王五");
        person3.setAge(20);
        person3.setPassword("123456");
        person3.setAccountBalance(2400);

        IDcard.put("6217001",person1);
        IDcard.put("6217002",person2);
        IDcard.put("6217003",person3);
    }

    }




