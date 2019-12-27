fun main() {
    // can never be null
    // a = null will produce a compilation error
    var a: String = "I can never be null"

    // can be null
    var b: String? = "I can be null"
    b = null //will compile fine

    
}