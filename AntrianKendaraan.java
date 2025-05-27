public class AntrianKendaraan {
    Node head;
    Node tail;

    boolean isEmpty(){
        return(head == null);
    }
    public void tampilAntrian(){
        if(!isEmpty()){
            Node tmp = head;
            System.out.println("Isi Linked List: \t");
            while (tmp != null) {
                tmp.data.tampilkanInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked list kosong");
        }
    }
    public void tambahAntrian(kendaraan input){
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }
    }
    public void addLast(kendaraan input){
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("List Masih kosong, tidak dapat dihapus");
        } else if (head == tail){
            head = tail = null;
        } else {
            head = head.next;
        }
    }
    public void removeLast(){
        if(isEmpty()){
            System.out.println("Linked List masih kosong, tidak bisa dihapus");
        } else if(head == tail){
            head = tail = null;
        } else{
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    public void removeAt(int index){
        if(index == 0){
            removeFirst();
        }else {
            Node temp = head;
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
