package com.example.demo.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.vo.RoomVO;

@Mapper
public interface RoomMapper {
	
	  @Select("SELECT * FROM ROOM WHERE roomid = #{roomid}")
	  RoomVO findByRoomId(@Param("roomid") String roomid);
	  
	  @Insert("INSERT INTO room (roomid, roomdetail) values (#{roomid}, #{roomdetail})")
	  int insertRoom(RoomVO roomVO);
	  
	  RoomVO selectByRoomid(String roomid);

}
