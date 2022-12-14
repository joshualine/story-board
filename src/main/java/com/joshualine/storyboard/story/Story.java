package com.joshualine.storyboard.story;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Story {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String body;
    private LocalDate time;

    public Story(Long id, String body, LocalDate time) {
        this.id = id;
        this.body = body;
        this.time = time;
    }

    public Story(String body, LocalDate time) {
        this.body = body;
        this.time = time;
    }

    public Story() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Story{" +
                "id=" + id +
                ", body='" + body + '\'' +
                ", time=" + time +
                '}';
    }
}
