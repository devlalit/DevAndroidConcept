package com.example.devandroidconcepts.SolidPrincipal

class SingleResponsibilityPrincipal {

}
class Sequare{

    fun calculateArea(side:Int):Int{
        return  side * side
    }
    fun calculatePerimrter(side:Int):Int{
        return 4 * side
    }
    fun renderSqure(){
        println("render squere ")
    }
    fun renderLargeSquare(){
        println("render large square")
    }
}
// Now  this class not following Single Responsibility principal

      // Now we modify this class
      class Sequare1 {

          fun calculateArea(side: Int): Int {
              return side * side
          }

          fun calculatePerimrter(side: Int): Int {
              return 4 * side
          }
      }
     class SqareUI{
         fun renderSqure(){
             println("render squere ")
         }
         fun renderLargeSquare(){
             println("render large square")
         }
     }