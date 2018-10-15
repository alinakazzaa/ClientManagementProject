package programme;

import java.sql.Date;
import java.util.ArrayList;

public class Job {
	
	Date dateReceived, dateStart, dateEnd;
	String address, jobNote;
	Customer customer;
	ArrayList<String> photos;
	
	public Job() {
		
	}
	
	public Job(Date dateR, Date dateS, Date dateE, String add, Customer cus, String note, ArrayList <String> photos) {
		
		this.dateReceived = dateR;
		this.dateStart = dateS;
		this.dateEnd = dateE;
		this.address = add;
		this.customer = cus;
		this.jobNote = note;
		this.photos = photos;
	}
	
	
	public Date getDateReceived() {
		return dateReceived;
	}
	public void setDateReceived(Date dateReceived) {
		this.dateReceived = dateReceived;
	}
	public Date getDateStart() {
		return dateStart;
	}
	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}
	public Date getDateEnd() {
		return dateEnd;
	}
	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getJobNote() {
		return jobNote;
	}
	public void setJobNote(String jobNote) {
		this.jobNote = jobNote;
	}
	public ArrayList<String> getPhotos() {
		return photos;
	}
	public void setPhotos(ArrayList<String> photos) {
		this.photos = photos;
	}

}
