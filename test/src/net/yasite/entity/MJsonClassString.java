package net.yasite.entity;

import java.io.Serializable;
/**
 * 
 * @author 波波
 * @date 2014/11/25/13:54
 */
public class MJsonClassString extends Object implements Serializable{

	/*	数据
		\"id\":3,\"name\":\"123\",
		\"licensenum\":\"123\",
		\"registrationfee\":123,
		\"mobile\":\"123\",
		\"password\":\"123\",
		\"onduty\":\"wer\",
		\"dutylocation\":\"wer\",
		\"majorskill\":\"wer\",
		\"photo\":\"123.jpg|5.jpg\",
		\"description\":\"\",
		\"titleid\":11,
		\"hospitalDepartmentId\":22,
		\"hospitalDepartmentName\":\"CT室科室\"}","
		}","*/
	private int id;
	private String name;
	private String licensenum;
	private String registrationfee;
	private String mobile;
	private String password;
	private String onduty;
	private String dutylocation;
	private String majorskill;
	private String photo;
	private String description;
	private String titleid;
	private String hospitalDepartmentId;
	private String hospitalDepartmentName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLicensenum() {
		return licensenum;
	}
	public void setLicensenum(String licensenum) {
		this.licensenum = licensenum;
	}
	public String getRegistrationfee() {
		return registrationfee;
	}
	public void setRegistrationfee(String registrationfee) {
		this.registrationfee = registrationfee;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getOnduty() {
		return onduty;
	}
	public void setOnduty(String onduty) {
		this.onduty = onduty;
	}
	public String getDutylocation() {
		return dutylocation;
	}
	public void setDutylocation(String dutylocation) {
		this.dutylocation = dutylocation;
	}
	public String getMajorskill() {
		return majorskill;
	}
	public void setMajorskill(String majorskill) {
		this.majorskill = majorskill;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTitleid() {
		return titleid;
	}
	public void setTitleid(String titleid) {
		this.titleid = titleid;
	}
	public String getHospitalDepartmentId() {
		return hospitalDepartmentId;
	}
	public void setHospitalDepartmentId(String hospitalDepartmentId) {
		this.hospitalDepartmentId = hospitalDepartmentId;
	}
	public String getHospitalDepartmentName() {
		return hospitalDepartmentName;
	}
	public void setHospitalDepartmentName(String hospitalDepartmentName) {
		this.hospitalDepartmentName = hospitalDepartmentName;
	}
	@Override
	public String toString() {
		return "MJsonClassString [id=" + id + ", name=" + name
				+ ", licensenum=" + licensenum + ", registrationfee="
				+ registrationfee + ", mobile=" + mobile + ", password="
				+ password + ", onduty=" + onduty + ", dutylocation="
				+ dutylocation + ", majorskill=" + majorskill + ", photo="
				+ photo + ", description=" + description + ", titleid="
				+ titleid + ", hospitalDepartmentId=" + hospitalDepartmentId
				+ ", hospitalDepartmentName=" + hospitalDepartmentName + "]";
	}


}
