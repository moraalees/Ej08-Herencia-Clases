package src

open class Persona(protected val nombre: String, private var edad: Int = 30) {

    init{
        require(nombre.isNotEmpty()){ "El nombre no puede estar vacío." }
        require(edad >= 0){ "La edad no puede ser negativa." }
    }

    fun cumple(){
        edad += 1
    }

    open fun mostrarEdad(){
        println(edad)
    }

    open fun actividad(){
        println("$nombre está haciendo una actividad.")
    }

    override fun toString(): String {
        return "Persona(nombre = $nombre, edad = $edad)."
    }

}