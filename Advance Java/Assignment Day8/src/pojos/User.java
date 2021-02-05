package pojos;
//Add these Data members
//userId (PK) :Integer ,name,email,password,role(enum),confirmPassword, regAmount;
//	 LocalDate/Date regDate;
//	 byte[] image;

import java.time.LocalDate;
import java.util.Arrays;
import javax.persistence.*;


// mandatory rule for Hibernate POJO: POJO's ID property Must be Serializable
@Entity  // mandatory annotation
@Table(name="users_tbl") // to change table name // never give space in it
public class User {
	private Integer userId;          // we have to use INTEGER as it is primary key
	private String name,email,password;
	private Role userRole;
	private String Confirmpassword;
	private double regAmount;
	private LocalDate regDate;
	private byte[] image;
	
	//========Costructors===========================
	// name i=of table wiill be user
	// compulsory parameterless constructor
	
	public User() {
		System.out.println("IN USER CONST..!!!");
	}

	//Construcor must not contain primary key as it is already define automatic
	// aslo do not contain image(img)
	public User(String name, String email, String password, Role userRole, String confirmpassword, double regAmount,
			LocalDate regDate) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.userRole = userRole;
		Confirmpassword = confirmpassword;
		this.regAmount = regAmount;
		this.regDate = regDate;
	}

	
	//========Setter Getter======================
	// setters and getters should be all
	@Id // mandatory
	@Column(name = "user_id")
	@GeneratedValue (strategy = GenerationType.IDENTITY) //auto id generation by system.. Scheme:- Hibernate will pickup native DB scheme
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	@Column(length = 20)//varchar(20) // for each field level we are giving name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(length =20, unique =true)// UNIQUE Constraint // so email will be unique
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(length =20, nullable =false) // NOT NULL
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Enumerated(EnumType.STRING)// type will be varchar(Const name)    // if we didn't use annotation here then in database there will be number not constants
	@Column(length = 30, name="user_role")// col name= user_role
	public Role getUserRole() {
		return userRole;
	}

	public void setUserRole(Role userRole) {
		this.userRole = userRole;
	}
	
	@Transient  //transient means skip from serialization/ Persistance
	public String getConfirmpassword() {
		return Confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		Confirmpassword = confirmpassword;
	}
	
	@Column(name="reg_amount")
	public double getRegAmount() {
		return regAmount;
	}

	public void setRegAmount(double regAmount) {
		this.regAmount = regAmount;
	}
	@Column(name="reg_date")   // bydefault hibernate create only (date type) so no notation require for format  
	public LocalDate getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
	@Lob  //large Object  // in MYSQL column tpe will be LongBlob//			//B-LOB - binary large Object so we can include any binary object
	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	
	//======toString=====================
	
	@Override
	public String toString() {
		return "user [userId=" + userId + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", userRole=" + userRole + ", Confirmpassword=" + Confirmpassword + ", regAmount=" + regAmount
				+ ", regDate=" + regDate + ", image=" + Arrays.toString(image) + "]";
	}
	

	
	
	
	
}

// who will manage this pojo....   -> hibernate 
// hibernate is not too good to understand so we have to have xml tag or annotation
// for every pojo we have to give xml file..... so better approch is annotation
//in java peristance package there is entety annotation 
// when you say @id : PK Constraint.......corrospond to pk constraint in column
//so Id must be assign by the user.. but if we want automatically system generated PK 
// then add @Generatedvalue....Scheme:- Hibernate will pickup native DB scheme
// we can use diff Strategy by using keyword Strategy