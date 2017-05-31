package model


/**
  * Created by fnovoa10 on 05/28/17.
  */
case class Dog(classAnimal: String, speciesAnimal: String, isExtinct: Boolean)
  extends Mammal with WalkerAnimal {


  override def reproduce(): Dog = {
    println("Reproduce like a Dog")
    this.copy()
  }

  override def eat(): Unit = {
    println("Eat like a bat")
  }

  override def move(): Unit = {
    println("Move like a bat")
  }
}
