package br.com.fiap.jpa.entity;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_modelo")
@SequenceGenerator(name = "modelo", sequenceName = "SQ_TB_MODELO", allocationSize = 1)
public class Modelo implements Serializable {
	
	private static final long serialVersionUID = 68632367501517561L;

	public Modelo() {		
	}
	
	public Modelo(String modelo) {
		this();
		this.modelo = modelo;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "modelo")
	private Long id;
	
	@Column(name = "ds_modelo", length = 50, nullable = false)
	private String modelo;
	
	@OneToMany(mappedBy = "modelo")
	private List<Carro> carros;
	
	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		
		return "\nModelo: " + this.getModelo();
	}
	

}
