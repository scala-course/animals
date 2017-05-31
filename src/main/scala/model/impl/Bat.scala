package model.impl

import model.{FlyingAnimal, Mammal}

/**
  * Created by fnovoa10 on 05/28/17.
  */
case class Bat(classAnimal: String, speciesAnimal: String, isExtinct: Boolean)
  extends FlyingAnimal with Mammal {

  override def reproduce(): Bat = {
    println("Reproduce like a bat")
    this.copy()
  }
  override def eat(): Unit = {
    println("Eat like a bat")
  }

  override def move(): Unit = {
    println("Move like a bat")
  }

}
