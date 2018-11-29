package me.nicofisi.matura2017

object Task1 extends App {
  println(calc(3, 7, 5, 11, 33))
  println(calc(5, 15, 12, 10, 6, 5, 1))
  println(calc(7, 6, 28, 7, 12, 10, 14, 5, 9, 4, 8, 18))
  println(calc(2, 4, 34, 16, 8, 6, 22, 14, 12, 2, 7))


  def calc(p: Int, nums: Int*): Any = {
    nums.map(num1 => nums.map(_ * num1).filterNot(_ % p == 0).sortBy(-_)).max
  }
}
