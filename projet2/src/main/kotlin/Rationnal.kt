class Rationnal (num:Int,den:Int){
    var num :Int = num
    var den :Int = den
    constructor (num:Int): this(num,1)
    fun normaliser() : Unit{
        val pgdcVal: Int = pgcd(this.num,this.den)
        this.num  /= pgdcVal
        this.den /= pgdcVal

    }
    fun pgcd(a:Int,b:Int):Int {
        if(a == b) {
            return a
        }else if (a < b) {
            return pgcd(a, b - a)
        } else{
            return pgcd(b, a - b)
        }
    }
    fun add ( r : Rationnal):Rationnal{
        val result :Rationnal =Rationnal (0,0)
        result.num = (this.num*r.den)+(this.den*r.num)
        result.den=(this.den*r.den)
        result.normaliser()
        return result
    }
    fun mult (r:Rationnal):Rationnal{
        val r1 : Rationnal =Rationnal(this.num* r.num,this.den*r.den)
        r1.normaliser()
        return r1
    }
    fun div (r:Rationnal):Rationnal {
        return this.mult(Rationnal(r.den,r.num))
    }
    override fun toString():String{
        return "$num/$den"
    }
    companion object{
        fun pluspetitRationnal(tab : MutableList<Rationnal>): Rationnal {

            var x: Rationnal = tab[0]
            for (i in tab) {
                if (x.num / x.den.toDouble() > i.num / i.den.toDouble())
                    x = i
            }
            return x
        }
    }
}




