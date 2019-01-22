import java.rmi.*;
import java.rmi.server.*;
import java.util.Vector;
public class bankimpl extends UnicastRemoteObject implements bank1
{
    private Vector<account> accinfo;
    public bankimpl(Vector<account> accvals) throws RemoteException
    {accinfo=accvals;
    }
    public Vector<account> getbankaccounts() throws RemoteException
    {return accinfo;
    }}
