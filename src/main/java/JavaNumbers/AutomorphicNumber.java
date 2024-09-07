package JavaNumbers;

public class AutomorphicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//last digit of the number is as the square of the numbers last digit
		
		//eg:5=5*5=25(5==5)
		int num=25;
		System.out.println(num);
		int sqr=num*num;
		int lastnum=0,lastsqr=0;
		int Sumnum=0,Sumsqr=0;
		System.out.println(sqr);
		while(num>0)
		{
			 lastnum=num%10;
			 Sumnum=(Sumnum*10)+lastnum;
			num=num/10;
			
			 lastsqr=sqr%10;
			 Sumsqr=(Sumsqr*10)+lastsqr;
			 sqr=sqr/10;
			
		}
		System.out.println(Sumnum);
		System.out.println(Sumsqr);
		if(Sumnum==Sumsqr)
		{
			System.out.println("Automorphic number");
		}
		else
		{
			System.out.println("not a automorphic number");
		}
		

	}

}
