package model

/**
  * Created by fnovoa10 on 05/28/17.
  */
case class Sparrow(classAnimal: String, speciesAnimal: String, isExtinct: Boolean)
  extends Bird with FlyingAnimal {

  override def reproduce(): Bird = {
    println("Reproduce like a sparrow")
    this.copy()
  }

  override def eat(): Unit = {
    println("Eat like a sparrow")
  }

  override def move(): Unit = {
    println("Move like a sparrow")
  }
}
