package net.yasite.entity;

import java.io.Serializable;

public class MJsonDeparments extends Object implements Serializable{
	/**
	 * id\":8,
	 * \"hospitalid\":24,
	 * \"hospitalName\":\"冀中能源峰峰集团有限公司邯郸医院\",
	 * \"departmentid\":3,
	 * \"departmentName\":\"内科\",
	 * \"departmentNameLocal\":\"内科\",
	 * \"device\":\"内科拥有\",
	 * \"description\":\"内科\u003e\"},
	 */
	private int id;
	private String hospitalid;
	private String hospitalName;
	private String departmentid;
	private String departmentName;
	private String departmentNameLocal;
	private String device;
	private String description;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHospitalid() {
		return hospitalid;
	}
	public void setHospitalid(String hospitalid) {
		this.hospitalid = hospitalid;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(String departmentid) {
		this.departmentid = departmentid;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentNameLocal() {
		return departmentNameLocal;
	}
	public void setDepartmentNameLocal(String departmentNameLocal) {
		this.departmentNameLocal = departmentNameLocal;
	}
	public String getDevice() {
		return device;
	}
	public void setDevice(String device) {
		this.device = device;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "MJsonDeparments [id=" + id + ", hospitalid=" + hospitalid
				+ ", hospitalName=" + hospitalName + ", departmentid="
				+ departmentid + ", departmentName=" + departmentName
				+ ", departmentNameLocal=" + departmentNameLocal + ", device="
				+ device + ", description=" + description + "]";
	}
}
