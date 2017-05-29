package model


/**
  * Created by fnovoa10 on 05/28/17.
  */
case class Dog(classAnimal: String, speciesAnimal: String, isExtinct: Boolean)
  extends Mammal with WalkerAnimal {
}
