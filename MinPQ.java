public class MinPQ<Key extends Comparable<Key>> {
    private int n;
    private int totalTime;
    private Node<Key> head;
    public MinPQ() {
        n=0;
        head=null;
        totalTime=0;
    }
    private class Node<Key extends Comparable<Key>>
    {
        Key key;
        Node<Key> next;
        Node<Key> prev;
    }

    public void Enqueue(Key key) {
        Node<Key> newNode = new Node<Key>();
        n++;
        newNode.key = key;
        if (head == null || key.compareTo(head.key) < 0) {
            newNode.next = head;
            head = newNode;
        }
        else {
            // Traverse the list to find the correct position
            Node current = head;
            while (current.next != null && current.next.key.compareTo(key) <= 0) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    public Key Dequeue() {
        Key key = head.key;
        head=head.next;
        if(head!=null)
            head.prev=null;
        else
            head=null;
        n--;
        return key;
    }
    public boolean isEmpty() {
        return n == 0;
    }
}

