package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
	public String backendHellob() {
		System.out.println("backendHello");
		roomMapper.findByRoomId("001");
		return "backendHello b";
	}
	
	@RequestMapping("/helloc")
	public String backendHelloc() {
		System.out.println("backendHello");
		return "backendHello c";
	}

}
