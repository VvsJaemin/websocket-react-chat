package com.test.chatserver.model;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class Message {

    private String senderName;
    private String receiverName;

    private String message;

    private String date;

    private Status status;

}
