package com.example.blog.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "anons", nullable = false)
    private  String anons;

    @Column(name = "full_text", nullable = false)
    private String fullText;

    @Column(name = "views")
    private int views;

    public Post(String title, String anons, String fullText) {
        this.title = title;
        this.anons = anons;
        this.fullText = fullText;
    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getAnons() {
//        return anons;
//    }
//
//    public void setAnons(String anons) {
//        this.anons = anons;
//    }
//
//    public String getFullText() {
//        return fullText;
//    }
//
//    public void setFullText(String fullText) {
//        this.fullText = fullText;
//    }
//
//    public int getViews() {
//        return views;
//    }
//
//    public void setViews(int views) {
//        this.views = views;
//    }
//
//    public Post() {
//    }
}
