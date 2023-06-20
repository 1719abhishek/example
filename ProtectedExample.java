package AccessModifiers;

public class ProtectedExample {
	protected void disply(){
		System.out.println(" this program is protected modifier");
	}
}
 class ProtectedExample1 extends ProtectedExample{
	 public static void main (String [] args){
		 ProtectedExample1 obj = new ProtectedExample1();
		 obj.disply();
	 }
 }