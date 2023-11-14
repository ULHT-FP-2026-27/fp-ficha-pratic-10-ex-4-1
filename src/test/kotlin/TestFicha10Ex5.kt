import junit.framework.Assert.assertTrue
import junit.framework.TestCase.assertFalse
import org.junit.Test

class TestProject {

    @Test(timeout = 500)
    fun testPrimoFalse() {
        assertFalse("ePrimo(1) devia retornar false", ePrimo(1))
        assertFalse("ePrimo(4) devia retornar false", ePrimo(4))
        assertFalse("ePrimo(36) devia retornar false", ePrimo(36))
        assertFalse(ePrimo(52))
        assertFalse(ePrimo(49))
        assertTrue(ePrimo(7))
    }
    @Test(timeout = 500)
    fun testPrimoTrue() {
        assertTrue("ePrimo(7) devia retornar true", ePrimo(7))
        assertTrue("ePrimo(2) devia retornar true", ePrimo(2))
        assertTrue("ePrimo(37) devia retornar true", ePrimo(37))
        assertTrue(ePrimo(137))
        assertTrue(ePrimo(3))
        assertFalse(ePrimo(4))
    }
    @Test(timeout = 500)
    fun testPrimoNegative() {
        assertFalse("ePrimo(-2) devia retornar false", ePrimo(-2))
        assertFalse(ePrimo(-10))
        assertFalse(ePrimo(-64))
        assertFalse(ePrimo(-137))
        assertTrue(ePrimo(3))
    }

}
