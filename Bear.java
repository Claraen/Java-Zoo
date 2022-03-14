public class Bear extends Animal {
  public Bear(String name) {
   super(name, "fish");
  }

  public void sleep() {
    String print = this.name + " hibernates for 4 months";
    System.out.println(print);
  }
}