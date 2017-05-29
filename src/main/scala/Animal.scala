/**
  * Created by fnovoa10 on 05/28/17.
  */
trait Animal {
  var classAnimal: String
  var speciesAnimal: String
  var isExtinct: Boolean

  def reproduce(): Unit = {
    println("Reproduce like default animal")
  }

  def eat(): Unit = {
    println("Eat like default animal")
  }

  def move(): Unit = {
    println("Move like default animal")
  }

}
