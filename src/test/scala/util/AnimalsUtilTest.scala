package util


import org.scalatest.{Matchers, FlatSpec}

/**
  * Created by fnovoa10 on 05/29/17.
  */
class AnimalsUtilTest extends FlatSpec with Matchers {

  import model.{Bat, Dog, Sparrow}
  import AnimalsUtil._

  it should "Assing subordes base in a clas type" in {
    val result = updateSubOrder(List(Bat("Chiroptera", "-", isExtinct = false),
      Dog("Carnivora", "-", isExtinct = false),
      Sparrow("Passeriformes", "-", isExtinct = false)))

    result should be(List(Bat("Chiroptera", "Caniformia", isExtinct = false),
      Dog("Carnivora", "Megachiroptera", isExtinct = false),
      Sparrow("Passeriformes", "Passeri", isExtinct = false)))

  }

  it should "Return specie of any animal" in {
    getSpecie(Bat("Chiroptera", "-", isExtinct = false)) should be("Caniformia")
    getSpecie(Dog("Any", "-", isExtinct = false)) should be("Megachiroptera")
  }

  it should "Two dogs are equal if they have the same specie" in {

    val isEqual =  Dog("Any", "-", isExtinct = false).assignSpecie()
      .equals(Dog("Another Any", "Megachiroptera", isExtinct = false))
      isEqual should be(true)
  }
}
