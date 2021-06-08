import java.io.*;
public class Example04 {
    public static void main(String[] args)throws Exception {
        //创建文件输入流对象读取指定目录下的文件
       BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:/JavaHomework/Example/source/movie.mp4"));
       BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:/JavaHomework/Example/target/movie.mp4"));
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
/**
 * 利用I/O包中的BufferedInputStream和BufferedOutputStream，先将源文件的部分数据读入字节缓冲流，读入数据一定程度后再写入到目标文件位置
 * 与上一种方法相比，这种方法降低了内存与目标文件的数据交换频率，复制的速度更快
 */
