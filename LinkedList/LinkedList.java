package LinkedList;

public class LinkedList {
    Node head;
    Node tail;
    int size=0;
    public LinkedList(){
        this.head=this.tail=null;
    }
    public void insert (int value){
        Node node=new Node(value);
        if(head==null){
            head =tail=node;
            size++;
            return;
        }
        tail.next=node;
        tail=node;
        size ++;
    }
    //Insert first
    public void insertFirst(int value){

        if (head==null){
            insert(value);
            size ++;
            return;
        }
        Node node=new Node(value);
        node.next=head;
        head=node;
        size ++;
    }
    // insert particular position
    public void insert(int value,int index){
        if(index<=0){
            insertFirst(value);
            size ++;
            return;
        }
        if(index>=size){
            insert(value);
            size ++;
            return;
        }
        Node node=new Node(value);
        Node temp=head;
        int t=1;
        while(t<index-1){
            temp=temp.next;
            t++;
        }
        node.next=temp.next;
        temp.next=node;
        size++;

    }
    // remove element
    public void remove(){
        Node temp=head;
        int i=1;
        while(i<size){
            temp=temp.next;
            i++;

        }
        temp.next=null;
        tail=temp;
        size--;

    }
    //removeFirst
    public  void removeFirst()
    {
        head=head.next;
        size--;
    }
    // remove index based
    public void remove(int index){
        if(index<=1){
            removeFirst();
            return;
        }
        if (index>=size){
            remove();
            return;
        }
        int i=1;
        Node temp=head;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        size --;
    }
    //search element
    public int search(int value){
        int index=0;
        Node temp=head;
        for (int i = 1; i <=size; i++) {
            if(value==temp.data) {
                index = i;
                break;
            }
            temp=temp.next;
        }
        return index;
    }
    //print nodes
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
//            System.out.println(tail.data);
//            System.out.println(tail.next);
        }
    }
}
