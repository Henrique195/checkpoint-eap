package br.com.fiap.jpa.entity;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_acessorio")
@SequenceGenerator(name = "acessorio", sequenceName = "SQ_TB_ACESSORIO", allocationSize = 1)
public class Acessorio implements Serializable {

	
	private static final long serialVersionUID = -5939550452091815784L;


	public Acessorio() {		
	}
	
	public Acessorio(String acessorio) {
		this();
		this.acessorio = acessorio;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acessorio")
	private Long id;
	
	@Column(name = "ds_acessorio", length = 50,  nullable = false)
	private String acessorio;
	
	@ManyToMany(mappedBy="acessorios")
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

	
	public String getAcessorio() {
		return acessorio;
	}

	public void setAcessorio(String acessorio) {
		this.acessorio = acessorio;
	}

	@Override
	public String toString() {
		
		return "\nAcessorio: " + this.getAcessorio();
	}


}
