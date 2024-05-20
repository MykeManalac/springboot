package com.myke.springboot.test1.springboot_test1.players;

import java.sql.SQLException;
import java.util.List;

public interface PlayersService {
	
	List<Player> getAllPlayers() throws SQLException;
	
	Integer saveNewPlayer(Player player) throws SQLException;
	
	String getPlayerName(int id) throws SQLException;
	
	String isExisting(int id) throws SQLException;
	

}
