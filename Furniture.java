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
