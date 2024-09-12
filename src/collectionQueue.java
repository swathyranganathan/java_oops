import java.util.*;
public class collectionQueue {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        System.out.println("remove "+ que.poll());
        que.add(3);
        que.add(78);
        que.add(45);
        que.add(65);
        que.add(76);
        System.out.println("Head is "+ que.peek());
        System.out.println("remove "+que.remove());
        System.out.println("Head is "+ que.peek());

        PriorityQueue<Integer> q = new PriorityQueue<>();//sorted
        System.out.println("remove "+ q.poll());
        q.add(3);
        q.add(7);
        q.add(4);
        q.add(6);
        q.add(7);
        q.add(1);
        System.out.println(q);
        System.out.println("Head is "+ q.peek());
        System.out.println("remove "+q.remove());
        System.out.println("Head is "+ q.peek());



        HashSet<String> h= new HashSet<String>();//no redundancy and unorder
        h.add("abi");
        h.add("swathy");
        h.add("keerthika");
        h.add("shalini");
        h.add("abi");
        System.out.println(h);

        HashSet<String> he= new LinkedHashSet<>();//no redundancy but ordered
        he.add("abi");
        he.add("swathy");
        he.add("keerthika");
        he.add("shalini");
        he.add("abi");
        System.out.println(he);

        TreeSet<String> t= new TreeSet<>();//sorted
        t.add("abi");
        t.add("swathy");
        t.add("keerthika");
        t.add("shalini");
        t.add("abi");
        System.out.println(t);
    }
}
