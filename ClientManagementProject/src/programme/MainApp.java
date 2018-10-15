package programme;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
	
	Job job;
	Customer customer;
	ArrayList <Customer> customerList;
	ArrayList <Job> jobList;
	Scanner scan = new Scanner(System.in);
	
	// Client array
	
	public MainApp () {
		
		customerList = new ArrayList <Customer>();
		jobList = new ArrayList <Job>();
	
	}
	
	// 1. Add client
	
	public void addCustomer(Customer cus) {
		
		this.customer = cus;
		customerList.add(customer);
	}
	
	// 2. Delete client
	
	public void deleteCustomer(Customer cus, int index) {
		
		customerList.remove(index);
	}
	
	// 3. Create customer
	
	public void createJob() {
		
		String ans = "yes";
		Boolean hasJob = false;
		
		// Enter details
		System.out.println("Name: ");
		customer.cusName = scan.next();
		System.out.println("Surname: ");
		customer.cusLast = scan.next();
		System.out.println("Address: ");
		customer.cusAddress = scan.next();
		System.out.println("Notes: ");
		customer.cusNote = scan.next();
		
		// ask user if there is a job
		System.out.println("Enter job now?");
		if(scan.next().equalsIgnoreCase(ans)) {
			
			hasJob = true;
		}
		
		if(hasJob == true) {
		// create job
		createJob(customer);
		}
		else {
			
			customer.job = null;
		}
		
		// add to list
		
				customerList.add(customer);
		
		System.out.println("Customer added");
		
		// display in the list
		
	}
	
	// 4. Create job
	
	public void createJob(Customer cus) {
		
		customer = cus;
		String start, end, entry, address, notes;
		String answer = "yes";
		job = new Job();
		ArrayList <String> photos = new ArrayList<String>();
		
		// Enter details
		System.out.println("Date entry: \n");
		entry = "27/05/2018 \n";
		System.out.println("Date start: ");
		start = "05/06/2018 \n";
		System.out.println("Date end: ");
		end = "20/05/2018 \n";
		System.out.println("Address: ");
		address = "13 Moore Heights/n";
		System.out.println("Notes: ");
		notes = "Clean back yard, pick up keys at 9am on Friday";
		
		System.out.println("\n\nAdd photos?");
		
		if(scan.next().equalsIgnoreCase(answer)) {
			
			// look up file
			// add to array of photos
			
		}
		
		//job = new Job(entry, start, end, address, customer, notes, photos);
		
		// add to list
		//jobList.add());
	}
	
	// 4. Delete job
	// 5. Open job in a separate tab
	// 6. Modify client
	// 7. Modify job
	// 8. Search for job
	// 9. Search for client

	
	

}
