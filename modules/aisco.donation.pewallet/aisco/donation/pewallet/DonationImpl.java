package aisco.donation.pewallet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import aisco.donation.core.DonationComponent;

public class DonationImpl extends DonationComponent {
	private List<DonationComponent> donationList; 
	private String eWalletName;
	private String QRCode;
	private String paymentStatus;

    public DonationImpl() {
        super();
        this.donationList = new ArrayList<>();  
        System.out.println("\nDonation via Payment E-Wallet");
    }

    public DonationImpl(String name, String email, String phone, int amount, String paymentMethod,
    		String eWalletName, String QRCode, String paymentStatus) {
        super(name, email, phone, amount, paymentMethod);
        this.donationList = new ArrayList<>();
        this.eWalletName = eWalletName;
        this.QRCode = QRCode;
        this.paymentStatus = paymentStatus;
    }

    @Override
    public void addDonation() {
        donationList.add(new DonationImpl("Anisa", "anisa@jmail.com", "+62878 6654 3321", 2500000, "EWallet", "GoPay", "QR12345", "Completed"));
        donationList.add(new DonationImpl("Dave", "dave@jmail.com", "+62828 2345 3091", 500000, "EWallet", "OVO", "QR67890", "Completed"));
        donationList.add(new DonationImpl("Edo", "edo@jmail.com", "+62828 2345 3091", 300000, "EWallet", "ShopeePay", "QR54321", "Completed"));
    }
    
    @Override
    public void getDonation() {
    	System.out.println(Arrays.asList(donationList));
    }
    
    public String toString() {
        return "- Donasi " + name  + ": " + amount + " Payment Method: " + paymentMethod + " Dari Platform: " + eWalletName;
    }

}