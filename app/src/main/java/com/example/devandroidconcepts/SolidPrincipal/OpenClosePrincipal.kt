package com.example.devandroidconcepts.SolidPrincipal

class OpenClosePrincipal {
}

class VehicleInsuranceCustomer(){
    fun isLoyalCustomer():Boolean{
        return true
    }
}
class HomeInsuranceCustomer(){
    fun isLoyalCustomer():Boolean{
        return true
    }
}
class LifeInsuranceCustomer(){
    fun isLoyalCustomer():Boolean{
        return true
    }
}
class InsuranceCompany{
    fun discountRate(vehicleInsuranceCustomer: VehicleInsuranceCustomer):Int{
        return if(vehicleInsuranceCustomer.isLoyalCustomer()) 10 else 8
    }
    fun discountRate(homeInsuranceCustomer: HomeInsuranceCustomer):Int{
        return if(homeInsuranceCustomer.isLoyalCustomer()) 10 else 8
    }
    fun discountRate(lifeInsuranceCustomer: LifeInsuranceCustomer):Int{
        return if(lifeInsuranceCustomer.isLoyalCustomer()) 10 else 8
    }
}

   // This is  not following open close principal because its  not extend the  class
   //  close to modification
         // Now we implement the  Open close principal
  interface  Customer {
      fun isLoyalCustomer():Boolean
  }
class VehicleInsuranceCustomerNew :Customer{
   override fun isLoyalCustomer():Boolean{
        return true
    }
}
class HomeInsuranceCustomerNew():Customer{
    override fun isLoyalCustomer():Boolean{
        return true
    }
}
class LifeInsuranceCustomerNew() : Customer{
    override fun isLoyalCustomer():Boolean{
        return true
    }
}

class InsuranceCompanyNew{
    fun discountRate(customer: Customer) :Int{
        return  if(customer.isLoyalCustomer()) 40 else 50

    }
}

fun main() {
    val vehicleInsuranceCustomerNew = VehicleInsuranceCustomerNew()
    val homeInsuranceCustomerNew  = HomeInsuranceCustomerNew()
    val lifeInsuranceCustomerNew = LifeInsuranceCustomerNew()


    val insuranceCustomerNew =  InsuranceCompanyNew()
         insuranceCustomerNew.discountRate(vehicleInsuranceCustomerNew)
}