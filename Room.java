package assigments;

public class Room {
	private int roomnumber;
	private String bedtype;
	private char smoke;
	private double roomrate;
	String occupantname;
	private boolean occupied;
	
	public Room( int roomnumber,String bedtype, char smoke, double roomrate) {
		this.roomnumber = roomnumber;
		this.bedtype = bedtype;
		this.smoke = smoke;
		this.roomrate = roomrate;
	}
	public int getRoomnumber() {
		return roomnumber;
	}
	public String getBedtype() {
		return bedtype;
	}
	public char getSmoke(){
		return smoke;
	}
	public double getRoomrate() {
		return roomrate;
	}
	public boolean isOccupied() {
		return occupied;
	}
	public String getOccupantname() {
		return occupantname;
	}
	public void setOccupantname() {
		this.occupantname = occupantname;
	}
	 public void setRoomnumber(int roomnumber) {
		 this.roomnumber = roomnumber;
	 }
	 public void setBedtype(String bedtype) {
		 this.bedtype = bedtype;
	 }
	 public void setSmoke(char smoke) {
		 this.smoke = smoke;
	 }
	 public void setRoomrate(double roomrate) {
		 this.roomrate = roomrate;
	 }
	 
	 public void setOccupied(boolean occupied) {
		 this.occupied = occupied;
	 }
	 public String toString() {
		 String status =(isOccupied()==true)?getOccupantname():"Not Occupied";
		 return "Room Number: " +getRoomnumber()+"\n"+
         "Occupant name:"+status+"\n"+
         "Smoking room: " +getSmoke()+"\n"+
         "Bed Type: queen " +getBedtype()+"\n"+
         "Rate: "+getRoomrate()+"\n";
		 
	 }
}
