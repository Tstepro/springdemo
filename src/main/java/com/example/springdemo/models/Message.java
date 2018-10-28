package com.example.springdemo.models;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Message {
    private String id;
    private String time;

    private List<String> to;
    private String from;

    private String text;
    private String applicationId;

    private List<String> media;
    private String owner;
    private String direction;
    private Integer segmentCount;

    public Message() {}

    @Override
    public String toString() {
        return "Message{" +
                "id='" + id + '\'' +
                ", time='" + time + '\'' +
                ", to=" + to +
                ", from='" + from + '\'' +
                ", text='" + text + '\'' +
                ", applicationId='" + applicationId + '\'' +
                ", media=" + media +
                ", owner='" + owner + '\'' +
                ", direction='" + direction + '\'' +
                ", segmentCount=" + segmentCount +
                '}';
    }
}