package com.myke.springboot.test1.springboot_test1.players;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayersServiceImpl implements PlayersService{
	
	@Autowired
	private PlayerMapper mapper;
	

	public PlayersServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Player> getAllPlayers() throws SQLException {
		return mapper.getAllPlayers();
	}

	@Override
	public Integer saveNewPlayer(Player player) throws SQLException {
		return mapper.saveNewPlayer(player);
	}

	@Override
	public String getPlayerName(int id) throws SQLException {
		return mapper.getPlayerName(id);
	}

	@Override
	public String isExisting(int id) throws SQLException {
		return mapper.isIdExisting(id);
	}

}
