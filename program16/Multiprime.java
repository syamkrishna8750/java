package syamkrishna;
import java.util.Scanner;
class multiplication extends Thread{
	public void run() {
		try {
			for(int i=1;i<=10;i++)
			{
				System.out.println(i+"x"+"5"+"="+(i*5));
				Thread.sleep(200);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}
	}
}
class prime extends Thread{
	public void run()
	{int j,limit;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the limit:");
	limit=sc.nextInt();
	
	try
	{int n=2,i=1;
	while(i<=limit) {
		int f=1;
		for(j=2;j<n;j++) {
			if(n%j==0) {
				f=0;
				break;
			}
		}
		if(f==1) {
			i++;
			System.out.println("prime namber:"+n);
		}
		n++;
		Thread.sleep(200);
	}
	}
	catch(InterruptedException e) {
		System.out.println("Interrupted");
	}
	}
	}
class Multiprime{
	public static void main(String[] arg) {
		multiplication m=new multiplication();
		prime p=new prime();
		
		m.start();
		p.start();
	}
}