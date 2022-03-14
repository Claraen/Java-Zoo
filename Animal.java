class Animal {
    String name;
    String favoriteFood;
  static int population = 0;

    public Animal(String name, String favoriteFood) {
      this.name = name;
      this.favoriteFood = favoriteFood;
      population++;
    }

    public void sleep() {
       String print = this.name + " sleeps for 8 hours";
    System.out.println(print);
  }

  public void eat(String food) {
    String print = this.name + " eats " + food;
    if (food.equals(favoriteFood)) {
      print += ". YUM!!! " + this.name + " wants more " + food;
    }
    System.out.println(print);
    if (!food.equals(this.favoriteFood)) {
      sleep();
    }
  }
}
