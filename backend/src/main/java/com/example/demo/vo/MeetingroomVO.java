package com.example.demo.vo;

import java.sql.Timestamp;
import java.util.Date;

public class MeetingroomVO {
	
	private String meetingroomkey;
	private String meetingroomid;
	private String capacity;
	private Timestamp starttm;
	private Timestamp endtm;
	private String creater;
	private String topic;
	private Timestamp updatetm;
	private Timestamp createtm;
	public String getMeetingroomkey() {
		return meetingroomkey;
	}
	public void setMeetingroomkey(String meetingroomkey) {
		this.meetingroomkey = meetingroomkey;
	}
	public String getMeetingroomid() {
		return meetingroomid;
	}
	public void setMeetingroomid(String meetingroomid) {
		this.meetingroomid = meetingroomid;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public Date getStarttm() {
		return starttm;
	}
	public void setStarttm(Timestamp starttm) {
		this.starttm = starttm;
	}
	public Date getEndtm() {
		return endtm;
	}
	public void setEndtm(Timestamp endtm) {
		this.endtm = endtm;
	}
	public String getCreater() {
		return creater;
	}
	public void setCreater(String creater) {
		this.creater = creater;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public Date getUpdatetm() {
		return updatetm;
	}
	public void setUpdatetm(Timestamp updatetm) {
		this.updatetm = updatetm;
	}
	public Date getCreatetm() {
		return createtm;
	}
	public void setCreatetm(Timestamp createtm) {
		this.createtm = createtm;
	}

}
