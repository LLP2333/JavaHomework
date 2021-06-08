import java.io.*;
public class Example07 {
    public static void main(String[] args){
        try{
            FileReader fileReader= new FileReader("Example/source/test.txt");
            int len;
            while((len=fileReader.read())!=-1){
                System.out.print((char)len);
            }
            fileReader.close();


        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}
