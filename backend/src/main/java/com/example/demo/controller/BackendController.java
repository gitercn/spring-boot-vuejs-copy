package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.RoomMapper;
import com.example.demo.vo.RoomVO;

@RestController()
@RequestMapping("/api")
public class BackendController {
	
	@Autowired
	private RoomMapper roomMapper;
	
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping("/helloa")
	public String backendHelloa() {
		System.out.println("backendHello");
		RoomVO roomVO1 = new RoomVO();
		roomVO1.setRoomid("001");
		roomVO1.setRoomdetail("INUSE");
		roomMapper.insertRoom(roomVO1);
		
		RoomVO roomVO2 = new RoomVO();
		roomVO2.setRoomid("002");
		roomVO2.setRoomdetail("EMPTY");
		roomMapper.insertRoom(roomVO2);
		
		RoomVO roomVO3 = new RoomVO();
		roomVO3.setRoomid("003");
		roomVO3.setRoomdetail("INUSE");
		roomMapper.insertRoom(roomVO3);
		return "backendHello a";
	}

	@RequestMapping("/hellob")
	public String backendHellob(@RequestBody RoomVO roomVO) {
		System.out.println("backendHello");
		RoomVO roomVOb1 = new RoomVO();
		roomVOb1.setRoomid(roomVO.getRoomid());
		roomVOb1.setRoomdetail(roomVO.getRoomdetail());
		roomMapper.insertRoom(roomVOb1);
		return "backendHello b";
	}
	
	@RequestMapping("/helloc")
	public RoomVO backendHelloc(@RequestBody RoomVO roomVOc) {
		System.out.println(roomVOc.getRoomid());
		RoomVO roomVOc1 = new RoomVO();
		roomVOc1 = roomMapper.selectByRoomid(roomVOc.getRoomid());
		System.out.println(roomVOc1.getRoomdetail());
		return roomVOc1;
	}
	
	@RequestMapping("/insertRoomOnPage1")
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

}
