package jumpstatement;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=2;i<=6;i++) {
	if(i==3)
	{
	System.out.println("webdriver");
	}
	System.out.println("testing");
	}

	for(int i=3;i<=8;i++) {
System.out.println(i+"selenium");
if(i==4) {
	System.out.println(i+"webdriver");
	break;
}
System.out.println(i+"testing");
}

	}
	}


