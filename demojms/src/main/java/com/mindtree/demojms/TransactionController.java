package com.mindtree.demojms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {
	 @Autowired
	   private JmsTemplate jmsTemplate;
	 
	 @PostMapping("/send")
	   public void send(@RequestBody Transaction transaction){
		 System.out.println("sending a transaction");
	      jmsTemplate.convertAndSend("TransactionQueue", transaction.toString());
	   }

}
