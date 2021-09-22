package com.chen.controller;

import com.chen.pojo.Books;
import com.chen.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author JJ Chen
 * @Description TODO
 * @Version 1.0
 */
@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("bookServiceInfo")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> list = bookService.queryAllBooks();
        model.addAttribute("list", list);
        return "allBook";
    }

    @RequestMapping("/toAddBook")
    public String toAddBook(){
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addBook01(Books books){
        System.out.println("addBook=>" + books);
        bookService.addBook(books);
        //重定向请求
        return "redirect:/book/allBook";
    }

    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(Model model, int id) {
        Books books = bookService.queryBookById(id);
        System.out.println(books);
        model.addAttribute("Qbook",books);
        return "updateBook";
    }
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        System.out.println(books);
        bookService.updateBooks(books);
        return "redirect:/book/allBook";
    }

}
