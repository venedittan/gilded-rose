package fr.esiea;

import static org.junit.Assert.*;

import org.junit.Test;

public class ItemTest {

	@Test
	public void updateSellInTest(){
		Item item = new Item("Item Test",10,10);
		item.updateSellIn();
		assertEquals(9,item.sellIn);
	}

	@Test
  	public void updateAgedBrieTest(){
    	Item item = new Item("Aged Brie",-2,10);
    	item.updateItem();
    	assertEquals(12, item.quality);
  }
  
}
    
}