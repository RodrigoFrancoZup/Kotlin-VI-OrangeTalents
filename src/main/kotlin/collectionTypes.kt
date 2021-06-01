/*
Temos dois tipos de Collections, as mutaveis e as Read Only (https://kotlinlang.org/docs/collections-overview.html)
As mutavies permitem alterarmos os dados dentro da coleção, podemos alterar seu valor, adicionar item novo, remover item
As Read Only só permite ler os dados. List, Set, Map são desse tipo
As mutaveis tem Mutable no nome, exemplo:

    val nomes: MutableList<String> = mutableListOf(
        "Rodrigo",
        "Pedro",
        "Priscila",
        "Ana",
        "Yuri"
    )

    nomes.add("Maria")
    nomes.remove("Yuri")
    println(nomes)
    println(nomes.size)

    As mutáveis possuem o mesmo esquema de hierarquia, no código anterior, poderiamos mudar a assinatura para:
    val nomes: MutableCollection<String> = mutableListOf
 */

fun main(){
    val banco = BancoDeNomes()
    banco.adiciona("Rodrigo")
    println(banco.nomes)

}

/*
Criamos duas listas, primeiro foi a mutavel que irá receber os nomes (vamos adicionar nela os nomes - itens).
A mutavel deixamos com set e get privados, para não ser acessada de fora.

A segunda será a Collection terá seu get() retornando os itens da lista mutável (citada anteriormente),
Sua finalidade é apenas mostrar os itens da lista que recebe itens

Transformamos a primeira lista em companion, assim ela será única para o sistema inteiro!
Não será zerada para cada nova instancia de BancoDeNomes

Por fim criamos um método para pordermos adicionar os itens na primeira lista!
 */
class BancoDeNomes{
    //toList() para não permitir o usuario transformar via cast uma lista read only em mutável!
    //Com toList() vamos devolver uma lista real e não a referencia!
    val nomes: Collection<String> get() = dados.toList()

    fun adiciona(nome:String){
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}