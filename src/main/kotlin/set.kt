
fun main(){
    //Apresentando o problema da duplicidade e resolvendo com Set:

    //Lista de pessoas que assistiram o curso android
    val assistiramCursoAndroid = listOf("Rodrigo", "Alex", "Gui", "Fran")

    //Lista de pessoas que assistiram o curso kotlin
    val assistiramCursoKotlin = listOf("Rodrigo", "Paulo", "Rogerio", "Fran")

    //Criando um conjunto e colocando nela os idens de duas outras duas listas
    val assistiramAmbos: MutableSet<String> = (assistiramCursoAndroid + assistiramCursoKotlin).toMutableSet()

    //Adicionando elementos no conjunto, o Rodrigo não vai, pois já tem!
    assistiramAmbos.add("Rodrigo")
    assistiramAmbos.add("Irineu")

    //Veremos que não teremos itens repetidos
    println(assistiramAmbos)

    //Operações específicas do SET:

    //Conjunto de pessoas que assistiram o curso android
    val assistiramCursoAndroidSet = listOf("Rodrigo", "Alex", "Gui", "Fran")

    //Conjunto de pessoas que assistiram o curso kotlin
    val assistiramCursoKotlinSet = listOf("Rodrigo", "Paulo", "Rogerio", "Fran")

    //União de dois conjuntos! O seu resultado não aceitará repetição!
    val assistiramAmbosSet = assistiramCursoAndroidSet union assistiramCursoKotlinSet

    //a função union pode ser usada do jeito que foi ou:
    // val assistiramAmbosSet = assistiramCursoAndroidSet.union(assistiramCursoKotlinSet) ou
    // val assistiramAmbosSet = assistiramCursoAndroidSet union(assistiramCursoKotlinSet)

    //Soma de dois conjuntos! O seu resultado não aceitará repetição!
    val assistiramAmbosSet2 = assistiramCursoAndroidSet + assistiramCursoKotlinSet

    //Diferença de dois conjuntos! O seu resultado será: pega quem assistiu curso android,
    // e vai tirar os elemtos que também estão no conjunto do curso Kotlin
    val assistiramAmbosSet3 = assistiramCursoAndroidSet + assistiramCursoKotlinSet

    //Interseção, seu resultado será os itens que estão no conjunto do curso de android e kotlin, ou seja, quem assistiu os dois cursos!
    val assistiramAmbosSet4 = assistiramCursoAndroidSet intersect  assistiramCursoKotlinSet

    println(assistiramAmbosSet)
}

