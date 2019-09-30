package com.lee;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author cvLee
 * @Description //TODO
 * @Date 2019-09-21 16:31
 **/
@Component
@PropertySource("classpath:book.properties")
@ConfigurationProperties("book")
public class Book {
    //@Value("${book.id}")
    private String id;
    //@Value("${book.name}")
    private String name;
    //@Value("${book.author}")
    private String author;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
