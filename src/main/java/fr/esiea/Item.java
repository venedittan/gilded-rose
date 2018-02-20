package fr.esiea;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
<<<<<<< HEAD

    @Override
    public void updateQuality(){
        this.quality -= 1;
    }
=======
>>>>>>> 7c18a3921a6fbdefc8fa9933e090d5cbc02d43e2
}