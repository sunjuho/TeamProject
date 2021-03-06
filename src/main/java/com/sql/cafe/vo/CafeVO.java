package com.sql.cafe.vo;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CafeVO {

	// Cafe Table column
	

	private String cafe_id;
	
	private String owner_id;
	
	@NotBlank(message="카페명을 입력 해주세요.")
	@Size(min=2,max=45,message = "카페명은 2~15자 이내로 입력해 주세요.")
	private String cafe_name;
	
	private String gu;
	
	@NotBlank(message="주소를 입력해 주세요.")
	@Size(min=3,max=45,message = "주소는 3~20자 이내로 입력해 주세요.")
	private String address;
	
	private boolean event;
	private String homepage;
	private String intro;
	private Date create_time;
	private boolean concent;
	private boolean pet;
	private boolean wifi;
	private boolean parking_zone;
	private boolean smoking_room;
	private boolean toilet;
	private String img_main;
	private String img01;
	private String img02;
	private String img03;
	private String img04;
	private String img05;
	private String img06;
	private String operating_time;
	private String lat;
	private String lng;
	private boolean approval;
	private String cafe_tel;
	
	
	//즐겨찾기용 유저 아이디
	private String user_id;
	
	//별점 평균을 출력하기 위한 변수.
	private double avg_star;
	
	public String getCafe_id() {
		return cafe_id;
	}

	public void setCafe_id(String cafe_id) {
		this.cafe_id = cafe_id;
	}

	public String getOwner_id() {
		return owner_id;
	}

	public void setOwner_id(String owner_id) {
		this.owner_id = owner_id;
	}

	public String getCafe_name() {
		return cafe_name;
	}

	public void setCafe_name(String cafe_name) {
		this.cafe_name = cafe_name;
	}

	public String getGu() {
		return gu;
	}

	public void setGu(String gu) {
		this.gu = gu;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isEvent() {
		return event;
	}

	public void setEvent(boolean event) {
		this.event = event;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public boolean isConcent() {
		return concent;
	}

	public void setConcent(boolean concent) {
		this.concent = concent;
	}

	public boolean isPet() {
		return pet;
	}

	public void setPet(boolean pet) {
		this.pet = pet;
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	public boolean isParking_zone() {
		return parking_zone;
	}

	public void setParking_zone(boolean parking_zone) {
		this.parking_zone = parking_zone;
	}

	public boolean isSmoking_room() {
		return smoking_room;
	}

	public void setSmoking_room(boolean smoking_room) {
		this.smoking_room = smoking_room;
	}

	public boolean isToilet() {
		return toilet;
	}

	public void setToilet(boolean toilet) {
		this.toilet = toilet;
	}

	public String getImg_main() {
		return img_main;
	}

	public void setImg_main(String img_main) {
		this.img_main = img_main;
	}

	public String getImg01() {
		return img01;
	}

	public void setImg01(String img01) {
		this.img01 = img01;
	}

	public String getImg02() {
		return img02;
	}

	public void setImg02(String img02) {
		this.img02 = img02;
	}

	public String getImg03() {
		return img03;
	}

	public void setImg03(String img03) {
		this.img03 = img03;
	}

	public String getImg04() {
		return img04;
	}

	public void setImg04(String img04) {
		this.img04 = img04;
	}

	public String getImg05() {
		return img05;
	}

	public void setImg05(String img05) {
		this.img05 = img05;
	}

	public String getImg06() {
		return img06;
	}

	public void setImg06(String img06) {
		this.img06 = img06;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getOperating_time() {
		return operating_time;
	}

	public void setOperating_time(String operating_time) {
		this.operating_time = operating_time;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public boolean isApproval() {
		return approval;
	}

	public void setApproval(boolean approval) {
		this.approval = approval;
	}

	public String getCafe_tel() {
		return cafe_tel;
	}

	public void setCafe_tel(String cafe_tel) {
		this.cafe_tel = cafe_tel;
	}

	public double getAvg_star() {
		return avg_star;
	}

	public void setAvg_star(double avg_star) {
		this.avg_star = avg_star;
	}


}
