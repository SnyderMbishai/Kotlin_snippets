fun enableNull(value: String?): String{
    if(value != null && value.length > 0){
        return "Not null people."
    }else{
        return "It was null peeps!"
    }
}

fun main(){
    println(enableNull(null))
}
