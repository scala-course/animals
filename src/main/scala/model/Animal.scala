package model

/**
  * Created by fnovoa10 on 05/28/17.
  */
trait Animal {

  val classAnimal: String
  val speciesAnimal: String
  val isExtinct: Boolean

  def reproduce(): Unit = {
    println("Reproduce like default animal")
  }

  def eat(): Unit = {
    println("Eat like default animal")
  }

  def move(): Unit = {
    println("Move like default animal")
  }

  def assignSpecie(): Animal = {
    this match {
      case Dog(cl, _, ext) => Dog(cl, "Megachiroptera", ext)
      case Bat(cl, _, ext) => Bat(cl, "Caniformia", ext)
      case Sparrow(cl, _, ext) => Sparrow(cl, "Passeri", ext)
    }
  }

}
