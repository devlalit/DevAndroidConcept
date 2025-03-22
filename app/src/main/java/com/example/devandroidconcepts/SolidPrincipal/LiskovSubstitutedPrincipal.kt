package com.example.devandroidconcepts.SolidPrincipal
// object of  subclass are  inter convertable to each other  without changeable there functionality
class LiskovSubstitutedPrincipal
{
}

open class Car{
    fun getCabinWidth():Int{
         return 39
    }
}
class RacingCar{
    fun cockpitWidth():Int{
        return  12
    }
}

fun main(){
    val list = mutableListOf(RacingCar(),Car())
    list.forEach{
        when(it){
            is RacingCar -> {

            }
            is Car->{

            }
        }
    }
}

   // this  is  not following Liskov substituted principal
      // now  we used Liskov substituted principal

open class Vehicle{
  open fun getInteriorWidth():Int{
     return  39
   }
}

class CarNew : Vehicle(){
    override fun getInteriorWidth(): Int {
        return  this.getCabinWidth()
    }
    fun getCabinWidth():Int{
        return 39
    }
}
class RacingCarNew : Vehicle(){
    override fun getInteriorWidth(): Int {
        return this.cockpitWidth()
    }
    fun cockpitWidth():Int{
        return  12
    }
}

fun main1(){
    val list = mutableListOf(RacingCarNew(),CarNew())
    list.forEach{
          println(it.getInteriorWidth())
    }
}
