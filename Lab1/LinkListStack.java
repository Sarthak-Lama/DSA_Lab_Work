package Lab1;

public class LinkListStack {
  class Node {
      int data;
      Node next;

      Node(int data) {
          this.data = data;
          this.next = null;
      }
  }

    Node top;

    void push(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            top = node;
        } else {
            node.next = top;
            top = node;
        }
        System.out.println("pushed");
    }
    void pop(){
        if(isEmpty()){
            System.out.println("Empty Stack");
        }else{
            System.out.println(top.data+" is popped");
            top = top.next;
        }
    }
    void peek(){
        if(isEmpty()){
            System.out.println("Empty Stack");
        }else{
            System.out.println(top.data);
        }
    }
    void print() {
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return;
        }

        Node current = top;
        System.out.print("Stack: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    boolean isEmpty(){
      return (top == null);
    }
    public static void main(String[] args) {
        LinkListStack stack = new LinkListStack();

        stack.peek();
        stack.push(15);
        stack.push(23);
        stack.push(33);
        stack.peek();
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.peek();

    }
 }






