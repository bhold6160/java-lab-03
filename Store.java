import java.util.*;

public class Store implements ObjectStore {
  ArrayList<Todo> objects = new ArrayList<Todo>();

  public void add(Todo object) {
    objects.add(object);
  }

  public void remove(Todo object) {
    objects.remove(object);
  }

  public Todo objectAtIndex(int index) {
    return objects.get(index);
  }

  public int numberOfObjects() {
    return objects.size();
  }

  public Todo[] allTodos() {
    Todo[] objArray = new Todo[objects.size()];

    for (int i = 0; i < objects.size(); i++) {
      objArray[i] = objects.get(i);
    }
    return objArray;
  }
}
