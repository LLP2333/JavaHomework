import java.io.*;
public class Example03 {
    public static void main(String[] args)throws Exception{
        //创建文件输入流对象读取指定目录下的文件
        FileInputStream in =new FileInputStream("D:/JavaHomework/Example/source/movie.mp4");
        FileOutputStream out =new FileOutputStream("D:/JavaHomework/Example/target/movie.mp4");
        int x;
        long beginTime =System.currentTimeMillis();
        while((x=in.read())!=-1){
            out.write(x);
        }
        long endTime=System.currentTimeMillis();
        System.out.println("花费时间为："+(endTime-beginTime)+"毫秒");
        in.close();
        out.close();
    }
}
