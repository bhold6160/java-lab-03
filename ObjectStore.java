public interface ObjectStore {
  public void add(Todo object);
  public void remove(Todo object);
  public Todo objectAtIndex(int index);
  public int numberOfObjects();
  public Todo[] allTodos();
}
