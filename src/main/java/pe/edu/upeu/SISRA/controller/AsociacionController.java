package pe.edu.upeu.SISRA.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.SISRA.entity.Asociacion;
import pe.edu.upeu.SISRA.service.AsociacionService;



@RestController
@CrossOrigin(origins = "*", allowedHeaders="*")
@RequestMapping("/asoc")
public class AsociacionController {
	@Autowired
	private AsociacionService as;
	@GetMapping("/all")
	public List<Map<String, Object>> readAll(){
		return as.readAll();
	}
	@PostMapping("/add")
	public int create(@RequestBody Asociacion a) {
		return as.create(a);
	}

}
