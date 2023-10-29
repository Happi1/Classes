
fun main(args:Array<String>){
    val a : Rationnal=Rationnal(3,4)
    val b :Rationnal =Rationnal(1,8)
    var table : MutableList<Rationnal> = arrayListOf(a,b)
    table.add(Rationnal(1,2))
    table.add(Rationnal(30,8))
    println("R1 = ${a.toString()}")
    println("R1 = ${b.toString()}")
    println("R1+R2 = ${a.add(b)}")
    println("R1*R2 = ${a.mult(b)}")
    println("le plus petit est ${Rationnal.pluspetitRationnal(table)}")

}



