package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.vo.MeetingroomVO;
import com.example.demo.vo.RoomVO;

@Mapper
public interface MeetingroomMapper {

	@Select("SELECT * FROM meetingroominfo")
	List<MeetingroomVO> selectAllRoom();

	@Insert("INSERT INTO meetingroominfo (meetingroomkey, meetingroomid, capacity, starttm, endtm, topic, updatetm, createtm) values (#{meetingroomkey}, #{meetingroomid}, #{capacity}, #{starttm}, #{endtm}, #{topic}, #{updatetm}, #{createtm})")
	void insertRoom(MeetingroomVO roomOnPage1);

	@Delete("DELETE FROM meetingroominfo where meetingroomkey = #{meetingroomkey}")
	void deleteMeetingroom(MeetingroomVO deleteMeetingroomVO);
	
	@Update("UPDATE meetingroominfo set meetingroomkey = #{meetingroomkey}, meetingroomid = #{meetingroomid}, capacity = #{capacity}, starttm = #{starttm}, endtm = #{endtm}, topic = #{topic}, updatetm = #{updatetm}, createtm = #{createtm} where meetingroomkey = #{meetingroomkey}")
	void updateMeetingroom(MeetingroomVO updateMeetingroomVO);

}
