//////////////// FILE HEADER (INCLUDE IN EVERY FILE) //////////////////////////
//
// Title:    Clothing
// Course:   CS 300 Spring 2024
//
// Author:   Elijah Gadbury
// Email:    gadbury@wisc.edu
// Lecturer: Mouna Kacem
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
// Partner Name:    Mitchell Froze
// Partner Email:   (email address of your programming partner)
// Partner Lecturer's Name: Mouna Kacem
//
// VERIFY THE FOLLOWING BY PLACING AN X NEXT TO EACH TRUE STATEMENT:
//   _X_ Write-up states that pair programming is allowed for this assignment.
//   _X_ We have both read and understand the course Pair Programming Policy.
//   _X_ We have registered our team prior to the team registration deadline.
//
//////////////////////// ASSISTANCE/HELP CITATIONS ////////////////////////////
//
// Persons:         (identify each by name and describe how they helped)
// Online Sources:  https://www.javatpoint.com/how-to-check-data-type-in-java
//                            Used to learn how to check an object's data type
///////////////////////////////////////////////////////////////////////////////

import java.time.LocalDate;
public class Clothing {
  private String brand;
  private String description;
  private LocalDate lastWornDate;
  private int timesWorn;

  /**
   * Creates a new clothing object with the given description and brand.
   *
   * @param description Description for piece of clothing
   * @param brand Brand for piece of clothing
   * @throws IllegalArgumentException with a descriptive message if the description or
   * brand is a blank
   */
  public Clothing(String description, String brand) throws IllegalArgumentException{
    if(description == null){
      throw new IllegalArgumentException("Description can't be blank");
    }
    if(brand == null){
      throw new IllegalArgumentException("Brand can't be blank");
    }
    this.description = description;
    this.brand = brand;
    this.lastWornDate = null;
    this.timesWorn = 0;

  }

  /**
   * Creates a new clothing object with the given description, brand, timesWorn and lastWorn
   * date values.
   *
   * @param description the description for this piece of clothing
   * @param brand the brand of this piece of clothing
   * @param timesWorn the number of times this piece of clothing has been worn
   * @param lastWornDate the date that this piece of clothing was last worn
   * @throws IllegalArgumentException with a descriptive message if the description or
   * brand is a blank
   */
  public Clothing(String description, String brand, int timesWorn,
      LocalDate lastWornDate) throws IllegalArgumentException{
    if(description == null){
      throw new IllegalArgumentException("Description can't be blank");
    }
    if(brand == null){
      throw new IllegalArgumentException("Brand can't be blank");
    }
    this.description = description;
    this.brand = brand;
    this.lastWornDate = lastWornDate;
    this.timesWorn = timesWorn;

  }

  /**
   * Updates the number of times this piece of clothing has been worn and the
   * last worn date
   *
   * @param year the year of the new last worn date
   * @param month the month of the new last worn date
   * @param day the day of the last worn date
   * @throws IllegalArgumentException with a descriptive message if the year is less than 1, or
   * the month is outside the range [1,12]
   */
  public void wearClothing(int year, int month, int day) throws IllegalArgumentException{
    if (year < 1){
      throw new IllegalArgumentException("Year can't be less than 1");
    }
    if (month < 1 || month > 12){
      throw new IllegalArgumentException("Month must be a number 1-12");
    }
    this.timesWorn++;
    this.lastWornDate = LocalDate.of(year,month,day);
  }

  /**
   * Getter for the description of this piece of clothing.
   *
   * @return this clothing's description
   */
  public String getDescription(){return this.description;}

  /**
   * Getter for the brand of this piece of clothing.
   *
   * @return this clothing's brand
   */
  public String getBrand(){return this.brand;}

  /**
   * Getter for the date that this piece of clothing was last worn.
   *
   * @return this clothing's last worn date
   */
  public LocalDate getLastWornDate(){return this.lastWornDate;}

  /**
   * Getter for the number of times this piece of clothing has been worn.
   *
   * @return this clothing's number of times worn
   */
  public int getNumOfTimesWorn(){return this.timesWorn;}

  /**
   * Checks if Object o equals this clothing object, that is the current instance of Clothing.
   *
   * @param o the object to check if it is equal to this piece of clothing
   * @return true if and only if 1) o is of type Clothing 2) the brands match ignoring case AND
   * 3) the descriptions match ignoring case, otherwise return false
   */
  @Override
  public boolean equals(Object o){
    if(o.getClass() != Clothing.class){
      return false;
    }
    if(!(this.brand.equalsIgnoreCase(((Clothing) o).getBrand()))){
      return false;
    }
    if(!(this.description.equalsIgnoreCase(((Clothing) o).getDescription()))){
      return false;
    }
    return true;
  }

  /**
   * Creates and returns a string representation of this Clothing object.
   *
   * @return the String representation of this Clothing object
   */
  @Override
  public String toString(){
    String formattedDate = "";
    String month = "";
    String day = "";
    if(this.lastWornDate.getMonthValue() >= 10){
      month = "" + this.lastWornDate.getMonthValue();
    }
    else{
      month = "0" + this.lastWornDate.getMonthValue();
    }
    if(this.lastWornDate.getDayOfMonth() < 10){
      day = "0" + this.lastWornDate.getDayOfMonth();
    }
    else{
      day = "" + this.lastWornDate.getDayOfMonth();
    }
    formattedDate = month + "/" + day + "/" + this.lastWornDate.getYear();


    return (this.description + "," + this.brand + "," + formattedDate + "," + this.timesWorn);
  }
}
