package cc.notalk.e.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cc.notalk.e.domain.repository.BookRepository;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

}
