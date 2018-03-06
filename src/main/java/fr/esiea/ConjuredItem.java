package fr.esiea;

public class ConjuredItem extends Item {

	public ConjuredItem(String name, int sellIn, int quality) {
		this.name = "Conjured";
		super(sellIn, quality);
	}

	public void updateQuality() {
		if(this.quality > 0)
			quality --;

		if(this.sellIn < SELLIN_IS_OVER) {
			if(this.quality >0)
				quality --;
		}
	}
}