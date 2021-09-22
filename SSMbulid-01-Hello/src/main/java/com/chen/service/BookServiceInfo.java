package com.chen.service;

import com.chen.dao.BookMapper;
import com.chen.pojo.Books;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author JJ Chen
 * @Description TODO
 * @Version 1.0
 */
public class BookServiceInfo implements BookService {
    private BookMapper bookMapper;


    /**
     * @author JJ Chen
     * @Description //TODO spring可以托管了
     */
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    /**
     * @author JJ Chen
     * @Description //TODO service层调用dao层
     */
    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBooks(Books books) {
        return bookMapper.updateBooks(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }
}
