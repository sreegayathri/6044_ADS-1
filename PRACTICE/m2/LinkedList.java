import java.util.*;
class LinkedList {
    private int size;
    private Node start;

    LinkedList() {
        this.size = 0;
        this.start = null;
    }
    public int size() {
        return size;
    }
    public void addEnd(int newdata) {
        Node newnode = new Node(newdata); 
        if (start == null) {
            start = newnode;
        } else {
            Node temp = start;
            while(temp.getLink() != null) {
                temp = temp.getLink();                
            }
            temp.setLink(newnode);
            size++;
        }
    }
    public void pushLeft(int node) {
        Node newnode =  new Node(node);
        newnode.setLink(start);
        start = newnode;
        size++;
    }
        
    public void pushRight(int data) {
        Node newnode = new Node(data);
        Node temp = start;
        if (start == null) {
            start = newnode;
        } else {
            while (temp.getLink() != null) {
                temp = temp.getLink();
            }
            temp.setLink(newnode);
            size++;
        }
    }

    public void removeLeft() {
        if (start != null) {
            start = start.getLink();
            size--;
        }
    }

    public void removeRight() {
        if (start == null) {
            System.out.println("Node is Empty");
        } else if (size < 2) {
            start = null;
            size--;
        } else {
            Node temp = start;
            while (temp.getLink().getLink() != null) {
                temp = temp.getLink();
            }
            temp.setLink(null);
            size--;
        }
    }
    public String toString() {
        String s = "";
        Node temp = start;
        while (temp.getLink() != null) {
            s += temp.getData() + ", ";
            temp = temp.getLink();
        } s += temp.getData();
        return s;
    }
/*    public void addFirst(int newdata) {
        Node newnode = new Node(newdata);
        newnode.addLast(newdata);
        System.out.println(newnode);
    }*/
    public Node nodeRemove(Node head, int data) {
        if (head == null) {
            return null;
        } else if (data == 0) {
            return head.getData();
        } else {
            Node link = head;
            for (int i = 0; i < data - 1; i++) {
                link = link.getLink();
            }
            link = link.getLink().getLink();
            return head;
        }
    }
}
/*inner class\\
private STACK{
    String item;
    
}
String item= first.next;
first = first.next;*/