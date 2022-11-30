class lab6
{       public static void main(String args[])
        {       Test ob1 = new Test(5,5.3f);
                Test ob2 = new Test(8,4.6f)
                Test ob3 = new Test(13,7.8f)
                
                ob1=NULL //removing memory for ob1;
                System.gc();
        }
 }
 
class Test
{	int a;
	float b;
	Test(int i,float j)
	{
		a = i;
		b = j;
	}
	public void finalize()
	{
		System.out.println("Garbage Collector called");
		System.out.println("Object garbage collected: " + this);
	}
}
