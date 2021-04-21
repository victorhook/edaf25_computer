package Hardware;

public class Address {
private int addr;
	
	public Address(int addr){
		this.addr = addr;
	}
	public String print() {
		return "[" + addr + "]";
	}
}

