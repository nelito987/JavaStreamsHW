import java.io.*;

public class _4_CopyJpg {
    public static void main(String args[]){

        try {

            File sourceFile=new File("res/minion.jpg");
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile), 4096);
            File targetFile = new File("res/my-copied-picture.jpg");
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetFile), 4096);
            int theChar;
            while ((theChar = bis.read()) != -1) {
                bos.write(theChar);
            }
            bos.close();
            bis.close();
            System.out.println ("copy done!");

        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
