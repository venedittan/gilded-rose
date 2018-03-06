ackage fr.esiea;

public class BackstagePassesItem extends Item {

	public BackstagePassesItem(String name, int sellIn, int quality) {
		this.name = "Backstage passes to a TAFKAL80ETC concert";
		super(sellIn, quality);
	}

	public void updateQuality(){
		if(this.quality < MAX_QUALITY)
			quality ++;

		if(this.sellIn < 11){
			if(this.quality < MAX_QUALITY)
				quality ++;
		}
		if(this.sellIn < 6)
			if(this.quality < MAX_QUALITY)
				quality ++;

		if(this.sellIn < SELLIN_IS_OVER)
			quality=0;
	}

}