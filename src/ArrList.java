import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.set(2, 10);
        list.add(1,25);
        System.out.println(list.get(0));
        System.out.println(list);
    }
}
