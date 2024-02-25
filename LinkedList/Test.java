package LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.insert(234);
        l.insert(456);
        l.insert(567);
        l.insertFirst(23);
        l.insertFirst(777);
        l.print();
        System.out.println("the size of list is"+l.size);
        l.insert(67,2);
        l.print();
        System.out.println("the size of list is"+ l.size);
        System.out.println(l.search(567));
        l.remove(87);
        l.print();

    }
}
