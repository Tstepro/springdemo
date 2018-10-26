package com.example.springdemo.models;


import com.example.springdemo.models.Message;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
public class Text {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String type;
    private String time;
    private String description;
    private String to;

    @Embedded
    private Message message;

    public Text() {}

    @Override
    public String toString() {
        return "Text{" +
                "type='" + type + '\'' +
                ", time='" + time + '\'' +
                ", description='" + description + '\'' +
                ", to='" + to + '\'' +
                ", message=" + message +
                '}';
    }
}
