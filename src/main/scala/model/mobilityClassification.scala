package model

/**
  * Created by fnovoa10 on 05/28/17.
  */
sealed trait MobilityClassification extends Animal

trait WalkerAnimal extends MobilityClassification {

  def walk(): Unit = println("Walking on")

}

trait FlyingAnimal extends MobilityClassification {

  def fly(): Unit = println("Flying on")

}

