public class Giraffe extends Animal {
  public Giraffe(String name) {
   super(name, "leaves");
  }

  public void eat(String food) {
    String print;
    if(food.equals(favoriteFood)){
      print = this.name + " eats leaves. Yum!!!! " + this.name + " wants more Leaves.";
    }else{
      print = "YUCK!!!! " + this.name + " will not eat " + food;
    }
     System.out.println(print);
  }
}