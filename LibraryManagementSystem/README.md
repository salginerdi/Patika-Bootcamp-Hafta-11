# Kütüphane Yönetim Sistemi

Bu proje, Spring Boot ile geliştirilmiş bir kütüphane yönetim sistemidir.

## Proje Tanımı

Bu projenin amacı, kütüphane envanterini izlemek ve yönetmek için bir platform sağlamaktır. Uygulama, kitapların, yazarların, kategorilerin, yayınevlerinin ve ödünç alma işlemlerinin yönetimini kolaylaştırır.

## Teknolojiler

- Java
- Spring Boot
- Hibernate
- PostgreSQL
- Maven

Proje, PostgreSQL veritabanını kullanır ve aşağıdaki tabloları içerir:

- `books`: Kitapların bilgilerini saklar.
 ![books](https://github.com/salginerdi/Patika-Bootcamp-Hafta-11/assets/110611268/b4e19deb-7221-4e35-bffc-cb6fab6bc776)

- `authors`: Yazarların bilgilerini saklar.
 ![authors](https://github.com/salginerdi/Patika-Bootcamp-Hafta-11/assets/110611268/32ef6f0f-4567-4f62-b099-d7a16b0d81a3)

- `categories`: Kitap kategorilerini saklar.
 ![book_category](https://github.com/salginerdi/Patika-Bootcamp-Hafta-11/assets/110611268/8f459a83-d0a4-492b-b788-2b096c69b0cb)

- `publishers`: Yayınevlerinin bilgilerini saklar.
 ![publishers](https://github.com/salginerdi/Patika-Bootcamp-Hafta-11/assets/110611268/7236a67c-bce1-4eda-b319-8927bda48c74)

- `book_borrowings`: Kitap ödünç alma işlemlerini saklar.
 ![book_borrowing](https://github.com/salginerdi/Patika-Bootcamp-Hafta-11/assets/110611268/98a7a61e-00e7-4010-92be-e100762d3550)


Her tablo, ilişkisel olarak bağlıdır ve gerekli alanları içerir.

## Nasıl Kullanılır?

- **Kitaplar:** Yeni kitap ekleyebilir, var olanları görüntüleyebilir, düzenleyebilir ve silebilirsiniz.
- **Yazarlar:** Yeni yazar ekleyebilir, var olanları görüntüleyebilir, düzenleyebilir ve silebilirsiniz.
- **Kategoriler:** Yeni kategori ekleyebilir, var olanları görüntüleyebilir, düzenleyebilir ve silebilirsiniz.
- **Yayınevleri:** Yeni yayınevi ekleyebilir, var olanları görüntüleyebilir, düzenleyebilir ve silebilirsiniz.
- **Kitap Ödünç Alma:** Kitapları ödünç alabilir, teslim edebilir ve ödünç alma geçmişini görüntüleyebilirsiniz.


## Çalıştırma

1. Proje dosyalarını klonlayın veya ZIP olarak indirin.
2. PostgreSQL veritabanı oluşturun ve bağlantı bilgilerini `application.properties` dosyasına ekleyin.
3. Terminal veya komut istemcisinde proje dizinine gidin.
4. `mvn spring-boot:run` komutunu kullanarak uygulamayı başlatın.

---------------------------------------------------------------------------------------------------------------------------------------------------

# Library Management System

This project is a library management system developed using Spring Boot.

## Project Description

The aim of this project is to provide a platform for tracking and managing the library inventory. The application simplifies the management of books, authors, categories, publishers, and borrowing transactions.

## Technologies

- Java
- Spring Boot
- Hibernate
- PostgreSQL
- Maven

The project uses a PostgreSQL database and includes the following tables:

- `books`: Stores information about books.
 ![books](https://github.com/salginerdi/Patika-Bootcamp-Hafta-11/assets/110611268/b4e19deb-7221-4e35-bffc-cb6fab6bc776)

- `authors`: Stores information about authors.
 ![authors](https://github.com/salginerdi/Patika-Bootcamp-Hafta-11/assets/110611268/32ef6f0f-4567-4f62-b099-d7a16b0d81a3)

- `categories`: Stores book categories.
 ![book_category](https://github.com/salginerdi/Patika-Bootcamp-Hafta-11/assets/110611268/8f459a83-d0a4-492b-b788-2b096c69b0cb)

- `publishers`: Stores information about publishers.
 ![publishers](https://github.com/salginerdi/Patika-Bootcamp-Hafta-11/assets/110611268/7236a67c-bce1-4eda-b319-8927bda48c74)

- `book_borrowings`: Stores book borrowing transactions.
 ![book_borrowing](https://github.com/salginerdi/Patika-Bootcamp-Hafta-11/assets/110611268/98a7a61e-00e7-4010-92be-e100762d3550)

Each table is related and contains necessary fields.

## How to Use?

- **Books:** You can add new books, view existing ones, edit, and delete them.
- **Authors:** Add new authors, view existing ones, edit, and delete them.
- **Categories:** Add new categories, view existing ones, edit, and delete them.
- **Publishers:** Add new publishers, view existing ones, edit, and delete them.
- **Book Borrowing:** Borrow books, return them, and view borrowing history.

## Running the Project

1. Clone the project files or download them as a ZIP.
2. Create a PostgreSQL database and add the connection details to the `application.properties` file.
3. Navigate to the project directory in your terminal or command prompt.
4. Start the application using the command `mvn spring-boot:run`.
