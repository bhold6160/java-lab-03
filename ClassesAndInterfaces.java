public class ClassesAndInterfaces {
  public static void main(String[] args) {
    testStore();
  }

  public static void testStore() {
    Todo dishes = new Todo("Do the dishes");
    Todo dog = new Todo("Feed dog");
    Todo groceries = new Todo("Go grocery shopping");
    Todo car = new Todo("Wash car");
    Store myTodoList = new Store();

    myTodoList.add(dishes);
    myTodoList.add(dog);
    myTodoList.add(groceries);
    myTodoList.add(car);
    myTodoList.remove(car);

    System.out.println(myTodoList.objectAtIndex(1).text);
    System.out.println(myTodoList.numberOfObjects());
    System.out.println(myTodoList.allTodos());

  }
}
