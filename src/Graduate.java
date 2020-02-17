/**
 * @(#)Graduate.java
 *
 *
 * @author
 * @version 1.00 2018/3/15
 */


public class Graduate extends Student{

	public String qualification;
	public double fees;

    public Graduate() {
    }

     public Graduate(String quali,double fee)
    {

			qualification = quali;
			fees = fee;
    }

     public Graduate(String id, String nm, String quali,double fee)
    {
            super(id,nm);
			qualification = quali;
			fees = fee;
    }

    public void setQualification(String quali)
    {
    	qualification = quali;
    }
    public void setFees(double fee)
    {
    	fees = fee;
    }

    public String getQualification()
    {
    	return qualification;
    }
    public double getFees()
    {
    	return fees;
    }
public String toString()
{
	return getId() +"\t" + getName() + "\t" + getScore() + "\t" + getQualification() + "\t" +  getFees();
}

}