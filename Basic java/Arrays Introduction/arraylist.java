import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>();
        list.add(34);
        list.add(323);
        list.add(32);
        list.add(34);
        list.add(34);
        list.add(34);
        System.out.println(list);
        System.out.println(list.contains(323));
        list.set(0, 34444);
        System.out.println(list);


    }
}
