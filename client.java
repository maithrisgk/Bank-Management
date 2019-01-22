import java.rmi.*;
import java.util.Vector;
public class client
{
    private static final String host="localhost";
    public static void main(String[] args)
    {
        try
        {
            bank1 temp=(bank1)Naming.lookup("rmi://"+host+"/accounts");
            Vector<account> accdetails=temp.getbankaccounts();
            for(int i=0;i<accdetails.size();i++)
            {
                account acc=accdetails.elementAt(i);
                System.out.println("\n account no:"+acc.getacctnum());
                System.out.println("name:"+acc.getname());
                System.out.println("balance:"+acc.getbalance());
            }}
        catch(ConnectException ce)
        {
            System.out.println("unable to connect to server!");
            System.exit(1);
        }catch(Exception e)
        {e.printStackTrace();
            System.exit(1);
        }}}
