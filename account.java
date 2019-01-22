public class account implements java.io.Serializable
{
    private int accnum;
    private String surname;
    private String finame;
    private double bal;
    public account(int accno,String sname, String fname,double balan)
    {
        accnum=accno;
        surname=sname;
        finame=fname;
        bal=balan;
    }
    public int getacctnum()
    {
        return accnum;
    }
    public String getname()
    {
        return (finame+""+surname);
    }
    public double getbalance()
    {
        return bal;
    }
    public double withdraw(double amt)
    {
        if((amt>0)&&(amt<=bal))
            return amt;
        else
            return 0;
    }
    public void deposit(double amt)
    {
        if(amt>0)
            bal+=amt;
    }}
