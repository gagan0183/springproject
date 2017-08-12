package com.knights;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = KnightConfig.class)
public class BraveKnightTest {
	
	@Autowired
	private Knight knight;
	
	@Test
	public void knightShouldEmbarkQuest() {
		System.out.println(knight);
		Quest mockQuest = Mockito.mock(Quest.class);
		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		Mockito.verify(mockQuest, Mockito.times(1)).embark();
	}
}
