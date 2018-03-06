package fr.esiea;

import java.lang.String;

public class SulfurasItem extends Item {

	public SulfurasItem(String name, int sellIn, int quality) {
		super(sellIn);
		this.name = "Sulfuras, Hand of Ragnaros";
		this.quality = 80;
	}

	public void updateSellIn() {

	}

}