package com.hangang.emailProject;

import jdk.jfr.DataAmount;
import lombok.Data;

@Data
public class EmailSendDto {

    private String to;

    private String subject;

    private String body;
}
