package Data_structure.Linked_Lists;

class TLinkedList<T> {

    private Node head;
    private Node tail;
    private int size;

    private class Node{
        T data;
        Node next;
        Node(T data){
            this.data = data;
            next = null;
        }
    }

    public boolean isEmpty(){
        if(head == null)
            return true;
        return false;
    }

    public int size(){
        return size;
    }

    public void addFront(T data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void add(T data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public Node removeFront(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("List is Empty");
        }
        Node remove = head;
        head = head.next;
        return remove;
    }

    public void insert(T data,int position){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("List is Empty");
        }
        if(position < 1 || position > size){
            throw new IndexOutOfBoundsException("position out of reach");
        }
        Node newNode = new Node(data);
        if(position == 1){
            this.addFront(data);
            return;
        }
        Node previous = null;
        Node current = head;
        int i = 1;
        while(current != null && i < position){
            previous = current;
            current = current.next;
            i++;
        }
        newNode.next = previous.next;
        previous.next = newNode;
        size++;
    }

    public void insert(T data){
        this.add(data);
    }

    public Node remove(int position){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("List is Empty"); 
        }
        if(position < 1 || position > size){
            throw new IndexOutOfBoundsException("Position out of Range");
        }
        if(position == 1){
            return this.removeFront();
        }
        Node current = head;
        Node previous = null;
        int i = 1;
        while(current != null && i < position){
            previous = current;
            current = current.next;
            i++;
        }
        System.out.println("i >> " + i);
        
        previous.next = current.next;
        return current;
    }

    public Node remove(){
        return remove(size);
    }

    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    @Override
    public String toString(){
        String s = "[";
        Node current = head;
        while(current != null){
            s += current.data;
            if(current.next != null){
                s = s + ", ";
            }
            current = current.next;
        }
        s += "]";
        return s;
    }
}

class Solution35{
    public static void main(String[] args) {
        TLinkedList list = new TLinkedList<>();
        list.add(12);
        list.insert("data");
        System.out.println(list);
    }
}
