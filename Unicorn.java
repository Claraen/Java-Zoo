public class Unicorn extends Animal {

  public Unicorn(String name) {
    super(name, "marshmallows");
  }

  public void sleep() {
    String print = this.name + " sleeps in a cloud";
    System.out.println(print);
  }
}
