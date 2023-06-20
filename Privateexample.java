package AccessModifiers;


class Data {
    // private variable
    private String name;
 // getter method
    public String getName() {
        return this.name;
    }
    // setter method
    public void setName(String name) {
        this.name= name;
}

} 
public class Privateexample {

	public static void main(String[] args) {
		Data d = new Data();

        // access the private variable using the getter and setter
        d.setName("this program is private modifier");
        System.out.println(d.getName());
		

	}

}
