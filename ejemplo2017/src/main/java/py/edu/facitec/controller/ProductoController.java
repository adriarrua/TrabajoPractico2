package py.edu.facitec.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import py.edu.facitec.ejemplo2017.dao.ProductoDAO;

import py.edu.facitec.ejemplo2017.model.Cliente;
import py.edu.facitec.ejemplo2017.model.Producto;
@Controller
@Transactional
public class ProductoController {
	//CREA UNA INSTANCIA DEL OBJETO
	//PARA TODA LA APLICACION
	//INYECCION DE DEPENDENCIA
	@Autowired
	private ProductoDAO productoDao;
	
	@RequestMapping("/producto") //CONVIERTE LO RECIBIDO POR LA URL EN CLIENTE JAVA CLIENTE
	public String registrar(Producto producto){
		System.out.println("Registrando producto "+producto);
		productoDao.save(producto);
		
		return "/view/producto/ok";
		
	}
}
