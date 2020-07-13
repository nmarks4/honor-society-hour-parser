package AppPackage;


public class Member {
	private String name;
	private double totalHours;
	private double tutoringHours;
	private double sponsoredHours;
	private double unsponsoredHours;
	private double sponsoredTutoringHours;
	



	Member(String Name)
	{
		name = Name;
	}
	
	
	public  String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public  double getTotalHours() {
		return totalHours;
	}
	public  void setTotalHours(double totalHours) {
		this.totalHours = totalHours;
	}
	public  double getTutoringHours() {
		return tutoringHours;
	}
	public  void setTutoringHours(double tutoringHours) {
		this.tutoringHours = tutoringHours;
	}
	public  double getSponsoredHours() {
		return sponsoredHours;
	}
	public  void setSponsoredHours(double sponsoredHours) {
		this.sponsoredHours = sponsoredHours;
	}
	public  double getUnsponsoredHours() {
		return unsponsoredHours;
	}
	public  void setUnsponsoredHours(double unsponsoredHours) {
		this.unsponsoredHours = unsponsoredHours;
	}
	
	public double getSponsoredTutoringHours() {
		return sponsoredTutoringHours;
	}
	public void setSponsoredTutoringHours(double sponsoredTutoringHours) {
		this.sponsoredTutoringHours = sponsoredTutoringHours;
	}
	



}
