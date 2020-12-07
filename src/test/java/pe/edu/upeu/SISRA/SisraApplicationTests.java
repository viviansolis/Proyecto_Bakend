package pe.edu.upeu.SISRA;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import pe.edu.upeu.SISRA.dao.AsociacionDao;
import pe.edu.upeu.SISRA.dao.DocumentoDao;
import pe.edu.upeu.SISRA.dao.RolDao;
import pe.edu.upeu.SISRA.dao.UsuarioDao;

@SpringBootTest
class SisraApplicationTests {
	@Autowired
	AsociacionDao asc;
	@Autowired
	DocumentoDao d;
	@Autowired
	PasswordEncoder p;
	@Autowired
	RolDao r;
	@Autowired
	UsuarioDao u;
	
	@Test
	void contextLoads() {
		
		/*System.out.println(asc.readAll());*/
		
		/*System.out.println(d.read(1));*/
		
		/*System.out.println(p.encode("1234"));*/
		
		System.out.println(r.buscarRolUser(6));
	}

}
