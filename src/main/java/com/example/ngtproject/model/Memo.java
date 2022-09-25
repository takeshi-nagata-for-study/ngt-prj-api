package com.example.ngtproject.model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Memo {

    private String title;
    private String content;
    private String createdAt;

}
