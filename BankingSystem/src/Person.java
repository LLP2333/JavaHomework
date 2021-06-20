public class Person {
    private String Name;
    private   int  Age;
    private String Password;
    private int  AccountBalance;

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }
    public String getPassword() {
        return Password;
    }

    public int getAccountBalance() {
        return AccountBalance;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setAccountBalance(int accountBalance) {
        AccountBalance = accountBalance;
    }

}
