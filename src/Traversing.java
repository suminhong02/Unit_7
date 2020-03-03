import java.util.ArrayList;
import java.util.Scanner;

public class Traversing {
    public static Scanner scan = new Scanner(System.in);

    public static ArrayList<String> getStates(){
        ArrayList<String> list = new ArrayList<>();
        while(true){
            System.out.print("Enter the name of a State or \"Stop\"to quit: ");
            String states = scan.nextLine();
            list.add(states);
            if(states.equals("Stop")){
                break;
            }
        }
        return list;
    }

    public static String createList(ArrayList<String> states){
        String outcome = "";
        for(int i = 0; i < states.size()-1; i++){
            if(i<states.size()-1){
                outcome += states.get(i);
                outcome += "->";
            }
            else{
                outcome += states.get(i);
                break;
            }
        }
        return outcome;
    }

    public static ArrayList<Integer> largestAndSmallest(){

    }
}
