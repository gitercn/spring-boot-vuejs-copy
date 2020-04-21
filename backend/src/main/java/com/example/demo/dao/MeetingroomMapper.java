package com.example.demo.dao;

import java.util.List;

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
	  
	  @Insert("INSERT INTO room (roomid, roomdetail) values (#{roomid}, #{roomdetail})")
	  int insertRoom(RoomVO roomVO);
	  
	  @Update("UPDATE room set roomdetail = #{roomdetail} where roomid = #{roomid}")
	  int updateRoom(RoomVO roomVO);

}
