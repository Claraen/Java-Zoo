class Main {
  String favoriteFood = "bacon";

  public static void main(String[] args) {
    
    Main r = new Main();
    Tiger tigger = new Tiger("Tigger");
    tigger.eat("meat");
    Bear pooh = new Bear("Pooh");
    pooh.eat("fish");
    pooh.eat("meat");
    Unicorn rarity = new Unicorn("Rarity");
    rarity.eat("marshmallows");
    rarity.sleep();
    Giraffe gemma = new Giraffe("Gemma");
    gemma.eat("meat");
    gemma.eat("leaves");
    gemma.sleep();
    Bee stinger = new Bee("Stinger");
    stinger.eat("icecream");
    stinger.eat("pollen");
    Animal[] animals = {tigger,pooh,rarity,gemma,stinger};
    Zookeeper z = new Zookeeper("Zoebot");
    z.feedAnimals(animals, "steak");
    
  }

  public void sleep(String name) {
    String print = name + " sleeps for 8 hours";
    System.out.println(print);
  }

  public void eat(String food, String name) {
    String print = name + " eats " + food;
    if (food.equals(favoriteFood)) {
      print += ". Yum!!! " + name + " wants more " + food;
    }
    System.out.println(print);
    if (!food.equals(favoriteFood)) {
      sleep(name);
    }
  }
}