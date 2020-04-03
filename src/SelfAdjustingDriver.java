import java.util.ArrayList;

public class SelfAdjustingDriver {

    public static void main(String [] args){
        ArrayList<Integer> input = new ArrayList<Integer>();
        input.add(4);
        input.add(8);
        input.add(10);
        input.add(7);
        input.add(0);

        SelfAdjusting list = new SelfAdjusting(input);
        System.out.println("Input:" + list.getList());

        list.adjustList();
        System.out.println("Output: "+ list.getList());


    }
}
