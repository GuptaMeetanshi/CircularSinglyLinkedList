

class Node{
    int data;
Node next;
}
class MyCircularLinkedList {
    Node head;
    int size;

    public void insertAtLast(Node newnode) {
        if (head == null) {
            head = newnode;
            newnode.next = head;
            size++;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
            size++;
        }

    }

    public void deleteLastNode() {
        if (head == null) {
            System.out.println("EMPTY LIST");
        } else {
            Node temp = head;
            Node previous = null;
            while (temp.next != head) {
                previous = temp;
                temp = temp.next;
            }
            previous.next = temp.next;
            size--;
        }
    }

    public void insertBeginning(Node newnode) {
        if (head == null) {
            head = newnode;
            newnode.next = head;
            size++;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newnode.next = temp.next;
            head = newnode;
            temp.next = newnode;
        }
        size++;

    }

    public void deleteBeginning() {
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            head = head.next;
            temp.next = head;
            size--;
        }
    }

    public void insertAfterNode(Node newnode, Node afternode) {
        if (head == null) {
            System.out.println("Cannot Be Possible");
        } else {
            Node temp = head;
            while (temp.next != afternode.next) {
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
            size++;
        }
    }

    public void deleteAfternode(Node afternode) {
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            Node temp = head;
            while (temp.next != afternode.next) {
                temp = temp.next;
            }
            if (temp.next == head) {
                if (size == 1) {
                    head = null;
                    size--;
                } else {
                    temp.next = temp.next.next;
                    head = head.next;
                    size--;
                }

            } else {
                temp.next = temp.next.next;
                size--;
            }
        }
    }

    public void insertBeforenode(Node newnode, Node beforenode) {
        if (head == null) {
            System.out.println("Cannot insert before any position");
        } else {
            Node temp = head;
            if (size == 1) {
                while (temp.next != head) {
                    temp = temp.next;
                }
                newnode.next = temp.next;
                head = newnode;
                temp.next = head;
                size++;
            } else {
                while (temp.next != beforenode) {
                    temp = temp.next;
                }
                newnode.next = temp.next;
                temp.next = newnode;
                size++;
            }
        }
    }

    public void deleteBeforeNode(Node befornode) {
        if (head == null) {
            System.out.println("Empty list");
        } else {
            Node temp = head;
            Node previous = null;
            while (temp.next != befornode) {
                previous = temp;
                temp = temp.next;
            }
            if (size == 1) {
                System.out.println("Nothing to deletebeforenode");
            } else {
                previous.next = temp.next;
                size--;
            }
        }
    }

     
    

    public void display() {
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            Node temp = head;
            System.out.println("My Circular Linked List is :");

            System.out.print(temp.data + "---->");
            temp = temp.next;
            while (temp != head) {
                System.out.print(temp.data + "--->");
                temp = temp.next;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        MyCircularLinkedList obj = new MyCircularLinkedList();
        Node n1 = new Node();
        Node n2 = new Node();
        n1.data = 10;
        n1.next = null;
        n2.data = 20;
        n2.next = null;
        obj.insertAtLast(n1);
        obj.display();
        obj.insertAtLast(n2);
        obj.display();
        Node n3 = new Node();
        n3.data = 30;
        n3.next = null;
        obj.insertAtLast(n3);
        obj.display();
        obj.deleteLastNode();
        obj.display();
        Node n4 = new Node();
        n4.data = 40;
        n4.next = null;
        obj.insertBeginning(n4);
        obj.display();
        Node n5 = new Node();
        n5.data = 50;
        n5.next = null;
        obj.insertBeginning(n5);
        obj.display();
        obj.deleteBeginning();
        obj.display();
        Node n6 = new Node();
        n6.data = 60;
        n6.next = null;
        obj.insertAfterNode(n6, n4);
        obj.display();
        obj.deleteAfternode(n6);
        obj.display();
        Node n7 = new Node();
        n7.data = 70;
        n7.next = null;
        obj.insertBeforenode(n7, n6);
        obj.display();
        obj.deleteBeforeNode(n6);
        obj.display();
        obj.deleteLastNode();
        obj.deleteLastNode();
        obj.display();
        obj.deleteBeforeNode(n4);
        obj.display();
        Node n8 = new Node();
        n8.data = 80;
        n8.next = null;
       


    }
}
