package util

import model.Animal

/**
  * Created by fnovoa10 on 05/29/17.
  */
object AnimalsUtil {

  def updateSubOrder(animals: List[Animal]): List[Animal] = {
    var animalsWithSuborder:List[Animal] = List()
    animals.foreach(animal=>{
      animalsWithSuborder = animalsWithSuborder ::: List(animal.assignSpecie())
    })
    animalsWithSuborder
  }

  def getSpecie(animal: Animal): String ={
    animal.assignSpecie().speciesAnimal
  }

}
