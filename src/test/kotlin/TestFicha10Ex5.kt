import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue

@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
@Timeout(1)
class TestProject {

    @Test
    @Order(1)
    fun testPrimoFalse() {
        assertFalse(ePrimo(1), "ePrimo(1) devia retornar false")
        assertFalse(ePrimo(4), "ePrimo(4) devia retornar false")
        assertFalse(ePrimo(36), "ePrimo(36) devia retornar false")
        assertFalse(ePrimo(52))
        assertFalse(ePrimo(49))
        assertTrue(ePrimo(7))
    }

    @Test
    @Order(2)
    fun testPrimoTrue() {
        assertTrue(ePrimo(7), "ePrimo(7) devia retornar true")
        assertTrue(ePrimo(2), "ePrimo(2) devia retornar true")
        assertTrue(ePrimo(37), "ePrimo(37) devia retornar true")
        assertTrue(ePrimo(137))
        assertTrue(ePrimo(3))
        assertFalse(ePrimo(4))
    }

    @Test
    @Order(3)
    fun testPrimoNegative() {
        assertFalse(ePrimo(-2), "ePrimo(-2) devia retornar false")
        assertFalse(ePrimo(-10))
        assertFalse(ePrimo(-64))
        assertFalse(ePrimo(-137))
        assertTrue(ePrimo(3))
    }

}
