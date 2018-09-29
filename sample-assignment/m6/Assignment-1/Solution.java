import java.util.Scanner;

class Node {
    private int data;
    private Node link;
    Node (int data) {
        this.data = data;
        this.link = null;
    }
    public void setData(int data){
        this.data = data;
    }
    public int getData() {
        return this.data;
    }
    public Node getLink() {
        return this.link;
    }
    public void setLink(Node link){
        this.link = link;
    }
}

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
    public void pushLeft(int node) {
        Node newnode =  new Node(node);
        newnode.setLink(start);
        start = newnode;
        size++;
    }
    public void removeLeft() {
        if (start != null) {
            start = start.getLink();
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
}

class AddLargeNumbers {
    
    public static LinkedList numberToDigits(String number) {
        LinkedList ll = new LinkedList();
        String[] list = number.split("");
        for (int i = 0; i < list.length; i++) {
            ll.pushLeft(Integer.parseInt(list[i]));
        }
        return ll;
    }

    public static String digitsToNumber(LinkedList list) {
        String str = "";
        //return str;
        str = list.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        //System.out.println(sb.append(str));
        str = ""+ sb.reverse();
        return str;
    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
        LinkedList lls = new LinkedList();
        return lls;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
                pDigits = AddLargeNumbers.numberToDigits(p);
                qDigits = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    
}
