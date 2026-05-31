public class BinaryTreeArray24 {
    Mahasiswa24[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray24() {
        this.dataMahasiswa = new Mahasiswa24[10];
    }

    void populateData(Mahasiswa24[] dataMhs, int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
}