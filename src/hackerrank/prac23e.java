package hackerrank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class prac23e {

    public static void main(String[] args) throws IncorrectFileNameException, IncorrectFileExtensionException {
        getFirstline("src/hackerrank/newfile.txt");
    }

    public static String getFirstline(String fileName) throws IncorrectFileNameException,
            IncorrectFileExtensionException {

        try {
            // System.out.println(new File(fileName));
            Scanner file = new Scanner(new File(fileName));
            if (file.hasNextLine()) {
                return file.nextLine();
            } else {
                throw new IllegalArgumentException("Non readable file");
            }
        } catch (FileNotFoundException e) {
            if(!isCorrectFileName(fileName)){
                throw new IncorrectFileNameException("Incorrect filename : " + fileName);
            }
        }
        catch(IllegalArgumentException e){
            if(!containsExtension(fileName)){
                throw new IncorrectFileExtensionException("Filename does not contain extension : " + fileName, e);
            }
        }

        return "Default";
    }


    private static boolean containsExtension(String fileName) {
        if (fileName.contains(".doc"))
            return true;
        return false;
    }

    
    private static boolean isCorrectFileName(String fileName) {
        if (fileName.equals("wrongFileName.txt"))
            return true;
        else
            return false;
    }
}