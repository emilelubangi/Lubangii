 /**
 * @(#)Student.java
 *
 *
 * @author
 * @version 1.00 2018/3/15
 */


public class Student {
	private String iD;
	private String name;
	private int score;

    public Student() {
    }
    public Student(String id,String nm,int sc)
    {
    	iD = id;
    	name = nm;
    	score = sc;
    }
    //new one overloading
    public Student(String id,String nm)
    {
    	iD = id;
    	name = nm;

    }//end of new constructor


    public void setId(String id)
    {
    	iD = id;
    }
    public void setName(String nm)
    {
    	name = nm;
    }
    public void setScore(int sc)
    {
    	score = sc;
    }

    public String getId()
    {
    	return iD;
    }
    public String getName()
    {
    	return name;
    }
    public int getScore()
    {
    	return score;
    }

    public String toString()
    {
    	return getId() +"\t" + getName() + "\t" + getScore();
    }

}