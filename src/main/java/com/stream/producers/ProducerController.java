package com.stream.producers;

import org.apache.kafka.common.network.Send;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class ProducerController {


    @Autowired
    DiySendService diySendService;

    @Autowired
    private SendService sendService;

    @RequestMapping("/sendDiy/{msg}")
    public void diySend(@PathVariable("msg") String msg){
        diySendService.sendMsg(msg);
    }

    @RequestMapping("/send/{msg}")
    public void send(@PathVariable("msg") String msg){
        sendService.sendMsg(msg);
    }
}
