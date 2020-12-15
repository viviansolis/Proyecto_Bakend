package pe.edu.upeu.SISRA.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.SISRA.dao.AsociacionDao;
import pe.edu.upeu.SISRA.entity.Asociacion;
import pe.edu.upeu.SISRA.service.AsociacionService;

@Service
public class AsociacionServiceImpl implements AsociacionService{
	@Autowired
	private AsociacionDao as;

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return as.readAll();
	}

	@Override
	public int create(Asociacion a) {
		// TODO Auto-generated method stub
		return as.create(a);
	}
	
}
