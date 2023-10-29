class Complexe (r:Double,i:Double) {
    private var r: Double = r
    private var i: Double = i
    override fun toString(): String {
        if (i < 0) {
            return "$r - i ${-i} "
        } else {
            return "$r + i $i "
        }
    }

    fun add(c: Complexe): Complexe {
        val result: Complexe = Complexe(this.r + c.r, this.i + c.i)
        return result
    }

    fun mult(c: Complexe): Complexe {
        val result: Complexe = Complexe((this.r * c.r) - (this.i * c.i), (this.r * c.i) + (this.i * c.r))
        return result
    }
    companion object{
        fun Inc(tab: MutableList<Complexe>):MutableList<Complexe> {
            for (a in tab) {
                a.i += 1
            }
            return tab
        }

    }
}