public class BinaryTreeMain24 {
    public static void main(String[] args) {

        BinaryTree24 bst = new BinaryTree24();

        bst.add(new Mahasiswa24("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa24("244160221", "Badar", "B", 3.85));
        bst.add(new Mahasiswa24("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa24("244160220", "Dewi", "B", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in oder traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa:");
        System.out.println("Cari mahasiswa dengan ipk : 3.41");
        String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.println("Cari mahasiswa dengan ipk : 3.22");
        hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa24("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa24("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa24("244160170", "Fizi", "B", 3.46));
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("\nInOrder Traversal:");
        bst.traverseInOrder(bst.root);
        System.out.println("\nPreOrder Traversal:");
        bst.traversePreOrder(bst.root);
        System.out.println("\nPostOrder Traversal:");
        bst.traversePostOrder(bst.root);

        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57);
        System.out.println("\nDaftra semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal): ");
        bst.traverseInOrder(bst.root);
    }
}