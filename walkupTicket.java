public class WalkupTicket extends RegularTicket{
	
	
	public WalkupTicket(int ticketNumber){
	    super(ticketNumber);
		super.price = 50.0;
	}
	
	
	public String toString(){
		return super.toString() + "This is a walkup ticket.\n";
	}
	
}