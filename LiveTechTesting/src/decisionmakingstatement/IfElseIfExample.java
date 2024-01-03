package decisionmakingstatement;

public class IfElseIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int var1=40;
int var2=50;
int var3=60;
         
if(var1>var2&&var1>var3) {
	System.out.println("var1 variable value is greater than var2 and var3 variable value"); 
}
else
	if (var2>var3) {
		System.out.println("var2 variable value greaterthan var1 and var3 variable values );");
	}
	else
	{
		System.out.println("var3 variable value is greaterthan var1 and var3 variable values ");
	}
	}

}
