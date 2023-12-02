package com.uce.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.inventario.repository.IInventarioRepository;
import com.uce.edu.inventario.repository.modelo.Bodega;
import com.uce.edu.inventario.repository.modelo.Inventario;
import com.uce.edu.inventario.repository.modelo.Producto;
import com.uce.edu.inventario.service.IBodegaService;
import com.uce.edu.inventario.service.IInventarioService;
import com.uce.edu.inventario.service.IProductoService;

@SpringBootApplication
public class Pa2U1P5Je2Application implements CommandLineRunner {

	@Autowired
	private IProductoService iProductoService;
	
	@Autowired
	private IBodegaService iBodegaService;
	
	
	@Autowired
	private IInventarioService iInventarioService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P5Je2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Producto p1 = new Producto();
		p1.setCodigoBarras("12345");
		p1.setNombre("hp 15 laptop");
		p1.setStock(50);

		this.iProductoService.guardar(p1);

		Producto p2 = new Producto();
		p2.setCodigoBarras("46556456");
		p2.setNombre("teclado hp");
		p2.setStock(100);
		
		this.iProductoService.guardar(p2);
		
		
		/*Bodega b1 = new Bodega();
		b1.setNombre("bodega norte");
		b1.setCapacidad(200);
		b1.setCodigo("5555");
		this.iBodegaService.guardar(b1);
		
		Inventario v1 = new Inventario();
		v1.setBodega(b1);
		this.iInventarioService.registrar("5555", "12345", 50);
		this.iInventarioService.registrar("5555","46556456",100);
		this.iInventarioService.registrar("5555", "12345", 20);
		*/
		
		

	}

}
