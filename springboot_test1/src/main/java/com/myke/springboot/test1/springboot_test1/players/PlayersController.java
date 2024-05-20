package com.myke.springboot.test1.springboot_test1.players;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("players")
public class PlayersController {
	
	@Autowired
	private PlayersServiceImpl playerService;
	
	@GetMapping("get-players")
	public ResponseEntity<Map<String,Object>> getAllPlayer(){
		Map<String,Object> map = new HashMap<String,Object>();
		ResponseEntity<Map<String,Object>> resp = null;
//		try {
//			List<Player> players = playerService.getAllPlayers();
//			System.out.println(new JSONObject(players));
//			players.forEach((p)-> System.out.println(new JSONObject(p)));
//			map.put("Result", "SUCCESS");
//			map.put("List", players);
//			resp = new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
//		} catch (Exception e) {
//			map.put("Result", "ERROR");
//			map.put("Message", e.getMessage());
//			resp = new ResponseEntity<Map<String,Object>>(map, HttpStatus.BAD_REQUEST);
//		}
		return resp;
	}
	

}
