public class AntrianKendaraan {
    private Node front, rear;
    private int size;

    public AntrianKendaraan() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size >= 100;
    }

    public void enqueue(kendaraan kn) {
        Node newNode = new Node(kn);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(">> kendaraan Masuk ke dalam antrian.");
    }

    public kendaraan dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak bisa memanggil.");
            return null; 
        }
        kendaraan temp = front.data; 
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return temp; 
    }

    public void jumlahAntrian() {
        System.out.println(">> Jumlah kendaraan dalam Antrian: " + size);
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("=== Daftar Antrian Kendaraan ===");
        Node current = front;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
