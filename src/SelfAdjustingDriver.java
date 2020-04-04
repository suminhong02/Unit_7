import java.util.ArrayList;

/**
 * @author Sumin Hong
 *  @since 4/1/2020
 *  Description: This class includes one main method that runs the SelfAdjusting class test.
 */
public class SelfAdjustingDriver {

    public static void main(String [] args){
        /**
         * First instance called input.
         * Add each numbers of the list and print the input arraylist and output arraylist after going through adjustList method.
         */
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

        System.out.println("");

        /**
         * Second instance called input2.
         * Add different numbers and print the input arraylist and output arraylist after going through adjustList method.
         */
        ArrayList<Integer> input2 = new ArrayList<Integer>();
        input2.add(8);
        input2.add(10);
        input2.add(2);
        input2.add(9);
        input2.add(0);

        SelfAdjusting list2 = new SelfAdjusting(input2);
        System.out.println("Input2:" + list2.getList());

        list2.adjustList();
        System.out.println("Output2: "+ list2.getList());
    }
}
