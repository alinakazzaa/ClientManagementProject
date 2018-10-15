package programme;

public class Customer {
	
	String cusName, cusLast;
	String cusNum;
	String cusAddress;
	double cusBalance;
	String cusNote;
	Job job;
	
	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public Customer() {
		
	}
	
	public Customer(String name, String last, String num, String add, double balance, String note, Job j) {
		
		this.cusName = name;
		this.cusLast = last;
		this.cusNum = num;
		this.cusAddress = add;
		this.cusBalance = balance;
		this.cusNote = note;
		this.job = j;
		
	}
	
	
	public String getCusName() {
		return cusName;
	}
	
	public String getCusLast() {
		
		return cusLast;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	
	public void setCusLast (String last) {
		
		this.cusLast = last;
	}

	public String getCusNum() {
		return cusNum;
	}
	public void setCusNum(String cusNum) {
		this.cusNum = cusNum;
	}
	public String getCusAddress() {
		return cusAddress;
	}
	public void setCusAddress(String cusAddress) {
		this.cusAddress = cusAddress;
	}
	public double getCusBalance() {
		return cusBalance;
	}
	public void setCusBalance(double cusBalance) {
		this.cusBalance = cusBalance;
	}
	public String getCusNote() {
		return cusNote;
	}
	public void setCusNote(String cusNote) {
		this.cusNote = cusNote;
	}
	
	

}
