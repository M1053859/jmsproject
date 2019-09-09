package com.mindtree.demojms;

public class Transaction {
	private String transactionId;
	private String from;
	private String to;
	private int amount;
	public Transaction(String transactionId, String from, String to, int amount) {
		super();
		this.transactionId = transactionId;
		this.from = from;
		this.to = to;
		this.amount = amount;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", from=" + from + ", to=" + to + ", amount=" + amount
				+ "]";
	}
	

}
