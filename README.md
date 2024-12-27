# Movie Management Application

**Aplikasi Manajemen Film** adalah aplikasi berbasis **Java Swing** yang digunakan untuk mengelola data film. Pengguna dapat menambahkan, memperbarui, menghapus, dan melihat daftar film beserta informasi terkait seperti judul, sutradara, tahun rilis, deskripsi, dan poster film. Aplikasi ini juga memungkinkan pengunggahan poster film dan menampilkannya dalam antarmuka pengguna.

## Fitur Utama

1. **Menambahkan Film**
    - Pengguna dapat memasukkan data film seperti **judul**, **sutradara**, **tahun rilis**, **deskripsi**, dan **poster**.
    - Poster dapat diunggah dengan memilih gambar melalui file dialog menggunakan tombol **Upload**.
    - Data yang dimasukkan akan ditambahkan ke dalam tabel film dan disimpan dalam variabel internal aplikasi.

2. **Memperbarui Film**
    - Pengguna dapat memilih film dari daftar yang ada dan memperbarui informasi film (judul, sutradara, tahun rilis, deskripsi, dan poster).
    - Setelah melakukan perubahan, data yang diupdate akan langsung diperbarui dalam tabel.

3. **Menghapus Film**
    - Pengguna dapat memilih film dari tabel untuk dihapus.
    - Setelah memilih film yang ingin dihapus, klik tombol **Delete** untuk menghapusnya dari daftar film.

4. **Form Input Film**
    - Form untuk memasukkan data film seperti judul, sutradara, tahun rilis, dan deskripsi.
    - Gambar poster film dapat diunggah melalui tombol **Upload**, dan gambar yang dipilih akan ditampilkan di area label poster.

5. **Daftar Film**
    - Semua film yang ditambahkan akan ditampilkan dalam tabel di tengah aplikasi.
    - Tabel akan menunjukkan **judul**, **sutradara**, **tahun**, **deskripsi**, dan **poster** film.

6. **Pengunggahan Poster**
    - Pengguna dapat mengunggah poster film melalui dialog file dan gambar akan ditampilkan di label yang sudah disediakan.

## Teknologi yang Digunakan

- **Java**: Aplikasi ini dibangun dengan bahasa pemrograman Java.
- **Swing**: GUI (Graphical User Interface) dibuat menggunakan Swing, termasuk elemen seperti form input, tombol, dan tabel.
- **ImageIO**: Untuk membaca dan menampilkan gambar poster film.

## Cara Menggunakan Aplikasi

1. **Menambahkan Film**
    - Masukkan data film pada form yang telah disediakan.
    - Pilih gambar poster film dengan tombol **Upload**.
    - Klik tombol **Add** untuk menambahkan film ke dalam daftar.

2. **Memperbarui Film**
    - Pilih film yang ingin diubah dari tabel.
    - Ubah data film pada form input.
    - Klik tombol **Update** untuk memperbarui informasi film di tabel.

3. **Menghapus Film**
    - Pilih film yang ingin dihapus dari tabel.
    - Klik tombol **Delete** untuk menghapus film dari daftar.

4. **Mengosongkan Form**
    - Klik tombol **Clear** untuk membersihkan form input setelah menambahkan atau memperbarui film.

## Struktur Proyek

1. **MovieManagementApp.java**
    - File utama yang berisi logika aplikasi dan tampilan GUI.
    - Form input untuk memasukkan data film.
    - Tabel untuk menampilkan daftar film yang telah ditambahkan.
    - Tombol untuk menambah, memperbarui, menghapus, dan mengosongkan form.

2. **Metode Utama:**
    - `uploadImage()`: Mengunggah dan menampilkan poster film.
    - `addMovie()`: Menambahkan film baru ke dalam tabel.
    - `updateMovie()`: Memperbarui informasi film yang sudah ada.
    - `deleteMovie()`: Menghapus film yang dipilih.
    - `clearForm()`: Membersihkan form input untuk entri film baru.

## Persyaratan

- **Java JDK 8 atau lebih tinggi**  
  Pastikan Java sudah terinstal di komputer pengguna.

## Instalasi

1. **Clone Repositori**  
   pengguna dapat meng-clone repositori ini menggunakan Git:
   ```bash
   git clone https://github.com/username/repository-name.git
