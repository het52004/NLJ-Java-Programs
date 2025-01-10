import java.util.Scanner;


class Node {
    int data;
    Node next;
}

public class LinkedList {
    Node head;
    Node current;

    public void addNode(Scanner sc) {
        System.out.print("Enter a value to insert it into node:- ");
        int data = sc.nextInt();
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if (head == null) {
            head = newNode;
            current = newNode;
        } else {
            current.next = newNode;
            current = newNode;
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("\nList is empty please insert values\n");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print("[" + temp.data + "]->");
                temp = temp.next;
            }
            System.out.print("[Null]\n\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList l1 = new LinkedList();
        while (true) {
            System.out.print(
                    "Enter 1 for creating a node\nEnter 2 for printing the linkedlist\nEnter 3 for exit\nEnter your choice:- ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    l1.addNode(sc);
                    break;
                case 2:
                    l1.printList();
                    break;
                case 3:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}