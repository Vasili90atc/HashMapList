package gr.atc.training.hashMapList;

public class User {
	public int id;
	public String firstName;
	public String lastName;
	public String maiderName;
	public int age;
	public String gender;
	public String email;
	public String phone;
	public String username;
	public String password;
	public String birthDate;
	public String image;
	public String bloodGroup;
	public int height;
	public double weight;
	public String eyeColor;
	public Hair hair;
	public String domain;
	public String ip;
	public Address address;
	public String macAddress;
	public String university;
	public Bank bank;
	public Company company;
	public String ein;
	public String ssn;
	public String userAgent;

	public User(int id, String firstName, String lastName, String maiderName, int age, String gender, String email,
			String phone, String username, String password, String birthDate, String image, String bloodGroup,
			int height, double weight, String eyeColor, Hair hair, String domain, String ip, Address address,
			String macAddress, String university, Bank bank, Company company, String ein, String ssn,
			String userAgent) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.maiderName = maiderName;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.username = username;
		this.password = password;
		this.birthDate = birthDate;
		this.image = image;
		this.bloodGroup = bloodGroup;
		this.height = height;
		this.weight = weight;
		this.eyeColor = eyeColor;
		this.hair = hair;
		this.domain = domain;
		this.ip = ip;
		this.address = address;
		this.macAddress = macAddress;
		this.university = university;
		this.bank = bank;
		this.company = company;
		this.ein = ein;
		this.ssn = ssn;
		this.userAgent = userAgent;
	}


	public String getUsername() {
		return username;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", maiderName=" + maiderName
				+ ", age=" + age + ", gender=" + gender + ", email=" + email + ", phone=" + phone + ", username="
				+ username + ", password=" + password + ", birthDate=" + birthDate + ", image=" + image
				+ ", bloodGroup=" + bloodGroup + ", height=" + height + ", weight=" + weight + ", eyeColor=" + eyeColor
				+ ", hair=" + hair + ", domain=" + domain + ", ip=" + ip + ", address=" + address + ", macAddress="
				+ macAddress + ", university=" + university + ", bank=" + bank + ", company=" + company + ", ein=" + ein
				+ ", ssn=" + ssn + ", userAgent=" + userAgent + "]";
	}
	
	
	
}
