package javaHowTo;

import java.nio.file.Path;
import java.nio.file.Paths;

public class get_Current_DirectoryPath {
    public static void main(String args[]) throws Exception
    {

        // Current Directory path

        String path = System.getProperty("user.dir");
        System.out.println("Working Directory "+ path);

        // Current Directory using Path

        String  path1 = Paths.get("").toAbsolutePath().toString();
        System.out.println("Working path"+ path1);
    }


}
