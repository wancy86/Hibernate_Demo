package ORM;

import java.util.Date;

public class Students {

	/*
	 * 1.公有类 2.私有属性，公有setter，getter
	 */
	public Students() {

	}

	public Students(int sid, String name, String gender, Date birthday, String address) {
		// super();
		this.sid = sid;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
	}
	
	/*
		use test;
		drop table students;
		create table students(
		sid int primary key,
		name varchar(30),
		gender varchar(10),
		birthday datetime,
		address varchar(100)		
		);

	 */

	@Override
	public String toString() {
		return "Students [sid=" + sid + ", name=" + name + ", gender=" + gender + ", birthday=" + birthday + ", address=" + address + "]";
	}

	private int sid;
	private String name;
	private String gender;
	private Date birthday;
	private String address;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
