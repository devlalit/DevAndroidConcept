package com.example.devandroidconcepts.SolidPrincipal

class DependencyInversionPrincipal {
}
// high level module
class  ProductCatalog{
     fun listOfAllProduct(){
         val sqlProductRepo = SQLProductRepo()
           sqlProductRepo.getAllProduct().forEach{
               println(it)
           }

     }
}
//low level module
class SQLProductRepo{
    fun getAllProduct() : MutableList<String>{
        return  mutableListOf("apple","banana")
    }
}


// it  is  not Dependency Inversion principal , because high level module depend of lo
 //    low level module  , principal say both depend on abstractions
 // Now we  implement DI principal
interface  ProductRepo{
    fun getAllProduct():MutableList<String>
}
// high level module
class  ProductCatalogNew{
    fun listOfAllProduct(){
        val sqlProductRepo : ProductRepo= MongoProductRepoNew()
        sqlProductRepo.getAllProduct().forEach{
            println(it)
        }

    }
}
//low level module
class SQLProductRepoNew: ProductRepo{
   override fun getAllProduct() : MutableList<String>{
        return  mutableListOf("apple","banana")
    }
}
class MongoProductRepoNew : ProductRepo{
    override fun getAllProduct(): MutableList<String> {
        return mutableListOf("Mango")
    }

}