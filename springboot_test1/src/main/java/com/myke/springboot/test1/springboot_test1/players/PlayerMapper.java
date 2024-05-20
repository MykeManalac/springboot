package com.myke.springboot.test1.springboot_test1.players;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Mapper
public interface PlayerMapper {
	
	@Select("SELECT customer_id, name FROM customers")
	List<Player> getAllPlayers();
	
	@Insert("Insert into customers VALUES(#{customer_id},#{name})")
	Integer saveNewPlayer(Player player);
	
	@Select("SELECT name FROM customers WHERE customer_id = #{id}")
	String getPlayerName(int id);
	
	@Select("SELECT CASE COUNT(name) WHEN 0 THEN 'N' ELSE 'Y' END AS EXIST\r\n"
			+ "FROM customers\r\n"
			+ "WHERE customer_id = #{id}")
	String isIdExisting(int id);

}
