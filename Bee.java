public class Bee extends Animal {
  public Bee(String name){
    super(name, "pollen");
  }

  public void eat(String food){
    if(food.equals(this.favoriteFood)){
      String print = this.name + " eats pollen. YUM!!! " + this.name + " wants more pollen";
      System.out.println(print);
      sleep();
    }else{
      String print = "YUCK!!! " + this.name + " will not eat " + food;
      System.out.println(print);
    }
    
  }

  public void sleep(){
    String print = this.name + " never sleeps";
    System.out.println(print);
  }
}