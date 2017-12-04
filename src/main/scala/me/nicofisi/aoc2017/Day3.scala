package me.nicofisi.aoc2017

object Day3 extends App {
  val input = 289326

  var x = 0
  var y = 0
  var r = 0
  var stage = 3
  var movesLeftInStage = 1

  for (_ <- 1 until input) {
    // println(s"i: $i; r: $r; stage: $stage; x: $x; y: $y; mlis: $movesLeftInStage")
    stage match {
      case 0 => y += 1
      case 1 => x -= 1
      case 2 => y -= 1
      case 3 => x += 1
    }
    movesLeftInStage -= 1
    if (movesLeftInStage == 0) {
      if (stage == 3) {
        r += 1
        stage = 0
      } else stage += 1
      movesLeftInStage =
        if (stage == 0) r * 2 - 1
        else if (stage == 3) r * 2 + 1
        else r * 2
    }
  }
  println(s"x: $x; y: $y; result: ${Math.abs(x) + Math.abs(y)}")

//  Stream.
//  1.until(input).foreach()


}
