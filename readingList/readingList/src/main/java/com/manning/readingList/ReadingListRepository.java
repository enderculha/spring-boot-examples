package com.manning.readingList;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by lenovo on 02.08.2017.
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {
    //By extending JpaRepository, ReadingListRepository inherits 18 methods for performing common persistence operations
    //interface is implemented automatically at runtime when application is started.
    List<Book> findByReader(String reader);
}
