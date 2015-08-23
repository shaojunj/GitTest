import java.io.File;
import java.io.IOException;
public class FileDemo {
    public static void main(String args[]){
        File f = new File("d:" + File.separator + "test.txt");
        if(f.isDirectory()){
            System.out.println(f + " 是目录");
        }
        else{
            System.out.println(f+ " 不是目录");
        }        
    }
}