import kotlin.text.Regex
class FileNameExtractor{
    fun extractFileName(incoming:String):String?{

        var finalText:String? =null
        var re:Regex = Regex("(?<=_)(\\S+?\\.\\S+)?\\.")

        var matches = re.find(incoming)
        finalText = matches!!.groupValues[1]


        return finalText

    }
}

fun main(){
    var k = FileNameExtractor().extractFileName("1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION")
    println(k)
}