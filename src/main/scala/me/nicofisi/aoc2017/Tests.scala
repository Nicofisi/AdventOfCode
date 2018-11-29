package me.nicofisi.aoc2017

object Tests extends App {
  (List(4, 5, 6) ::: List(1, 2, 3)).tail

  val days = List("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")

//  (List fill 20)(100)

  "hi" :: "hi2" :: List()

  lazy val fibs: Stream[BigInt] = BigInt(0) #:: BigInt(1) #:: fibs.zip(fibs.tail).map { n => n._1 + n._2 }

  days match {
    case first :: second :: third :: fourth :: fifth :: sixth :: seventh :: eighth ::  rest =>
      println(s"$first - $second - $third - $fourth - $fifth - $sixth - $seventh - $eighth - $rest")
  }
}
