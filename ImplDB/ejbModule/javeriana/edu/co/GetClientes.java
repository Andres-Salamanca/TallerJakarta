package javeriana.edu.co;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;

/**
 * Session Bean implementation class GetClientes
 */
@Stateless(mappedName = "GetClientes")
@LocalBean
public class GetClientes implements GetClientesRemote {

    /**
     * Default constructor. 
     */
    public GetClientes() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String SayHello() {
		
		return "Hello world";
	}

}
