class Rational (num : Int,den : Int) {
    var num :Int =num
    var den : Int = den
    constructor(num : Int): this(num,1)
    fun normaliser():Unit{
        val pgcdValue :Int = pgcd(this.num,this.den)
        this.num /=pgcdValue
        this.den /= pgcdValue

    }
    fun pgcd( a:Int,b :Int):Int {
        var result : Int = 0
        if(a==b){
            return a
        }else if(a<b) {
            return pgcd(a,(b- a))
        }else{
            return pgcd(b,(a-b))
        }
    }
    fun add (R:Rational):Rational{
        var R1 :Rational = Rational(0,0)
        R1.num  = (this.num*R.den)+(this.den*R.den)
        R1.den = this.den*R.den
        R1.normaliser()
        return R1
    }
    fun mult (R:Rational):Rational{
        val Res = Rational(this.num*R.num,this.den*R.den)
        Res.normaliser()
        return Res
    }
    fun div(R:Rational):Rational{
        return this.mult(Rational(R.den,R.num))
    }

    fun main(){
        val r:Rational(3,4)
    }
}