package maior_preco;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {

        List<Produto> produtosPedidos = new ArrayList<Produto>(pedido.getProdutos());

        List<Produto> filter = produtosPedidos.stream().filter(p -> p.getCategoria().equals(CategoriaProduto.LIVRO))
                .collect(Collectors.toList());

        return filter;

    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {

        return produtos.stream()
                .max(Comparator.comparing(Produto::getPreco)).get();
    }
}
