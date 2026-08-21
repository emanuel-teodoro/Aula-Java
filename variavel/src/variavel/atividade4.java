//informar
//nome produto/preço unitario/quantidade/% de desconto/calculo total da compra

package variavel;

public class atividade4 {

	public static void main(String[] args) {
		
		String nome = "carne";
		float preco = 14.54f;
		float quantidade = 5.00f;
		float desconto = 2.0f;
		float pagamento;
		
		pagamento = (preco * quantidade) - desconto;
		
		System.out.println("total a pagar R$" + pagamento);

	}

}
