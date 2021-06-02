/*
Vamos explorar mais comportamentos específicos do Map
 */
fun main() {

    val pedidos = mapOf<Int, Double>(Pair(1, 20.0), Pair(2, 30.0), 3 to 50.0, 4 to 100.0, 5 to 150.00, 6 to 88.0)


    //Pegar o valor desse jeito, de uma key inexistente retorna null
    val valorPedido: Double? = pedidos[100]
    println(valorPedido)

    //O mesmo vale para pegar o valor assim:
    val valorPedido2: Double? = pedidos.get(100)
    println(valorPedido2)

    //As vezes queremos que ao pegar um valor de key inexistente exploda uma exception, entao fazemos:
    //Deixei comentado, pois lança excpetion!
    /*
    val valorPedido3: Double = pedidos.getValue(100)
    println(valorPedido3)
    */

    //Fazendo retorno na expressa lambda:
    pedidos.getOrElse(100) {
        println("Quando a chave nao existe, caímos aqui!")
    }

    //Fazendo retorno na expressa lambda2:
    val mensagem = pedidos.getOrElse(100) {
        "Não achei"
    }
    println(mensagem)

    //Garantindo um valor padrão, caso a chave nao exista:
    val valorPadrao = pedidos.getOrDefault(100, -100.0)
    println(valorPadrao)

    //Pegando todas keys de um mapa e colocar em uma coleção
    for (chave in pedidos.keys) {
        println("É uma chave: $chave")
    }

    //Pegando todos os valores de um mapa e colocar em uma coleção
    for (valor in pedidos.values) {
        println("É um valor: $valor")
    }

    //Filtros:
    //Nesse temos que enviar o pair (Chave~Valor)
    //Vamos filtrar: pegar os com chaves pares e valores maiores que 50
    val pedidosFiltrador = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50
    }
    println(pedidosFiltrador)

    //Filtros nos valores. Vamos pegar valores maiores que 100:
    //Não precisamos passar o pair (chave / valor)
    val pedidoValorFiltrado = pedidos.filterValues { valor ->
        valor > 100
    }
    println(pedidoValorFiltrado)

    //Filtros nas chaves. Pegar somente os que tem chave impares:
    //Não precisamos passar o pair (chave / valor)
    val pedidoChaveFiltrado = pedidos.filterKeys { chave ->
        chave % 2 != 0
    }
    println(pedidoChaveFiltrado)

    //Escrita nos maps (Somando, Subtraindo, ettc, nos mapas)!
    //O MAP ORIGINAL NÃO É AFETADO!

    //Somando a um map mais um par de chave~valor.
    //O resultado vai para outro mapa, o map pedidos não é alterado!
    println(pedidos + Pair(7, 250))
    println(pedidos)

    //Somando a um map com outro.
    //O resultado vai para outro mapa, o map pedidos não é alterado!
    println(pedidos + mapOf(7 to 90.0, 8 to 10.0))
    println(pedidos)

    //Somando a um map com outro.
    //O resultado vai para outro mapa, o map pedidos não é alterado!
    println(pedidos + (7 to 90.0) + (8 to 133.0))
    println(pedidos)

    //Subtraindo
    //Podemos subtrair com a chave
    println(pedidos - 6)
    println(pedidos)

    //Subtraindo
    //Podemos subtrair com uma lista de chaves
    println(pedidos - listOf(1, 2))
    println(pedidos)

    //Escrtia, mas agora VAMOS ALTERAR O MAP ORIGINAL, A FONTE!

    val pedidos2 = mutableMapOf(Pair(1, 20.0), Pair(2, 30.0), 3 to 50.0, 4 to 100.0, 5 to 150.00, 6 to 88.0, 7 to 20.0)

    //Adicionando um conjunto que tem pares no mapa
    //Poderia ser uma lista no lugar do set
    pedidos2.putAll(setOf<Pair<Int, Double>>(8 to 90.0, 9 to 255.0))
    println(pedidos2)

    //Adicionando um conjunto que tem pares no mapa
    //Poderia ser uma lista no lugar do set
    pedidos2 += setOf<Pair<Int, Double>>(10 to 90.0, 11 to 255.0)
    println(pedidos2)

    //Removendo com chave, já vimos no outro arquivo (básico), mas tem outro método para isso:
    pedidos2.keys.remove(4)
    println(pedidos2)

    //Vamos remover com o valor, e o primeiro valor encontrado será removido, ou seja,
    //Se tiver valores repetidos somente um é removido!
    pedidos2.values.remove(20.0)
    println(pedidos2)

    //Outra alternativa de remoção com chave:
    //Vamos remover a chave 2
    pedidos2 -= 2
    println(pedidos2)
}