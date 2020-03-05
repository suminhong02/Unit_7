import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class DonorRunner {

    public static ArrayList<Donor> readFile() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("donors.txt"));
        ArrayList<Donor> list = new ArrayList<>();
        String name;
        while(scan.hasNext()){
            list.add(new Donor(scan.next(), scan.nextDouble()));
        }
        System.out.println(list);
        return list;
    }


    public static ArrayList<Donor> sortDonors(ArrayList<Donor> list){
        for(int i = 1; i < list.size(); i++){
            double money = list.get(i).getAmount();
            int k = i-1;
            while(k >= 0 && money < list.get(k).getAmount() ){
                list.set(k+1, list.get(k));
                k--;
            }
            list.set(k+1, list.get(i));
        }
        System.out.println(list);
        return list;
    }
}
