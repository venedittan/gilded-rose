package fr.esiea;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void updateQualityTest() {
		Item item = new Item("Item Test",10,10);
		updateQuality();
		assertEquals(9, item.getQuality());
    }

}