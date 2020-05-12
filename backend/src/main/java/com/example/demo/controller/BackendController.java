package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.MeetingroomMapper;
import com.example.demo.dao.RoomMapper;
import com.example.demo.vo.MeetingroomVO;
import com.example.demo.vo.RoomVO;

@RestController()
@RequestMapping("/api")
public class BackendController {

	@Autowired
	private RoomMapper roomMapper;
	@Autowired
	private MeetingroomMapper meetingroomMapper;

	@RequestMapping("/insertRoom")
	public RoomVO insertRoomOnPage1(@RequestBody RoomVO roomOnPage1) {
		System.out.println(roomOnPage1.getRoomid());
		RoomVO roomVOc1 = new RoomVO();
		roomVOc1 = roomMapper.selectByRoomid(roomOnPage1.getRoomid());
		if (roomVOc1 == null) {
			RoomVO roomVOb1 = new RoomVO();
			roomVOb1.setRoomid(roomOnPage1.getRoomid());
			roomVOb1.setRoomdetail(roomOnPage1.getRoomdetail());
			roomMapper.insertRoom(roomVOb1);
		} else {
			RoomVO roomVOb1 = new RoomVO();
			roomVOb1.setRoomid(roomOnPage1.getRoomid());
			roomVOb1.setRoomdetail(roomOnPage1.getRoomdetail());
			roomMapper.updateRoom(roomVOb1);
		}
		roomVOc1 = roomMapper.selectByRoomid(roomOnPage1.getRoomid());
		return roomVOc1;
	}

	@RequestMapping("/getAllRoom")
	public List<MeetingroomVO> getAllRoom() {
		List<MeetingroomVO> allrooms = new ArrayList<MeetingroomVO>();
		allrooms = meetingroomMapper.selectAllRoom();
		return allrooms;
	}

	@RequestMapping("/insertMeetingroom")
	public String insertMeetingroom(@RequestBody MeetingroomVO insertMeetingroomVO) {

		meetingroomMapper.insertRoom(insertMeetingroomVO);

		return "success";
	}

	@RequestMapping("/deleteMeetingroom")
	public String deleteMeetingroom(@RequestBody MeetingroomVO deleteMeetingroomVO) {
		
		meetingroomMapper.deleteMeetingroom(deleteMeetingroomVO);
		
		return "success";
	}
	
	@RequestMapping("/updateMeetingroom")
	public String updateMeetingroom(@RequestBody MeetingroomVO updateMeetingroomVO) {
		
		meetingroomMapper.updateMeetingroom(updateMeetingroomVO);
		
		return "success";
	}


}
