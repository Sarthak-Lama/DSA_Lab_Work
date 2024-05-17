package Lab1;

public class QueueLinkedList {
    class Node{
        Node next;
        int data;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head, tail;
    public boolean isEmpty(){
        return (head == null);
    }
    void enqueue (int data){
        Node node = new Node (data);
        if(isEmpty()){
            head=node;
            tail=node;
        }else{
            tail.next=node;
            tail=node;
        }
    }
    void dequeue(){
        if(isEmpty()){
            System.out.println("Nothing to dequeue");
        }else{
            head=head.next;
        }
    }
    void print(){
        Node pointer=head;
        while(pointer!=null){
            System.out.println(pointer.data+" ");
            pointer=pointer.next;
        }
        System.out.println();
    }
    void peak(){
        if(isEmpty()){
            System.out.println("Nothing");
        }else{
            System.out.println(head.data);
        }
    }
    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();
        queue.enqueue(5);
        queue.enqueue(15);
        queue.enqueue(25);
        queue.peak();
        queue.print();
    }
}