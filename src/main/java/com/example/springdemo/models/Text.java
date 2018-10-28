package com.example.springdemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.*;

@Data
@AllArgsConstructor
public class Text {

    private String type;
    private String time;
    private String description;
    private String to;

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