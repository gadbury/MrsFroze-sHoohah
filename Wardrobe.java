import java.util.NoSuchElementException;

public class Wardrobe {
  private Clothing[] wardrobe;
  private int wardrobeSize;

  /**
   *Creates a new Wardrobe object that is empty with the given capacity.
   *
   * @param capactity the number of clothing that the wardrobe can fit
   */
  public Wardrobe(int capactity) throws IllegalArgumentException{
      this.wardrobe = new Clothing[capactity];
      this.wardrobeSize = 0;
  }

  /**
   * Finds and returns the piece of clothing with the matching description and brand.
   *
   * @param description the description of the piece of clothing to find
   * @param brand the brand of the piece of clothing to find
   * @return the Clothing object in the Wardrobe that matches the given description and brand
   * @throws NoSuchElementException with descriptive message if the clothing does not exist in the wardrobe

  public Clothing getClothing(String description, String brand) throws NoSuchElementException {
    return;
  }
  */

}
