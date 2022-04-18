package br.com.fiap.jpa;
import br.com.fiap.jpa.entity.Acessorio;
import br.com.fiap.jpa.entity.Carro;
import br.com.fiap.jpa.entity.Modelo;
import br.com.fiap.jpa.service.impl.AcessorioServiceImpl;
import br.com.fiap.jpa.service.impl.CarroServiceImpl;
import br.com.fiap.jpa.service.impl.ModeloServiceImpl;

public class Main {

	public static void main(String[] args) {
		
		ModeloServiceImpl modeloService = ModeloServiceImpl.getInstance();
		AcessorioServiceImpl acessorioService = AcessorioServiceImpl.getInstance();
		CarroServiceImpl carroService = CarroServiceImpl.getInstance();
		
		Modelo modelo1 = new Modelo("SUV");
	
		
		
		Acessorio acessorio1 = new Acessorio("Aerofólio");
		Acessorio acessorio2 = new Acessorio("Roda de liga leve");

		modeloService.cadastrar(modelo1);
		

		acessorioService.cadastrar(acessorio1);
		acessorioService.cadastrar(acessorio2);
		
		Carro carro1 = new Carro("GED2D43", "Vermelho", "10005457975", modelo1);
		carroService.cadastrar(carro1);
		carroService.associar(carro1.getId(), acessorio1.getId());
		carroService.associar(carro1.getId(), acessorio2.getId());
	
		modeloService.listar().forEach(System.out::println);
		
		acessorioService.listar().forEach(System.out::println);
		carroService.listar().forEach(System.out::println);

	}
}
		
		

