package javeriana.edu.co;

import jakarta.ejb.Remote;

@Remote
public interface GetClientesRemote {
	
	public String SayHello();

}
