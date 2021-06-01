
fun main(){
    //Apresentando o problema da duplicidade em lista:

    //Lista de pessoas que assistiram o curso android
    val assistiramCursoAndroid = listOf("Rodrigo", "Alex", "Gui", "Fran")

    //Lista de pessoas que assistiram o curso kotlin
    val assistiramCursoKotlin = listOf("Rodrigo", "Paulo", "Rogerio", "Fran")

    //Criando uma lista
    val assistiramAmbos = mutableListOf<String>()

    //Adicionando todos itens de assistiramCursoAndroid na lista assistiramAmbos
    assistiramAmbos.addAll(assistiramCursoAndroid)

    //Adicionando todos itens de assistiramCursoKotlin na lista assistiramAmbos
    assistiramAmbos.addAll(assistiramCursoKotlin)


    /*
    Essa mesma adição poderia ser feito de outra forma:

        val assistiramAmbos = assistiramCursoAndroid + assistiramCursoKotlin

        obs: esse + pode ser substituído por "plus", será a mesma função

     */

    //Veremos que teremos itens repetidos
    println(assistiramAmbos)

    //Eliminando a repetição:
    println(assistiramAmbos.distinct())

}

