import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DonorRunner {

    public static ArrayList<Donor> readFiles() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("donors.txt"));
        ArrayList<Donor> list = new ArrayList<>();
        String name;
        while(scan.hasNext()){
            list.add(new Donor());
        }
    }
}
