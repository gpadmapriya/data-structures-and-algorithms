package datastructures.linkedList;

public class LinkedList {
    public static Node head;

    public LinkedList() {
        head = null;
    }

    public String insert(int data) {
        Node newNode = new Node(data);
        String result = "";
        if (head == null) {
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

    public boolean includes(int data) {
        Node start = head;
        boolean doesExist = false;
        if (head == null) {
            return false;
        }
        if (head.data == data) {
            return true;
        }
        while (start.next != null) {
            if (start.data == data) {
                return true;
            } else {
                start = start.next;
            }
        }
        if (start.data == data) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String returnString = "";
        if (head == null) {
            returnString = "No values in linked list. Head is null";
        } else if (head.next == null) {
            returnString = "Values in the linked list: " + head.data;
        } else {
            Node start = head;
            returnString = "Values in the linked list: ";
            while (start.next != null) {
                returnString = returnString + start.data + " ";
                start = start.next;
            }
            returnString = returnString + start.data;
        }
        return returnString;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.next = null;
    }

    public void insertBefore(int value, int newValue) {
        Node newNode = new Node(newValue);
        Node current = head;
        boolean nodeInserted = false;
        if (current == null) {
            System.out.println("There are no nodes in the list to insert before");
        } else if (current.data == value){
            newNode.next = current;
            head = newNode;
            nodeInserted = true;
        } else {
            while (current.next != null) {
                if (current.next.data == value) {
                    newNode.next = current.next;
                    current.next = newNode;
                    nodeInserted = true;
                    break;
                } else {
                    current = current.next;
                }
            }
        }
        if (nodeInserted) {
            System.out.println("Node inserted");
        } else {
            System.out.println("Did not find node to insert before. Node not inserted");
        }
    }

    public void insertAfter(int value, int newValue){
        Node newNode = new Node(newValue);
        Node current = head;
        boolean nodeInserted = false;

        if (current == null) {
            System.out.println("There are no nodes in the list to insert after");
        } else {
            while (current != null) {
                if (current.data == value) {
                    newNode.next = current.next;
                    current.next = newNode;
                    nodeInserted = true;
                    break;
                } else {
                    current = current.next;
                }
            }
        }
        if (nodeInserted) {
            System.out.println("Node inserted");
        } else {
            System.out.println("Did not find node to insert before. Node not inserted");
        }
    }

}
