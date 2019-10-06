package com.bo.service;

import com.bo.entity.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName UserService
 * @Description TODO
 * @autor dq_ge
 * @Date 2019/9/28
 * @Version 1.0
 **/

public class BookService {

    public static List<Book> init() {
        List<Book> bookList = new ArrayList<>(10);
        Book[] books = {
                new Book(1, "嬴政", "1.jpg", "小三"),
                new Book(2, "墨鸦-白凤", "2.jpg", "无情豆腐"),
                new Book(3, "逆鳞", "3.jpg", "安检"),
                new Book(4, "焰灵姬", "4.jpg", "天之国"),
                new Book(5, "天泽", "5.png", "阿斯弗"),
                new Book(6, "焰灵姬", "7.jpeg", "三国殿"),
                new Book(7, "焰灵姬", "8.jpeg", "烽火"),
                new Book(8, "焰灵姬", "9.jpg", "三年之约"),
                new Book(9, "天泽", "10.jpg", "千夫长"),
                new Book(10, "焰灵姬", "11.jpg", "伤感的故事"),
                new Book(11, "韩非", "6.jpeg", "无情"),
                new Book(12, "潮女妖", "14.jpg", "艾斯芬尼")

        };
        bookList = Arrays.asList(books);
        return bookList;
    }

    public static void main(String[] args) {
        List<Book> bookList = BookService.init();
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}