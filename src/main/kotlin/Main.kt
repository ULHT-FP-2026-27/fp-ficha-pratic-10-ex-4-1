fun ePrimo(num: Int): Boolean{
    if (num <= 1) {
        return false
    }
    if (num <= 3) {
        return true
    }
    var divisor = 2
    while (divisor * divisor <= num) {
        if (num % divisor == 0) {
            return false
        }
        divisor++
    }

    /* for (i in 2 until num) {
         if (num % i == 0) {
             return false
         }
     }*/

    return true
}
