// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(var nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    val usuario = Usuario("Joney")
    val java = ConteudoEducacional("Java", 60)
    val kotlin = ConteudoEducacional("Kotlin", 60)
    val android = ConteudoEducacional("Android", 60)
    val conteudos = listOf(java, kotlin, android)
    val nivel = Nivel.BASICO
    val formacao = Formacao("Java Basico", nivel, conteudos)
    formacao.matricular(usuario)
    println(formacao)
}
