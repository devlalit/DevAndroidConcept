package com.example.devandroidconcepts.SolidPrincipal

class InterfaceSegregationPrincipal {
}
interface  IMultiFunctional{
    fun print()
    fun printSpoonDetails()
    fun scan()
    fun scanPhoto()
    fun fax()
    fun facDoc()
}
class CanonPrinter:IMultiFunctional{
    override fun print() {
        TODO("Not yet implemented")
    }

    override fun printSpoonDetails() {
        TODO("Not yet implemented")
    }

    override fun scan() {
        TODO("Not yet implemented")
    }

    override fun scanPhoto() {
        TODO("Not yet implemented")
    }

    override fun fax() {
        TODO("Not yet implemented")
    }

    override fun facDoc() {
        TODO("Not yet implemented")
    }
}

 // It  not Interface segregation principal because we force to class interface it does not used
 // now to implement Interface segregation principal
 interface  IPrint{
     fun print()
     fun printSpoonDetails()
 }
interface  IScan{
    fun scan()
    fun scanPhoto()
}
interface  IFax{
    fun fax()
    fun facDoc()
}
class CanonPrinterNew : IPrint , IScan{
    override fun print() {
        TODO("Not yet implemented")
    }

    override fun printSpoonDetails() {
        TODO("Not yet implemented")
    }

    override fun scan() {
        TODO("Not yet implemented")
    }

    override fun scanPhoto() {
        TODO("Not yet implemented")
    }

}