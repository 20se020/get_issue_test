import java.io.FileWriter;
import java.io.IOException;

//Test Class
public class Test{

    //this method writes the given data into the specified file
    //and closes the stream
    static void writeToFile(String greetings,
                            String firstName,
                            String lastName,
                            FileWriter fileWriter) {

        String customizedGreetings = greetings + "! "+
                                     firstName + " " +
                                     lastName;
        try {
            fileWriter.write(customizedGreetings + "\n");
            fileWriter.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }//end writeToFile() method

    //main() method
    public static void main(String[] args) throws IOException {

        //creates a file in append mode and keeps it open
        FileWriter fileWriter = new FileWriter("Files/file.txt", true);
        System.out.println("New line");
        //writeToFile() is called to write data into the file.txt
        writeToFile("Hi", "Mehvish", "Ashiq", fileWriter);
        writeToFile("Hello", "Tahir", "Raza", fileWriter);

   }//end main()

}//end Test class