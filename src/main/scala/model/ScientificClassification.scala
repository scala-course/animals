package model

/**
  * Created by fnovoa10 on 05/28/17.
  */
sealed trait ScientificClassification extends Animal

trait Mammal extends ScientificClassification {

  def isMammal: Boolean = true


}

trait Bird extends ScientificClassification {

  def migrate(): Unit = {
    println("Gonna migrate")
  }

  def learnFly(): Unit = {
    println("Learn to fly")
  }

  def isBird: Boolean = true
}

