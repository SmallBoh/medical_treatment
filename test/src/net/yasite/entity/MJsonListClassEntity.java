package net.yasite.entity;

import java.io.Serializable;
/**
 * 
 * @author 波波
 *@date 2014/11/25/12:48
 */
public class MJsonListClassEntity extends Object implements Serializable{
	/**
	 * [{\"id\":24,
	 * \"name\":\"冀中能源峰峰集团有限公司邯郸医院\",
	 * \"tel\":\"0310-211910\",
	 * \"locationid\":28,
	 * \"latitude\":1,
	 * \"longitude\":2,
	 * \"logo\":\"\",
	 * \"description\":
	 * \"峰峰集团邯郸医院隶属于 办公电话：0310-2119101 体检中心：0310-2119144\",
	 * \"level\":\"三级甲等医院\",
	 * \"type\":\"综合医院\",
	 * \"leader\":\"彭风芹，女，\",
	 * \"honorTitle\":\"冀中能源峰峰集团进入世界500强\"}]","
	 */
	private int id;
	private String name;
	private String tel;
	private String locationid;
	private String latitude;
	private String longitude;
	private String logo;
	private String description;
	private String level;
	private String type;
	private String leader;
	private String honorTitle;
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getLocationid() {
		return locationid;
	}
	public void setLocationid(String locationid) {
		this.locationid = locationid;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLeader() {
		return leader;
	}
	public void setLeader(String leader) {
		this.leader = leader;
	}
	public String getHonorTitle() {
		return honorTitle;
	}
	public void setHonorTitle(String honorTitle) {
		this.honorTitle = honorTitle;
	}
	@Override
	public String toString() {
		return "MJsonListClassEntity [id=" + id + ", name=" + name + ", tel="
				+ tel + ", locationid=" + locationid + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", logo=" + logo
				+ ", description=" + description + ", level=" + level
				+ ", type=" + type + ", leader=" + leader + ", honorTitle="
				+ honorTitle + "]";
	}
}
