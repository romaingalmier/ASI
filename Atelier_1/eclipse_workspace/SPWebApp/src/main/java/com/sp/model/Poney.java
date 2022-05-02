package com.sp.model;

public class Poney  {
	private String color;
	private String superPower;
	private String name;
	private String imgUrl;

	public Poney() {
		this.color = "";
		this.superPower = "";
		this.name = "";
		this.imgUrl="";
	}
	public Poney(String name,String color,String superPower, String imgUrl) {
		this.color = color;
		this.superPower = superPower;
		this.name = name;
		this.imgUrl=imgUrl;
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

  // GETTER AND SETTER
}