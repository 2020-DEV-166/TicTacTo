package com.games.tictactoe;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class GameTest {
	
	@Test
	public void playerXAlwaysStart() {
		Board board = new Board();
		Player x = new Player();
		Player y = new Player();
		
		Map<Integer, Player> boxCrossed = new HashMap<Integer, Player>();
		x.move();
		
		assertTrue(boxCrossed.isEmpty());
		
		assertThat(x.cross(), !boxCrossed.isEmpty());
		
	}
}
