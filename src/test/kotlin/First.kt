import org.junit.jupiter.api.Test
import org.junit.jupiter.api.fail

class First {
    @Test
    fun firstTest() {
        println("Hello")
    }

    @Test
    fun secondTest() {
        fail("This test fails");
    }
}