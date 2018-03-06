package fr.esiea;

public class AgedBrieItem extends Item {

	public AgedBrieItem(String name, int sellIn, int quality) {
		super(sellIn, quality);
		this.name = "Aged Brie";
	}

	public void updateQuality() {
		if(this.quality < MAX_QUALITY)
			quality ++;
		if(this.sellIn < SELLIN_IS_OVER)
			quality ++;
	}

}