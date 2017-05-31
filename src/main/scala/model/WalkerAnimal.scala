package model

/**
  * Created by fnovoa10 on 05/28/17.
  */
trait WalkerAnimal extends MobilityClassification {

  def walk(): Unit = println("Walking on")

}
