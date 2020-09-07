import java.io.*;


/**
 * Class: CISC 3130
 * Section:TY9
 * EmplId:23335766
 * Name:Cesar Cortes
 *
 * I tried creating a 2D Java array.
 * This was the best I could do.
 * I need to further refresh my memory on 2d arrays
 */
public class csvSpotify
{
    public static void main(String[]args) {

        // Read csv Spotify file located on my desktop
        // Download csv file, save on desktop, and add file location in csvFile = " "
        String csvFile = "C:\\Users\\corte\\OneDrive\\Desktop\\viral-global-daily-latest.csv";



        String line = "";

            // Try catch block when reading and opening files
            try {
                BufferedReader br = new BufferedReader(new FileReader(csvFile));
                // Create text file
                File theFile = new File("Artists-Week-Of-09-01-2020.txt");
                PrintStream out = new PrintStream(new FileOutputStream(theFile));
                // While next line is not null parse the line with commas and store it into
                // values array
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");
                    // Print artists name located in [2] to console
                    System.out.println(values[2]);
                    // Print artists name to text file report
                    out.print(values[2] + "\n");
                }
                        // Close PrintStream
                       out.close();
                } catch(FileNotFoundException e){
                    e.printStackTrace();
                }   catch(IOException e){
                    e.printStackTrace();
                }


    }
}
