
package br.com.cadastro.model;

import javax.persistence.*;

@Entity
@Table(name = "Cadastrocep")
public class CadastroCepEntity {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "CODIGO_LOJA", nullable = false)
	private String cod;

	@Column(name = "FAIXA_INICIO", nullable = false)
	private int faixaInicio;

	@Column(name = "FAIXA_FIM", nullable = false)
	private int faixaFim;
	
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public int getFaixaInicio() {
		return faixaInicio;
	}

	public void setFaixaInicio(int faixaInicio) {
		this.faixaInicio = faixaInicio;
	}

	public int getFaixaFim() {
		return faixaFim;
	}

	public void setFaixaFim(int faixaFim) {
		this.faixaFim = faixaFim;
	}

}