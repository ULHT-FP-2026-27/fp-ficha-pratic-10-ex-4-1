import org.junit.Test
import kotlin.test.assertEquals

class TestProject {

    @Test(timeout = 500)
    fun testPrimoFalse() {
        assertEquals(ePrimo(1), false)
        assertEquals(ePrimo(4), false)
        assertEquals(ePrimo(36), false)
        assertEquals(ePrimo(52), false)
    }
    @Test(timeout = 500)
    fun testPrimoTrue() {
        assertEquals(ePrimo(7),true)
        assertEquals(ePrimo(2),true)
        assertEquals(ePrimo(37),true)
        assertEquals(ePrimo(137),true)
        assertEquals(ePrimo(3),true)
    }
    @Test(timeout = 500)
    fun testPrimoNegative() {
        assertEquals(ePrimo(-2),false)
        assertEquals(ePrimo(-10),false)
        assertEquals(ePrimo(-64),false)
        assertEquals(ePrimo(-137),false)
    }

}