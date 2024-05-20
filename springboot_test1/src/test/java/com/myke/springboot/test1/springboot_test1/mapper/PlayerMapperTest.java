package com.myke.springboot.test1.springboot_test1.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.myke.springboot.test1.springboot_test1.players.PlayerMapper;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PlayerMapperTest {
	
	@Autowired
	private PlayerMapper mapperUnderTest;
	 
	@Test
	void isPlayerExisting() {
		//given
		int id = 30;
		
		//when
		String exists = mapperUnderTest.isIdExisting(id);
		
		//then
		assertEquals("Y", exists);
	}

}
