package com.personnel.metier;



public class Personnel{
	private int id;
	private String passeword;
	private String type;
	private int archivage;
	public Personnel(int id, String passeword, String type, int archivage) {
		super();
		this.id = id;
		this.passeword = passeword;
		this.type = type;
		this.archivage = archivage;
	}
	public Personnel(String passeword, String type, int archivage) {
		super();
		this.passeword = passeword;
		this.type = type;
		this.archivage = archivage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPasseword() {
		return passeword;
	}
	public void setPasseword(String passeword) {
		this.passeword = passeword;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getArchivage() {
		return archivage;
	}
	public void setArchivage(int archivage) {
		this.archivage = archivage;
	}
	

}
