package Lab1;

public class PriorityQueueLinkedList {
    class Node{
        int priority , data;
        Node next;
        Node(int priority , int data){
            this.priority = priority;
            this.data = data;
        }
    }
    Node head;
    boolean isEmpty(){
        return head == null;
    }
    void add( int priority , int data ){
        Node node = new Node(priority, data);
        if(isEmpty()){
            head = node;
        }else if(priority < head.priority){
            node.next = head;
            head = node;
        }else{
            Node pointer = head;
            while((pointer.next != null) && (priority > pointer.priority)){
                pointer = pointer.next;
            }
            pointer.next = node;
        }
    }
    void poll(){
        if(isEmpty()){
            System.out.println("Empty Queue");
        }else{
            System.out.println(head.data );
            head = head.next;
        }
    }

    public static void main(String[] args) {
        PriorityQueueLinkedList pri = new PriorityQueueLinkedList();
        pri.add(7,7);
        pri.add(1,6);
        pri.poll();
        pri.poll();
    }
}
