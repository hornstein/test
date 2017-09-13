package test;

public class Calculator {
	
	double a;
	double b;
	double result;

	void add(double a)
	{
		result+=a;
	}
	
	void subtract(double a)
	{
		result-=a;
	}
	
	void multiplyBy(double a)
	{
		result*=a;
	}

	void divideBy(double a)
	{
		result/=a;
	}
	
	void loopAdd(double a, int b)
	{
		for(double i=1.0/b; i<=1.0; i+=1.0/b)
		{
			result+=a;
		}
	}
	
	double getResult()
	{
		return result;
	}
		
	boolean isZero()
	{
		return result==0.0;
	}
	
	boolean isOne()
	{
		return result==1.0;
	}

	boolean isNaN()
	{
		return result==Double.NaN;
	}

	
}
