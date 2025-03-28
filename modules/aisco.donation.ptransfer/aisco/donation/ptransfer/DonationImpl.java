package aisco.donation.ptransfer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import aisco.donation.core.DonationComponent;
import payment.page.core.*;
import payment.page.PaymentPageFactory;

public class DonationImpl extends DonationComponent {
	private List<DonationComponent> donationList;  
    PaymentPage payment;
    private String bankName;
    private String accountNumber;
    private String paymentStatus;

    public DonationImpl() {
        super();
        this.donationList = new ArrayList<>();  
        System.out.println("\nDonation via Payment Transfer");
    }

    public DonationImpl(String name, String email, String phone, int amount, String paymentMethod,
    		String bankName, String accountNumber, String paymentStatus) {
        super(name, email, phone, amount, paymentMethod);
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.paymentStatus = paymentStatus;
        this.donationList = new ArrayList<>();
    }

    public void addDonation() {
        donationList.add(new DonationImpl("Anisa", "anisa@jmail.com", "+62878 6654 3321", 2500000, "Transfer", "BCA", "1234567890", "Completed"));
        donationList.add(new DonationImpl("Dave", "dave@jmail.com", "+62828 2345 3091", 500000, "Transfer", "Mandiri", "0987654321", "Completed"));
        donationList.add(new DonationImpl("Edo", "edo@jmail.com", "+62828 2345 3091", 300000, "Transfer", "BNI", "4567891234", "Completed"));
        donationList.add(new DonationImpl("Budi", "budi@jmail.com", "+62828 2345 3091", 900000, "Transfer", "BRI", "5678901234", "Completed"));
    }
    
    public void getDonation() {
    	System.out.println(Arrays.asList(donationList));
    }
    
    public String toString() {
        return "- Donasi " + name  + ": " + amount + " Payment Method: " + paymentMethod;
    }

}