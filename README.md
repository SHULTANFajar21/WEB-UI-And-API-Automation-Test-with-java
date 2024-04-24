CARA MENJALANKAN TEST
1. Clone repository

  git clone https://github.com/SHULTANFajar21/WEB-UI-And-API-Automation-Test.git

2. Buka project menggunakan IntelliJ IDEA atau IDE java lainnya
3. Menjalankan Test
   .untuk menjalankan semua test

     ./gradlew automationTest



TOOLS DAN LIBRARY YANG DIGUNAKAN



. Git dan Github: Untuk version control dan menyimpan project.

. Java: Bahasa pemrogaman utama untuk pengembangan test automation.

. Gradle: Build tool untuk mengelola dependensi dan menjalankan test.

. Rest Assured: Library untuk melakukan testing pada API.

. Selenium: Library untuk melakukan automation testing pada web UI.

. Cucumber: Framework untuk menjalankan test case dalam Gherkin format.



PROJECT STUCTURE


. src/test/java/helper/JSONSchemaData: Tempat menyimpan kelas atau file yang berhubungan dengan pengolahan atau validasi data JSON menggunakan JSON Schema.

. src/test/java/helper: Digunakan untuk menyimpan kelas utilitas atau bantuan yang mendukung pengujian dalam proyek.

. src/test/java/page: Berisi kelas-kelas uyang mewakili halaman test dan mengimplementasikan pola model objek halama.

. src/test/java/runner: Tempat untuk menempatkan file-file yang terkait dengan jalannya pengujian dalam proyek menggunakan Cucumber.

. src/test/java/stepDef: Berisi kelas-kelas yang menentukan langkah-langkah definisi untuk skenario pengujian menggunakan Cucumber.

. src/test/resources: Berisi file Gherkin '.feature' yang berisi skenario pengujian.



IMPLEMENTATION


. page object model(POM): Setiap halaman direpresentasikan sebagai kelas java terpisah di dalam paket 'page'. contoh 'WebPage.java' akan berisi metode untuk berinteraksi dengan elemen di halaman berbeda.

. Cucumber Step Definition: Paket 'stepDef' mendefinisikan langkah-langka untuk skenario pengujian Gherkin.

. Test Cases(Gherkin Syntax): File 'api.feature' dan 'web.feature' berisi skenario pengujian menggunakan Gherkin Syntax.

. Cucumber Implementation: Framework menggunakan Cucumber untuk menjalankan skenario pengujian Gherkin dan membuat laporan.



INFORMASI PENTING LAINNYA


. Pastikan telah menginstal JDK, IntelliJ IDEA, dan Git di PC/laptop Anda sebelum menjalankan test.

. Pastikan telah mengatur konfigurasi WebDriver untuk Selenium sesuai dengan browser yang anda gunakan.

. Perhatikan tag yang di berikan pada setiap test case untuk menjalankan test yang sesuai dengan jenisnya.

. Jangan lupa untuk membuat Pull Request setiap kali akan melakukan perubahan pada repository ini.
