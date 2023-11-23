import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        // Add author
        Author author = new Author();
        author.setName("Suzanne Collins");
        author.setCountry("USA");
        author.setOnDate(LocalDate.parse("1968-08-10"));

        entityManager.persist(author);

        // Add book
        Book book = new Book();
        book.setName("The Ballad of Songbirds and Snakes");
        book.setStock(45);
        book.setYear(2020);
        book.setAuthor(author);
        entityManager.persist(book);

        transaction.commit();
    }
}
