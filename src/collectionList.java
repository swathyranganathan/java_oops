import java.util.ArrayList;
import java.util.LinkedList;

public class collectionList {
    public static void main(String[] args) {
        int a[]=new int[5];   //array is fixed size
        ArrayList<Integer> arr= new ArrayList<Integer>();  //flexible,support redundancy
        for(int i=0;i<=10;i++)
            arr.add(i);
            System.out.println(arr);
            arr.add(100);
        System.out.println(arr);

        ArrayList data=new ArrayList();
        data.add("hello");
        data.add(420);
        data.add("yeah its you!");
        System.out.println(data);
        System.out.println(data.get(2));
        data.set(0,"hi");
        System.out.println(data);
        data.remove(2);
        System.out.println(data);
        data.addFirst("heyy");
        System.out.println(data);

        System.out.println(data.contains("swathy"));
        data.clear();
        System.out.println(data);

        LinkedList<Character> data2 = new LinkedList<Character>();
        for (char i='a';i<'g';i++)
            data2.add(i);
        System.out.println(data2);

    }
}
