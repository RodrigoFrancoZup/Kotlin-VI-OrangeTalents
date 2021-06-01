
fun main(){
    /*
https://kotlinlang.org/docs/collections-overview.html
Existe uma hierarquia entre as estruturas de dados (Há uma ilustração no link citado). O conjunto com toda essa hierarquia chama-se collections. Na collections há diversas interfaces, por exemplo:

Temos a interface interable que é "mãe" da interface Collection;
A interface Collection é "mãe" de: List e Set;
A interface List é mãe de MutableList;
A interface Set é mãe de Mutable Set;
A interface Map (que não tem pai) é mãe de  MutableMap

(Existe ainda a MutableInterable que é filha de Iterable)
(Existe ainda a MutableCollection que é filha de Collection e de MutableInterable)
(MutableCollection também é pai de MutableList e MutableSet)

     */
    val nomes: List<String> = listOf(
        "Rodrigo",
        "Pedro",
        "Priscila",
        "Ana",
        "Yuri"
    )

    println(nomes)
    println(nomes.size)

    //O código anterior funciona e se eu mudar a declaração da lsita para: val nomes: Iterable<String> vai continuar funcionando
    //Pois as coisas genéricas (adicionar, percorrer coleção for-in) estão no topo da hierarquia(mães).

    //Agora o trecho:
    val carros: Iterable<String> = listOf(
        "Jetta",
        "Golf",
        "Lancer",
        "Civic",
        "Eclipse"
    )

    //println(carros.size)
    //Não roda, pois size já é mais específico de lista, logo Iterable não tem,
    //Resumindo, as coisas genéricas estão no topo (hierarquia de Collections),
    //conforme vamos descendo, vamos ganhando as coisas específicas!
}