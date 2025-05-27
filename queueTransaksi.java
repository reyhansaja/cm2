public class queueTransaksi {
    private transaksi[] queue;
    private int front, rear, size;

    public queueTransaksi(int kapasitas) {
        queue = new transaksi[kapasitas];
        front = rear = size = 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(transaksi trx) {
        if (isFull()) {
            System.out.println("Antrian transaksi penuh.");
            return;
        }
        queue[rear] = trx;
        rear = (rear + 1) % queue.length;
        size++;
    }

    public void tampilTransaksi() {
        if (isEmpty()) {
            System.out.println("Belum ada transaksi.");
            return;
        }
        System.out.println("\n=== Riwayat Transaksi ===");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % queue.length;
            System.out.println((i + 1) + ". " + queue[idx]);
        }
    }
}
