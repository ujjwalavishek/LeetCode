public class MyLinkedList {
    class Node{
        int val;
        Node next;

        Node(){
            this.val = val;
            this.next = null;
        }

    }
    Node head;
    int size;
    public MyLinkedList(){
        head = null;
        size = 0;
    }

    public int get(int index){
        if (index<0 || index>=size) return -1;
        Node temp = head;
        for (int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp.val;

    }

    public void addAtHead(int val){
        Node node = new Node();
        node.val = val;
        if (head==null){
            head = node;
        }
        else{
            node.next = head;
            head = node;
        }
        size++;
    }

    public void addAtTail(int val){
        Node temp = head;
        Node node = new Node();
        node.val = val;
        if (head==null){
            head = node;
        }
        else{
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
        size++;
    }

    public void addAtIndex(int index, int val){
        if (index<0 || index>size) return;
        Node node = new Node();
        node.val = val;
        if (index==0) addAtHead(val);
        else if (index==size) addAtTail(val);
        else{
            Node temp = head;
            for (int i=0;i<index-1;i++){
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }

    public void deleteAtIndex(int index){
        if (size==0 || index<0 || index>=size) return;
        if (index==0) {
            head = head.next;
            size--;
        }
        else if (index==size-1){
            Node temp = head;
            for (int i=0;i<index-1;i++){
                temp = temp.next;
            }
            temp.next = null;
            size--;
        }
        else{
            Node temp = head.next;
            Node prev = head;
            for (int i=0;i<index-1;i++){
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
            size--;
        }

    }


}
