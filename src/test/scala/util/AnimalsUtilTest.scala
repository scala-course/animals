package util


import org.scalatest.{Matchers, FlatSpec}

/**
  * Created by fnovoa10 on 05/29/17.
  */
class AnimalsUtilTest extends FlatSpec with Matchers  {

  import model.{Bat, Dog, Sparrow}

  it should "Assing subordes base in a clas type" in {
    val result = AnimalsUtil.updateSubOrder(List(Bat("Chiroptera", "-", isExtinct = false),
      Dog("Carnivora", "-", isExtinct = false),
      Sparrow("Passeriformes", "-", isExtinct = false)))

    result should be(List(Bat("Chiroptera", "Caniformia", isExtinct = false),
      Dog("Carnivora", "Megachiroptera", isExtinct = false),
      Sparrow("Passeriformes", "Passeri", isExtinct = false)))

  }
}
