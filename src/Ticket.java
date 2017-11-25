import java.util.ArrayList;

public class Ticket {

	public String type;
	public String date;
	public double price;
	public int discount;
	public String voucher;

	
	public Ticket(double price, String date,String type,int discount,String voucher) {
		this.price = price;
		this.date = date;
		this.type = type;
		this.discount = discount;
		this.voucher = voucher;
	}
	
	// bulder pattern
	public static class Builder {
		private double price;
		private String date;
		private String type;
		private int discount;
		private String voucher;
		
		public Builder withPrice(double price){
			this.price = price;
			return this;
		}
		
		public Builder withDate(String date) {
			this.date = date;
			return this;
		}
		
		public Builder withType(String type) {
			this.type = type;
			return this;
		}
		
		public Builder withDiscount(int discount) {
			this.discount = discount;
			return this;
		}
		
		public Builder withVoucher(String voucher) {
			this.voucher = voucher;
			return this;
		}
		
		public Ticket build() {
			Ticket ticket = new Ticket();
			ticket.price = this.price;
			ticket.date = this.date;
			ticket.type = this.type;
			ticket.discount = this.discount;
			ticket.voucher = this.voucher;
			
			return ticket;
		}
		
		
	}
	
	Ticket() {
		
	}
	
	
}