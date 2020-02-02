package com.ssh.model;

public class User {
	public String name;
	private Integer id;
	public String useName;
	public String paw;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUseName() {
		return useName;
	}

	public void setUseName(String useName) {
		this.useName = useName;
	}

	public String getPaw() {
		return paw;
	}

	public void setPaw(String paw) {
		this.paw = paw;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", useName=" + useName + ", paw=" + paw + "]";
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String useName, String paw) {
		super();
		this.id = id;
		this.useName = useName;
		this.paw = paw;
	}

}
