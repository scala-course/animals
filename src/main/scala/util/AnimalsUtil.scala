package util

import model.Animal

/**
  * Created by fnovoa10 on 05/29/17.
  */
object AnimalsUtil {

  def updateSubOrder(animals: List[Animal]): List[Animal] = {
    animals.map(animal => animal.assignSpecie())
  }

  def getSpecie(animal: Animal): String ={
    animal.assignSpecie().speciesAnimal
  }

}
