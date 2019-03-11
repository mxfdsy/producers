package com.stream.producers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

/**
 *
 */
@EnableBinding(MySource.class)
public class DiySendService {

    @Autowired
    MySource source;

    public void sendMsg(String msg){
        source.myOutput().send(MessageBuilder.withPayload(msg).build());
    }
}
