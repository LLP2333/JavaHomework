import java.io.*;
public class Example04 {
    public static void main(String[] args)throws Exception {
        //创建文件输入流对象读取指定目录下的文件
       BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:/JavaHomework/Example/source/jdk-16.0.1_windows-x64_bin.exe"));
       BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:/JavaHomework/Example/target/jdk-16.0.1_windows-x64_bin.exe"));
        int len ;
        long beginTime=System.currentTimeMillis();
        while((len=bis.read())!=-1){
            bos.write(len);
        }
        long endTime=System.currentTimeMillis();
        System.out.println("花费时间为："+(endTime-beginTime)+"毫秒");
        bis.close();
        bos.close();


    }
    }
