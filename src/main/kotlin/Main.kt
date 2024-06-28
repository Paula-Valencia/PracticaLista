
//
//fun main() {
//
//    /*
//    val readOnly: List<String> = listOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")
//    val a = readOnly.filter { it == "Lunes" || it == "Juernes" }
//    readOnly.size   //Muestra el tamaño de la lista
//    readOnly.get(3)   //Devuelve el valor de la posición 3
//    readOnly.first()   //Devuelve el primer valor
//    readOnly.last()   //Devuelve el último valor
//    println(readOnly)   //[Lunes, Martes, Miércoles, Jueves, Viernes, Sábado, Domingo]
//
//     */
//    /*
//    val diasSemana: MutableList<String> = mutableListOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabao","Domingo")
//    println(diasSemana)
//    diasSemana.add(0,"semana")
//    println(diasSemana)
//    println(diasSemana.none())
//    println(diasSemana.elementAtOrNull(8))
//     */
//
//    val diasSemana: MutableList<String> = mutableListOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabao","Domingo")
//    /* for ((pos, item) in diasSemana.withIndex()){
//        println("La posicion $pos contiene $item")
//    }*/
//
//    val nuevaLista: MutableList<String> = mutableListOf()
//    diasSemana.forEach {
//        nuevaLista.add(it+":")
//    }
//    println(diasSemana)
//    println(nuevaLista)
//
//}