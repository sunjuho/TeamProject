package com.sql.cafe.vo;

public class Cafe_optionVO {

	// 카페VO에 통합시킨 이후로 쓰지 않고 있으나 혹시 몰라 아직 지우지는 않음.
	
	private String cafe_id;
	private boolean concent;
	private boolean pet;
	private int seat;
	private boolean wifi;
	private boolean local_money;
	private boolean parking_zone;
	private int studyroom;
	private String toilet;
	
	public String getCafe_id() {
		return cafe_id;
	}
	public void setCafe_id(String cafe_id) {
		this.cafe_id = cafe_id;
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
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public boolean isWifi() {
		return wifi;
	}
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	public boolean isLocal_money() {
		return local_money;
	}
	public void setLocal_money(boolean local_money) {
		this.local_money = local_money;
	}
	public boolean isParking_zone() {
		return parking_zone;
	}
	public void setParking_zone(boolean parking_zone) {
		this.parking_zone = parking_zone;
	}
	public int getStudyroom() {
		return studyroom;
	}
	public void setStudyroom(int sdutyroom) {
		this.studyroom = sdutyroom;
	}
	public String getToilet() {
		return toilet;
	}
	public void setToilet(String toilet) {
		this.toilet = toilet;
	}
	
	
}
