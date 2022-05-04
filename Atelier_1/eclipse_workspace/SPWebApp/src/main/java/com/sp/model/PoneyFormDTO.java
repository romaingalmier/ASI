package com.sp.model;

public class PoneyFormDTO  {

	private String color;
	private String superPower;
	private String name;
	private String imgUrl;
	private int defence;

	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
	
	public PoneyFormDTO() {
		this.color = "";
		this.superPower = "";
		this.name = "";
		this.imgUrl="";
		this.defence=0;
	}
	public PoneyFormDTO(String name,String color,String superPower, String imgUrl,int defence) {
		this.color = color;
		this.superPower = superPower;
		this.name = name;
		this.imgUrl=imgUrl;
		this.defence=defence;
	}
	public String getName() {
		String ret = this.name;
		return ret;
	}
	public String getColor() {
		return color;
	}
	public String getSuperPower() {
		return superPower;
		
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setSuperPower(String superPower) {
		this.superPower = superPower;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDefence() {
		return defence;
	}
	public void setDefence(int defence) {
		this.defence = defence;
	}
	
	
	
}