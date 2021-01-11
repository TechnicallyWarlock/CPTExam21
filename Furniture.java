public interface Furniture
{
  public void material(String type);
  public void height (int height);
  public void width (int width);
  public void length (int length);
}

abstract class Shelf implements Furniture
{
  public Boolean getDoorsOpen();
  public int ShelvesAmount();
}

class BookShelf extends Shelf implements Furniture
{
  public void material (String type)
  {
    System.out.println("This bookshelf is made of" + type);
  }
  public void height (int height)
  {
    System.out.println("This bookshelf's height is" + height + "cm");
  }
  public void width (int width)
  {
    System.out.println("This bookshelf's width is" + width + "cm");
  }
   public void length (int length)
  {
    System.out.println("This bookshelf's length is" + length + "cm");
  }
     
  public Boolean getDoorsOpen(Boolean doors)
  {
    if (doors = true)
      System.out.println("This bookshelf's doors are open");
    else 
      System.out.println("This bookshelf's doors are closed");
  }
  
  public int ShelvesAmount(int shelves)
  {
    System.out.println("This bookshelf contains" + shelves + "shelves");
  }
  
  private String BookList (String[] Books)
  {
     System.out.println("This bookshelf contains following books");
    for (String book : Books)
      System.out.prinln(Book);
  }
}
