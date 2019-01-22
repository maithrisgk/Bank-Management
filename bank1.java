import java.rmi.*;
import java.util.Vector;
public interface bank1 extends Remote
{
    public Vector<account> getbankaccounts() throws RemoteException;
}
