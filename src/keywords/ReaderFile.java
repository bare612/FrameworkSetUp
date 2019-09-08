package keywords;


import java.io.BufferedReader;
import java.io.FileReader;

public class ReaderFile {

    public static void main(String[] args) {

        FileReader fr = null;
        BufferedReader br = null;
        String fileName = "/Users/abdibare/Documents/intelliJ2019/src/keywords/file12";

        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            String data = "";
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }

        } catch (Exception ex) {
            System.out.println("File was Not found");
        } finally {
            try {
                br.close();
                fr.close();
            } catch (Exception ex) {
            }


        }

    }
}
