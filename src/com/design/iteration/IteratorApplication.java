package com.design.iteration;

import java.util.Iterator;
import java.util.List;

/**
 * @Auther: chuan
 * @Date: 2019/9/12 14:18
 * @Description:
 */
public class IteratorApplication {

    public static void main(String[] args) {
           Book book1 = new Book("java从入门到精通",67);
           Book book2 = new Book("python入门与实战",123);
           Book book3 = new Book("新的世界",56);
           BookList bookList = new BookList();
           bookList.addBook(book1);
           bookList.addBook(book2);
           bookList.addBook(book3);

           Iterator iterator = bookList.iterator();
           while (iterator.hasNext()){
               Book next = (Book) iterator.next();
               System.out.println(next);
           }
    }

}