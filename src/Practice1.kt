fun main() {

    //supported set data

    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = SUPPORTED.contains(requested)
        println("Support for $requested: $isSupported")

}