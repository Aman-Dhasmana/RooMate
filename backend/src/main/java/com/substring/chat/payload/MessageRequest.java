package com.substring.chat.payload;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
public class MessageRequest {
    private String content;
    private String sender;
    private String roomId;


}
