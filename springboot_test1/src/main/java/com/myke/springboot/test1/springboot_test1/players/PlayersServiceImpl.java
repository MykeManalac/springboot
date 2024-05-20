package com.myke.springboot.test1.springboot_test1.players;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayersServiceImpl implements PlayersService{
	

	public PlayersServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Player> getAllPlayers() throws SQLException {
		return null;
	}

	@Override
	public Integer saveNewPlayer(Player player) throws SQLException {
		return null;
	}

	@Override
	public String getPlayerName(int id) throws SQLException {
		return null;
	}

	@Override
	public String isExisting(int id) throws SQLException {
		return null;
	}

}
