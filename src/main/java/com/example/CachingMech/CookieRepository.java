package com.example.CachingMech;

import org.springframework.boot.web.server.Cookie;

public interface CookieRepository {
    Cookies getById(String id);
}
