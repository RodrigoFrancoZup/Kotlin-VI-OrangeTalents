fun main() {
    //Collection Transformation - Transformar Colleções!
    //É: Ao fazer a operação em cima de uma coleção gerará uma outra coleção.


    //Função map = Gera uma nova coleção, ao realizar operacoes em cima de uma coleção já existente
    //Exemplo:
    val numeros = setOf(1,2,3,4,5)
    val numerosAposFuncaoMap = numeros.map { it * 5 }
    println(numeros)
    println(numerosAposFuncaoMap)



    //Vamos criar a classe Pedido, para exemplificar melhor as funções de associação
    //Uma lista de pedido:
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0),
    )
    println(pedidos)

    //Association:
    //Pegaremos a lista pedidos e transformaremos no mapa, sua chave será seu id e o valor será o objeto pedido
    val pedidosMapeados = pedidos.associate { pedido: Pedido ->
        Pair(pedido.numero, pedido)
    }
    println(pedidosMapeados)

    //Altenativa ao associate:
    //Aqui sempre o objeto já vira o valor, só devemos indicar quem será a chave.
    val pedidosMapeados2 = pedidos.associateBy { pedido -> pedido.numero }
    println(pedidosMapeados2)

    //Esse transforma o objeto em chave, e o corpo da função vai gerar o valor do map (sera boolean)
    //Nesse exemplo, se valor for maior que 50 vamos ter um mapa cujo chave é o objeto e seu valor será true
    val pedidosFretesGratis = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFretesGratis)

    /*Agrupamento

    no exemplo do frete gratis temos um problema, pois na pesquisa temos que passar o objeto completo,
    pois o objeto virou a chave. Com agrupamento, vamos poder pesquisar todos os itens do mapa
    que tiverem o valor true ou false.

    É normal pensar que poderíamos utilizar a função associateBy ao inves da associateWith,
    pois com associateBy poderiamos definir a chave com false ou true e o valor seria o proprio objeto e
    após isso era só buscar os com chave true (pedidos com fretes gratis), mas lembre-se,
    mapas devem ter chaves únicas! Logo nesse caso haveria sempre substituição de item (ao passar chave igual - só teríamos um item false e um item true).
    Então, como resolver? Com a funçoes do tipo Group.
    No caso vamos ter em nosso mapa (resultado) um item com a chave false e outro com chave true, só que o valor de cada chave será uma coleção com todos os pedidos.
     */

    val pedidosFreteGratisAgrupados: Map<Boolean, List<Pedido>> = pedidos.groupBy {  pedido ->
        pedido.valor > 50
    }
    println(pedidosFreteGratisAgrupados)
    println(pedidosFreteGratisAgrupados[true])
    println(pedidosFreteGratisAgrupados[false])

    /*
    Agrupamento por GroupingBy:
    No lugar de usar a função .groupBy, podemos usar a função .groupingBy.
    A diferença é que o retorno dessa função não será um mapa, será do tipo Grouping, e com esse tipo podemos fazer alguams operações como:
        eachCount (conta quanto elementos por cada tipo de chave), fold(), reduce(), aggregate().

     */

}