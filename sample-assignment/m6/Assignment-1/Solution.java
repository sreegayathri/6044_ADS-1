/*import java.util.Scanner;
import java.util.StringBuilder;*/
import java.util.*;
/**
* Class for node.
*/
class Node {
    /**
    * { var_description }
    */
    private int data;
    /**
    * { var_description }
    */
    private Node link;
    /**
    * Constructs the object.
    *
    * @param      data  The data
    */
    Node (int data) {
        this.data = data;
        this.link = null;
    }
    /**
    * Sets the data.
    *
    * @param      data  The data
    */
    public void setData(int data) {
        this.data = data;
    }
    /**
    * Gets the data.
    *
    * @return     The data.
    */
    public int getData() {
        return this.data;
    }
    /**
    * Gets the link.
    *
    * @return     The link.
    */
    public Node getLink() {
        return this.link;
    }
    /**
    * Sets the link.
    *
    * @param      link  The link
    */
    public void setLink(Node link) {
        this.link = link;
    }
}
/**
* List of linkeds.
*/
class LinkedList {
    /**
    * { var_description }
    */
    private int size;
    /**
    * { var_description }
    */
    private Node start;
    /**
    * Constructs the object.
    */
    LinkedList() {
        this.size = 0;
        this.start = null;
    }
    /**
    * { function_description }
    *
    * @return     { description_of_the_return_value }
    */
    public int size() {
        return size;
    }
    /**
    * Pushes a left.
    *
    * @param      node  The node
    */
    public void pushLeft(int node) {
        Node newnode =  new Node(node);
        newnode.setLink(start);
        start = newnode;
        size++;
    }
    /**
    * Removes a left.
    */
    public void removeLeft() {
        if (start != null) {
            start = start.getLink();
            size--;
        }
    }
    /**
    * Returns a string representation of the object.
    *
    * @return     String representation of the object.
    */
    public String toString() {
        String s = "";
        Node temp = start;
        while (temp.getLink() != null) {
            s += temp.getData() + "";
            temp = temp.getLink();
        } s += temp.getData();
        return s;
    }
}
/**
* Class for add large numbers.
*/
class AddLargeNumbers {
    /**
    * { function_description }
    *
    * @param      number  The number
    *
    * @return     { description_of_the_return_value }
    */
    public static LinkedList numberToDigits(String number) {
        LinkedList ll = new LinkedList();
        String[] list = number.split("");
        for (int i = 0; i < list.length; i++) {
            ll.pushLeft(Integer.parseInt(list[i]));
        }
        return ll;
    }
    /**
    * { function_description }
    *
    * @param      list  The list
    *
    * @return     { description_of_the_return_value }
    */
    public static String digitsToNumber(LinkedList list) {
        String str = "";
//return str;
        str = list.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
//System.out.println(sb.append(str));
        str = "" + sb.reverse();
        return str;
    }
    /**
    * Adds large numbers.
    *
    * @param      list1  The list 1
    * @param      list2  The list 2
    *
    * @return     { description_of_the_return_value }
    */
    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
        LinkedList lls = new LinkedList();


        return lls;
    }
}
/**
* Class for solution.
*/
public class Solution {
    /**
    * Constructs the object.
    */
    Solution() {

    }
    /**
    * { function_description }
    *
    * @param      args  The arguments
    */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch (input) {
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
