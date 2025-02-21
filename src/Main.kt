package src

fun main(){
    val persona = Persona("Lucifer", 999)
    val estudiante = Estudiante("Judas", 52, "Oftalmología")

    persona.actividad()
    estudiante.actividad()

    try {
        val estudianteIrreal = Estudiante("Inexistente", -20, "Cocinero")
    } catch (e: IllegalArgumentException) {
        println("Error al crear el estudiante: ${e.message}")
    }
    
}