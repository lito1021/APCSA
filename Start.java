import LinearStructures.ArrayList;

public class Start {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        ArrayList<Integer> nums = new ArrayList<Integer>();

        strings.add("onamonapia");
        strings.add("brr");
        strings.add("pew");

        nums.add(5);
        nums.add(2000);
        nums.add(467);

        System.out.println(strings);
        System.out.println(nums);

        
        for(String s : strings) {
            System.out.println(s);
        }



        System.out.println("HI");
    }
}