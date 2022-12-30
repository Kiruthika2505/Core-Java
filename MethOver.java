/*Method Overloading:

				Multiple Methods can have same name with different parameters and return type.
- The muliple methods which performs different operations based on the different instance value.*/

class Over
{
	int a;
	double l,b;
	double  r, pi=3.14;
	
		int Area(int a1)
		{
			a = a1;
		
			return a*a;
		}
		double Area(double l1,double b1)
		{
			l = l1;
			b = b1;
			return l*b;
		}
		void Area(double r1)
		{
				r = r1;
				double cir = pi*r*r;
				System.out.println("Area of Circle: "+cir);
		}
}
class MethOver
{
	public static void main(String args[])
	{
			Over ob = new Over();
			int sq = ob.Area(4);
			double rec = ob.Area(8.3,4.2);				
			ob.Area(2);
			System.out.println("Area of Square: "+ sq);
			System.out.println("Area of Rectangle: "+rec);
			
	}
}