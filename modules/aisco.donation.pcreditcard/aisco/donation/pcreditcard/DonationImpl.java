package aisco.donation.pcreditcard;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import aisco.donation.core.DonationComponent;
import payment.page.core.*;
import payment.page.PaymentPageFactory;

public class DonationImpl extends DonationComponent {
	private List<DonationComponent> donationList;  
	private String cvc;
	private String noKartu;
	private String paymentStatus;
	private String expiryDate;
	
	 public DonationImpl() {
        super();
        this.donationList = new ArrayList<>();  
        System.out.println("\nDonation via Payment Credit Card");
	 }

    public DonationImpl(String name, String email, String phone, int amount, String paymentMethod,
    		String cvc, String noKartu, String paymentStatus, String expiryDate ) {
        super(name, email, phone, amount, paymentMethod);
        this.donationList = new ArrayList<>();
        this.cvc = cvc;
        this.noKartu = noKartu;
        this.paymentStatus = paymentStatus;
        this.expiryDate = expiryDate;        
    }

    public void addDonation() {
        donationList.add(new DonationImpl("Anisa", "anisa@jmail.com", "+62878 6654 3321", 2500000, "CreditCard", "123", "1234-5678-9012-3456", "Completed", "12/26"));
        donationList.add(new DonationImpl("Dave", "dave@jmail.com", "+62828 2345 3091", 500000, "CreditCard", "456", "9876-5432-1098-7654", "Completed", "10/25"));
        donationList.add(new DonationImpl("Edo", "edo@jmail.com", "+62828 2345 3091", 300000, "CreditCard", "789", "4567-8901-2345-6789", "Completed", "11/27"));
    }
    
    public void getDonation() {
    	System.out.println(Arrays.asList(donationList));
    }
    
    public String toString() {
        return "- Donasi " + name  + ": " + amount + " Payment Method: " + paymentMethod + " Status:" + paymentStatus;
    }

}