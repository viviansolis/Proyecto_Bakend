package pe.edu.upeu.SISRA.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.SISRA.entity.Asociacion;

public interface AsociacionDao {
	int create(Asociacion a);
	List<Map<String, Object>> readAll();

}
