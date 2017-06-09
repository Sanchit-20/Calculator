package application;

public class Modal {
	
	public double Calculate(double a, double b,String s)
	{
		switch(s)
		{
		case "+":
			return a+b;
		case "-":
			return a-b;
		case "*":
			return a*b;
		case "/":
			if(b==0)
				{return 0;}
			else
			{ return a/b; }
		default:
			return 0;
		}
	}

}
