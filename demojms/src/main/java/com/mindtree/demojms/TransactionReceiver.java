package com.mindtree.demojms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class TransactionReceiver {
	@JmsListener(destination = "TransactionQueue")
		   public void messageReceiver(String Transaction) {
		      System.out.println(Transaction);
		      System.out.println("Transaction Received");

		   }

}
