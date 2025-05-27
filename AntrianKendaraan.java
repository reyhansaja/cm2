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
        // Simulasi: Anggap antrian penuh jika lebih dari 100
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
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    public kendaraan dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak bisa memanggil.");
            return null; // Mengembalikan null jika antrian kosong
        }
        kendaraan temp = front.data; // Simpan data kendaraan yang akan di-dequeue
        System.out.println("Memanggil: " + front.data);
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return temp; // Mengembalikan data kendaraan yang di-dequeue
    }


    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void tampilkanDepan() {
        if (!isEmpty())
            System.out.println("Antrian Terdepan: " + front.data);
        else
            System.out.println("Antrian kosong.");
    }

    public void tampilkanBelakang() {
        if (!isEmpty())
            System.out.println("Antrian Paling Belakang: " + rear.data);
        else
            System.out.println("Antrian kosong.");
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah Mahasiswa dalam Antrian: " + size);
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
