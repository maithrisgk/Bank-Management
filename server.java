import java.rmi.*;
import java.util.Vector;
public class server
{
    private static final String host="localhost";
    public static void main(String[] args) throws Exception
    {
        account[] account={new account(11,"swathi","sri",112.58),
                new account(22,"lashmi","priya",507.85),
                new account(33,"sp","rm",2435.00),
                new account(44,"ps","mr",666.00)
        };
        Vector<account> accdetails= new Vector<account>();
        for(int i=0;i<account.length;i++)
            accdetails.add(account[i]);
        bankimpl temp=new bankimpl(accdetails);
        String rmioname="rmi://"+host+"/accounts";
        Naming.rebind(rmioname,temp);
        System.out.println("binding complete..\n");
    }}
