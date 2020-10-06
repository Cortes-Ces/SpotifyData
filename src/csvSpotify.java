import java.io.*;


/**
 * Class: CISC 3130
 * Section:TY9
 * EmplId:23335766
 * Name:Cesar Cortes
 *
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SpotifyNew {
   public static void main(String[] args) {

       // Read csv Spotify file located on my desktop
       // Download csv file, save on desktop, and add file location in csvFile = " "
       String csvFile = "C:\\Users\\corte\\OneDrive\\Desktop\\viral-global-daily-latest.csv";

       String line = "";
       // created one list to add the all the artist name's of csv file
       List<String> artistList = new ArrayList<String>();
       // Try catch block when reading and opening files
       try {
           BufferedReader br = new BufferedReader(new FileReader(csvFile));
           // Create text file
           File theFile = new File("Artists-Week-Of-09-01-2020.txt");
           PrintStream out = new PrintStream(new FileOutputStream(theFile));
           // While next line is not null parse the line with commas and store it into values array
           while ((line = br.readLine()) != null) {
               String[] values = line.split(",");
               // Print artists name located in [2] to console

               // adding artist name into the list
               // trim method to remove the any white spaces in the starting or ending of the
               // name.
               artistList.add(values[2].trim());

           }
           // Collections.sort will do ascending order of the elements
           Collections.sort(artistList);
           // iterating over the list
           for (String artistName : artistList) {
               // printing sorted artist names into the file
               out.print(artistName + "\n");
               // printing into the console
               System.out.println(artistName);
           }
           // Close PrintStream
           out.close();
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }

   }
}
