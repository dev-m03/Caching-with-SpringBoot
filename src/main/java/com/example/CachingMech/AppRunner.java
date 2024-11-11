package com.example.CachingMech;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);

    private final CookieRepository cookieRepository;

    // Constructor injection for CookieRepository
    public AppRunner(CookieRepository cookieRepository) {
        this.cookieRepository = cookieRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info(".... Fetching cookies boxes");
        logger.info("id-1234 -->" + cookieRepository.getById("id-1234"));
        logger.info("id-4567 -->" + cookieRepository.getById("id-4567"));
        logger.info("id-1234 -->" + cookieRepository.getById("id-1234"));
        logger.info("id-4567 -->" + cookieRepository.getById("id-4567"));
        logger.info("id-1234 -->" + cookieRepository.getById("id-1234"));
        logger.info("id-1234 -->" + cookieRepository.getById("id-1234"));
    }
}
