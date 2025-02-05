import java.io.FileWriter; 
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;  
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileWriterReader
{
    public void write(String fileName, String content)
    {
        try
        {
            FileWriter fw = new FileWriter(fileName);
            fw.write(content);
            fw.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void read(File txt)
    {
        try 
        {
            File myObj = txt;
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()) 
            {
              String data = myReader.nextLine();
              System.out.println(data);
            }
            myReader.close();
          } 
        catch (FileNotFoundException e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public int countCharacters(String fileName) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader (fileName));
        int count = 0;
        while(br.ready())
        {
            br.read();
            count++;
        }
        br.close();
        return count;
    }
    public static void main(String[] args){
        String Ari = "I Like Ari";
        write("arilover12.txt", Ari);
        File obj = new File("randomText.txt");
        read(obj);
    }
}
