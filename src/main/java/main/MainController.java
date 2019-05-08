package main;

import model.Article;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class MainController {

    public static void main(String[] args) {
        SpringApplication.run(MainController.class, args);
    }


    List<Article> articleList = new ArrayList<Article>(Arrays.asList(
            new Article("1", "Article 01", "Description 01"),
            new Article("2", "Article 02", "Description 02"),
            new Article("3", "Article 03", "Description 03")));







}