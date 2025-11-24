import java.util.*;

public class ReverseListExample {
    public static <T> List<T> reverseArrayList(List<T> list) {
        List<T> res = new ArrayList<>(list.size());
        for (int i = list.size() - 1; i >= 0; i--) res.add(list.get(i));
        return res;
    }

    // For LinkedList, reverse by node-traversal to avoid repeated get(i)
    public static <T> List<T> reverseLinkedList(LinkedList<T> list) {
        LinkedList<T> res = new LinkedList<>();
        Iterator<T> it = list.descendingIterator(); // OK because it's a LinkedList operation
        while (it.hasNext()) res.add(it.next());
        return res;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("ArrayList reversed: " + reverseArrayList(a));

        LinkedList<Integer> l = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("LinkedList reversed: " + reverseLinkedList(l));
    }
}
