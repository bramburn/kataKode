import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.File
import kotlin.reflect.typeOf

class BasicTest {
    private val filename:String ="kaps.txt"
   @Test
    fun hello(){
        assertTrue(true)
    }

    @BeforeEach
    fun bef(){

        var f: File = File(this.filename)

        var x:Boolean =f.createNewFile()

        if(x == true){
            assertTrue(true)
        }
        else{
            assertTrue(false)
        }
    }
//    Delete the file at the end
    @AfterEach
    fun deltxt(){

        var f:File = File(this.filename)
        var x:Boolean = f.delete()
        println(x)
        assertTrue(x)
    }

}