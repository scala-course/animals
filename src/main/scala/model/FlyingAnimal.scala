package model

/**
  * Created by fnovoa10 on 05/28/17.
  */
trait FlyingAnimal extends MobilityClassification {

  def fly(): Unit = println("Flying on")

}
