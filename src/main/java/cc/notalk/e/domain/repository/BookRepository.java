package cc.notalk.e.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cc.notalk.e.domain.entity.Book;

public interface BookRepository extends JpaRepository<Book, String> {
}
