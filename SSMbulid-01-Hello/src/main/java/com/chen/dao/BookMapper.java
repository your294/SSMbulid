package com.chen.dao;

import com.chen.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 86199
 */
public interface BookMapper {
    /**
     * @author JJ Chen
     * @Description //TODO 增删改查
     */
    int addBook(Books books);

    int deleteBookById(@Param("bookId") int id);

    int updateBooks(Books books);

    Books queryBookById(@Param("bookId") int id);

    List<Books> queryAllBooks();


}
