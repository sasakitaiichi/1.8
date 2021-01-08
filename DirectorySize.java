package recursive;
import java.io.File;
import java.util.Scanner;

public class DirectorySize {
    public static void main(String[] args) {
        System.out.println("Enter a directory or a file:");

        Scanner input =new Scanner(System.in);
        String directory = input.nextLine();

        System.out.println(getSize(new File(directory))+"bytes");
    }

    private static long getSize(File file) {
        long size = 0;
        if (file.isFile()) {
            size=file.length();
        }else{
            File[] files=file.listFiles();
            for (int i=0;i<file.length();i++) {
                size+=getSize(files[i]);
            }
        }
        return size;
    }

}
