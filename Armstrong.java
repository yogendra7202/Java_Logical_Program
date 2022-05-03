package corejava;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153,t1,t2,a=0;
		t1=num;
		while(t1!=0)
		{
			t2=t1%10;
			t1=t1/10;
			a=a+(t2*t2*t2);
		}
		if(a==num)
		{
			System.out.print("It is an armstrong number.");
		}
		else
		{
			System.out.print("It is not an armstrong number.");
		}

	}

}
