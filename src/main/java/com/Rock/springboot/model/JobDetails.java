package com.Rock.springboot.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.joda.time.LocalDate;

@XmlRootElement(name = "job")
public class JobDetails {

	private String title;
	private String date;
	private String referencenumber;
	private String url;
	private String company;
	
	private String city;
	private String state;
	private String zip;
	private String description;
	private String major_category0;
	private String minor_category0;
	private String price;
	private String mobile;
	private String updated;
	
	@XmlElement(name = "title")
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@XmlElement(name = "date")
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	@XmlElement(name = "referencenumber")
	public String getReferencenumber() {
		return referencenumber;
	}
	public void setReferencenumber(String referencenumber) {
		this.referencenumber = referencenumber;
	}
	
	@XmlElement(name = "url")
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	@XmlElement(name = "company")
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	@XmlElement(name = "city")
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@XmlElement(name = "state")
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@XmlElement(name = "zip")
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	@XmlElement(name = "description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@XmlElement(name = "major_category0")
	public String getMajor_category0() {
		return major_category0;
	}
	public void setMajor_category0(String major_category0) {
		this.major_category0 = major_category0;
	}
	
	@XmlElement(name = "minor_category0")
	public String getMinor_category0() {
		return minor_category0;
	}
	
	public void setMinor_category0(String minor_category0) {
		this.minor_category0 = minor_category0;
	}
	
	@XmlElement(name = "price")
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	@XmlElement(name = "mobile")
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	@XmlElement(name = "updated")
	public String getUpdated() {
		return updated;
	}
	public void setUpdated(String updated) {
		this.updated = updated;
	}
	
	@Override
	public String toString() {
		return "JobDetails [title=" + title + ", date=" + date + ", referencenumber=" + referencenumber + ", url=" + url
				+ ", company=" + company + ", city=" + city + ", state=" + state + ", zip=" + zip + ", description="
				+ description + ", major_category0=" + major_category0 + ", minor_category0=" + minor_category0
				+ ", price=" + price + ", mobile=" + mobile + ", updated=" + updated + ", getTitle()=" + getTitle()
				+ ", getDate()=" + getDate() + ", getReferencenumber()=" + getReferencenumber() + ", getUrl()="
				+ getUrl() + ", getCompany()=" + getCompany() + ", getCity()=" + getCity() + ", getState()="
				+ getState() + ", getZip()=" + getZip() + ", getDescription()=" + getDescription()
				+ ", getMajor_category0()=" + getMajor_category0() + ", getMinor_category0()=" + getMinor_category0()
				+ ", getPrice()=" + getPrice() + ", getMobile()=" + getMobile() + ", getUpdated()=" + getUpdated()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	
	
}
