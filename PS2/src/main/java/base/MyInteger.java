package base;

public class MyInteger {

	//An integer data field named iValue that stores the int value represented by this object
	
	private int iValue;
	
	//A constructor that creates a MyInteger object for the specified iValue.
	public MyInteger(int i){
		iValue=i;
	}
	
	//A get method that returns iValue
	public int getiValue(){
		return iValue;
	}
	
	//Method that returns true if ivalue is even
	public boolean isEven(){
		if (iValue % 2 == 0){
			return true;
		}
			return false;
			}
	
	//Method that returns true if ivalue is odd

	public boolean isOdd(){
		if (iValue % 2 == 1){
			return true;
			}	
		return false;}	
	
	
	//Method that returns true if ivalue is prime


	public boolean isPrime(){
		for (int i=2; i<iValue; i++){
			if (iValue % i == 0){
				return false;
			}
		}
		return true;

			}
				

	
	
	
	//static even method (takes an integer) isEven(int)
	public static boolean isEven(int i){
		if (i % 2 == 0){
			return true;
		}
		return false;
				}
	
	//static odd method
	public static boolean isOdd(int i){
		if (i % 2 == 1){
			return true;
		}
		return false;
		}
	
	
	//static prime method
	public static boolean isPrime(int i){
		for (int j=2; j<i; j++){
			if (i % j == 0){
				return false;		
		}
			}
		return true;
	}
	
	
	
	// static even II isEven(MyInteger)
	
	public static boolean isEven(MyInteger int1){
		int testVal1 = int1.getiValue();
		if (testVal1 % 2 == 0){
			return true;
		}
		return false;
		}
	
	//static odd II
	
	public static boolean isOdd(MyInteger int2){
		int testVal2 = int2.getiValue();
		if (testVal2 % 2 == 1){
			return true;
		}
		return false;
		}
	
	//static prime II
	
	public static boolean isPrime(MyInteger int3){
		int testVal3 = int3.getiValue();
		for (int j=2; j<testVal3; j++){
			if (testVal3 % j == 0){
				return false;		
		}
			}
		return true;
	}
	
	
	
	
	
	
	
	// equals(int) method
	public boolean equals(int a){
		return iValue==a;
	}
	
	//equals(MyInteger)
	
	public boolean equals(MyInteger b) 
	{
		return b.getiValue() == iValue;

	}
	
	
	
}

	
