public class Zookeeper {
  String name;

  public Zookeeper(String name){
    this.name = name;
  }

  public void feedAnimals(Animal[] animals, String food){
    String print = this.name + " is feeding " + food + " to " + animals.length + " of 5 animals";
    System.out.println(print);
    for(int i = 0; i < animals.length; i++){
      animals[i].eat(food);
    }
  }
}