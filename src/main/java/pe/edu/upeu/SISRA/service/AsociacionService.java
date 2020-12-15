package pe.edu.upeu.SISRA.service;

import java.util.List;
import java.util.Map;



import pe.edu.upeu.SISRA.entity.Asociacion;

import pe.edu.upeu.SISRA.entity.Tipo_Asociacion;

public interface AsociacionService {
	int create(Asociacion a);
	List<Map<String, Object>> readAll();

}
