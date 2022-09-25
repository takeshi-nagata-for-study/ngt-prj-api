package com.example.ngtproject.controller.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class MemoRequest {

    private String title;
    private String content;
    private String createdAt;

}
