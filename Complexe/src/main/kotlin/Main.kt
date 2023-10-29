fun main(args: Array<String>) {
    var c1 : Complexe = Complexe(2.0,3.0)
    var c2 : Complexe = Complexe(4.0,-5.0)
    var tab:MutableList<Complexe> = arrayListOf(c1,c2)
    tab.add(Complexe(1.0,2.0))
    tab.add(Complexe(3.2,4.1))

    println ("c1 = ${c1.toString()}")
    println ("c2 = ${c2.toString()}")

    println("la somme de c1 et c2 est ${c1.add(c2)}")
    println("le Produit de c1 et c2 est ${c1.mult(c2)}")
    println("${Complexe.Inc(tab)}")

}