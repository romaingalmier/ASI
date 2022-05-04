package com.sp.model;

public class Poney  {
	private String color;
	private String superPower;
	private String name;
	private String imgUrl;
	private int defence;

	public Poney() {
		this.color = "";
		this.superPower = "";
		this.name = "";
		this.imgUrl="";
		this.defence=0;
	}
	public Poney(String name,String color,String superPower, String imgUrl, int defence) {
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
	public String getImgUrl() {
		return imgUrl;
	}
	public int getDefence() {
		return defence;
	}
	

  // GETTER AND SETTER
}
