
import LinearStructures.ArrayList;
import LinearStructures.LinkedList;

import java.util.Iterator;

public class Start {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<String>();
        LinkedList<Integer> nums = new LinkedList<Integer>();

        strings.add("onamonapia");
        strings.add("brr");
        strings.add("pew");

        nums.add(5);
        nums.add(2000);
        nums.add(467);

        System.out.println(strings);
        System.out.println(nums);

        
        /*for(String s : strings) {
            System.out.println(s);
        } */

        LinkedList<String> pizza = new LinkedList<String>();
        pizza.add("pepperoni");
        pizza.add("cheese");
        pizza.add("meat lovers");

        Iterator<String> it = pizza.iterator();

        //print the list 
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}