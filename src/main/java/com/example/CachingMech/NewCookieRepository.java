package com.example.CachingMech;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.awt.print.Book;
@Component
public class NewCookieRepository implements CookieRepository{
    @Override
@Cacheable("books")
    public Cookies getById(String id) {
        simulateSlowService();
        return new Cookies(id,"Some Cookie");
    }

    private void simulateSlowService() {
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
    }
}}
