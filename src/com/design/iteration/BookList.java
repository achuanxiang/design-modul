package com.design.iteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Auther: chuan
 * @Date: 2019/9/12 14:20
 * @Description: 迭代容器
 */
public class BookList {

    private List<Book> bookList;

    private int index;

    public BookList() {
        bookList = new ArrayList<>();
    }

    public  void  addBook(Book book){
        bookList.add(book);
    }

    public void removeBook(Book book){
        bookList.remove(book);
    }

    public Iterator iterator(){
        return  new itm();
    }

    public class  itm implements Iterator{
        @Override
        public void remove() {

        }

        @Override
        public void forEachRemaining(Consumer action) {

        }

        @Override
        public boolean hasNext() {

            if (index >= bookList.size() - 1){
                return false;
            }
            return true;
        }

        @Override
        public Object next() {
            return bookList.get(index++);
        }
    }

}