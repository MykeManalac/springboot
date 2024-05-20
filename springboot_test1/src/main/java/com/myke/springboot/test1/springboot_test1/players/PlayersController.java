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
		try {
			List<Player> players = playerService.getAllPlayers();
			System.out.println(new JSONObject(players));
			players.forEach((p)-> System.out.println(new JSONObject(p)));
			map.put("Result", "SUCCESS");
			map.put("List", players);
			resp = new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			map.put("Result", "ERROR");
			map.put("Message", e.getMessage());
			resp = new ResponseEntity<Map<String,Object>>(map, HttpStatus.BAD_REQUEST);
		}
		return resp;
	}
	
	@PostMapping("save")
	public ResponseEntity<Map<String,Object>> saveNewPlayer(@RequestBody HashMap<String,Object> requestParams){
		Map<String,Object> map = new HashMap<String,Object>();
		ResponseEntity<Map<String,Object>> resp = null;
		try {
			Player player = new Player();
			player.setCustomer_id((int) requestParams.get("customerId"));
			player.setName((String) requestParams.get("name"));
			var result = playerService.saveNewPlayer(player);
			System.out.println(result);
			map.put("Result", "SUCCESS");
			resp = new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
		}catch (Exception e) {
			map.put("Result", "ERROR");
			e.printStackTrace();
			resp = new ResponseEntity<Map<String,Object>>(map, HttpStatus.BAD_REQUEST);
		}
		return resp;
	}
	
	@GetMapping("get-player/{id}")
	public ResponseEntity<?> getPlayerName (@PathVariable("id") String id){
		Map<String,Object> map = new HashMap<String,Object>();
		ResponseEntity<Map<String,Object>> resp = null;
		try {
			Integer id_ = Integer.parseInt(id);
			String name = playerService.getPlayerName(id_);
			if(name != null && !"".equals(name)) {
				map.put("Result", "SUCCESS");
				map.put("name", name);
				resp = new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
			}else {
				map.put("Result", "Not Found");
				resp = new ResponseEntity<Map<String,Object>>(map, HttpStatus.BAD_REQUEST);
			}
			
		}catch (Exception e) {
			map.put("Result", "ERROR");
			e.printStackTrace();
			resp = new ResponseEntity<Map<String,Object>>(map, HttpStatus.BAD_REQUEST);
		}
		return resp;
	}
	
	@GetMapping("get-player")
	public ResponseEntity<?> isExisting (@RequestParam String id){
		Map<String,Object> map = new HashMap<String,Object>();
		ResponseEntity<Map<String,Object>> resp = null;
		try {
			Integer id_ = Integer.parseInt(id);
			String exist = playerService.isExisting(id_);
			map.put("Result", "SUCCESS");
			map.put("exist", exist);
			resp = new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
		}catch (Exception e) {
			map.put("Result", "ERROR");
			e.printStackTrace();
			resp = new ResponseEntity<Map<String,Object>>(map, HttpStatus.BAD_REQUEST);
		}
		return resp;
	}

}
