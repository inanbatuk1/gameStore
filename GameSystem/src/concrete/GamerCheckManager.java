package concrete;

import java.rmi.RemoteException;

import Abstract.GamerCheckService;
import Entities.Gamer;

public class GamerCheckManager implements GamerCheckService{

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) throws RemoteException {


		return false;
	}

}
