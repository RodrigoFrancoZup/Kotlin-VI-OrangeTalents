fun main() {

    //Criando um mapa, cujo a chave sera do tipo Int o seu Valor do tipo Double
    val pedidosMap = mapOf<Int, Double>(Pair(1, 20.0), Pair(2, 30.0))

    //Alternativa 2 para criar um mapa, cujo a chave sera do tipo Int o seu Valor do tipo Double
    val pedidos = mapOf<Int, Double>((1 to 20.0), (2 to 30.0))

    //Dessa forma é impresso chave=valor
    println(pedidos)

    //Acessando valor via chave, aqui não é indice:
    val pedidoId20: Double? = pedidos[1]
    pedidoId20?.let {
        println("Pedido: $it")
    }

    //Percorrendo map com for:
    for (pedido in pedidos){
        println(pedido)
        println("Chave do pedido ${pedido.key}")
        println("Valor do pedido ${pedido.value}")
    }

    //Operações de etrada em mapa:
    val pedidosMapMutavel = mutableMapOf<Int,Double>()

    //Adicionando
    pedidosMapMutavel[1] = 35.0

    //Adicionando alternativa 2 = Chave , Valor
    pedidosMapMutavel.put(2, 55.0)

    //Atualizando:
    pedidosMapMutavel[1] = 36.0

    //Atualizando alternativa 2 = Chave, Novo Valor
    pedidosMapMutavel.put(2, 75.0)

    //Adicionar com a seguinte verificação: adiciona se não tiver essa chave, se tiver nao adiciona
    // e NÃO ATUALIZA!
    pedidosMapMutavel.putIfAbsent(2, 75.0)

    //Remove item através da chave!
    pedidosMapMutavel.remove(2)

    //Remove se o item com chave X tiver o valor passado!
    pedidosMapMutavel.remove(1, 100.00)

    println(pedidosMapMutavel)
}