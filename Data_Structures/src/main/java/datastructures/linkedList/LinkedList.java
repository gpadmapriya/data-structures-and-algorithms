package datastructures.linkedList;

public class LinkedList {
    public static Node head;

    public LinkedList(){
        head = null;
    }

    public String insert(int data) {
        Node newNode = new Node(data);
        String result = "";
        if (head == null){
            head = newNode;
            head.next = null;
            result = "No elements in linked list. Inserting as head";
        } else {
            newNode.next = head;
            head = newNode;
            result = "Inserted " + head.data + " as the head node";
        }
        return result;
    }

    public boolean includes(int data){
        Node start = head;
        boolean doesExist = false;
        if (head == null){
            return false;
        }
        if (head.data == data){
            return true;
        }
        while (start.next != null){
            if (start.data == data){
                return true;
            } else {
                start = start.next;
            }
        }
        if (start.data == data){
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        String returnString = "";
        if (head == null) {
            returnString = "No values in linked list. Head is null";
        } else if (head.next == null){
            returnString = "Values in the linked list: " + head.data;
        } else {
            Node start = head;
            returnString = "Values in the linked list: ";
            while (start.next != null){
                returnString = returnString + start.data + " ";
                start = start.next;
            }
            returnString = returnString + start.data;
        }
        return returnString;
    }
    public static void main(String[] args){
        LinkedList newList = new LinkedList();
        System.out.println(newList.toString());
        System.out.println(newList.head);
        System.out.println(newList.includes(4));
        newList.insert(4);
        newList.insert(6);
        newList.insert(10);
        System.out.println(newList.head.data);
        newList.insert(13);
        newList.insert(1);
        System.out.println(newList.head.data);
        System.out.println(newList.includes(4));
        System.out.println(newList.includes(2));
        System.out.println(newList.toString());
    }
}
