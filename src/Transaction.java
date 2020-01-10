public class Transaction {
	
	private int id;
	private String name;
	private int qty;
	private String date;
	

	public Transaction(int id, String name, int qty, String date) {
		super();
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.date = date;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


}
