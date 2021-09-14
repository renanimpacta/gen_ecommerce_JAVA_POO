package entities;

import java.util.List;

public class Produtos {

	// atributos

	private String codigoProduto;
	private String nomeProduto;
	private double valorProduto;
	private int estoque;

	// construtor

	public Produtos(String codigoProduto, String nomeProduto, double valorProduto, int estoque) {
		super();
		this.codigoProduto = codigoProduto;
		this.nomeProduto = nomeProduto;
		this.valorProduto = valorProduto;
		this.estoque = estoque;

		// Encapsulamento = getters and setters

	}

	public String getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	// metodos

	public void mostrarNaTela() {

		// MOSTRA A LISTA DE PRODUTOS

		System.out.print(
				this.codigoProduto + "\t" + this.nomeProduto + "\t" + this.valorProduto + "\t" + this.estoque + "\n");

	}

	public void inserirEstoque(int valor) {
		if (valor > 0) {
			this.estoque = this.estoque + valor;
			System.out.println("Sucesso!!");
		} else {
			System.out.println("valor inválido!");
		}

	}

	public void retirarEstoque(int valor) {
		this.estoque = this.estoque - valor;
	}
	
	//polimorfismo retira estoque ADMIN
	public void retirarEstoque(int valor, int estoqueDisponivel) {
		if (valor > 0 && valor < estoqueDisponivel) {
			this.estoque = this.estoque - valor;
			System.out.println("Sucesso!!");
		} else {
			System.out.println("ERRO - valor inválido!");
		}
	}

	@Override
	public String toString() {
		return codigoProduto + "\t" + nomeProduto + "\t\t" + valorProduto + "\t\t" + estoque;
	}

}
