package com.chen.service;

import com.chen.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 86199
 */
public interface BookService {
    int addBook(Books books);

    int deleteBookById(int id);

    int updateBooks(Books books);

    Books queryBookById(int id);

    List<Books> queryAllBooks();
}
