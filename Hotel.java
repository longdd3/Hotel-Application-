package assigments;

public class Hotel {
	private String name;
	private String location;
	private int numberofRoom;
	private Room[] rooms;
	private int occupiedCnt;
	 private static final int NOT_FOUND = -1;
	public Hotel() {
		//set default constructor
		rooms = new Room[10];
	}
	
	
	//parameterized constructor
	public Hotel(String name, String location) {
		this.location = location;
		this.name = name;
		numberofRoom =  0 ;
		numberofRoom = 0;
		occupiedCnt = 0;
		rooms = new Room[10];
		
	}
	public int getNumberofRoom(){
		return numberofRoom;
	}
	public void setNumberofRoom() {
		this.numberofRoom = numberofRoom;
	}
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public void setName( String name) {
		this.name = name;
	} 
	public void setLocation(String location) {
		this.location = location; 
	}
	public boolean isFull() {
		if (occupiedCnt == numberofRoom) {
			return true;
		} else {
		return false;
		
	}
	}
	
	public boolean isEmpty() {
		if (occupiedCnt == numberofRoom) {
			return false;
		} else {
		return true;
		
	}
	}
	

	

	public void addRoom(int roomnumber, String bedtype, char smoke, double roomrate ) {
		Room room = new Room(roomnumber, bedtype, smoke, roomrate);
		room.setOccupied(false);
		rooms[numberofRoom]= room;
		numberofRoom++;
	}
	public void addReservation(String visitor,char smoking,String bedType) {
		boolean reserStatus = false;
		for (int i =0 ; i < numberofRoom;i++) {
		Room room = rooms[i];
		if (room != null 
				&& room.isOccupied()
				&& room.getOccupantname().equalsIgnoreCase(visitor)) {
			System.out.println("System found withc criteria");
			System.out.println(room);
			room.setOccupied(false);
			occupiedCnt--;
			reserStatus = true;
			System.out.println("System Reserved successfully");
			break;
		}
			}
		if (reserStatus == true) {
			System.out.println("Room was reserved");
		}
		}
	
	public void  cancelReservation(String visistor) {
		boolean cancelStatus = false;
		for (int i =0 ; i < numberofRoom;i++) {
		Room room = rooms[i];
		if (room != null 
				&& room.isOccupied()
				&& room.getOccupantname().equalsIgnoreCase(visistor)) {
			System.out.println("System found withc criteria");
			System.out.println(room);
			room.setOccupied(false);
			occupiedCnt--;
			cancelStatus = true;
			System.out.println("System cancelled successfully");
			break;
		}
			}
		if (cancelStatus == true) {
			System.out.println("Room was cancelled");
		}
		}
	public int findReservation(String visistor) {
		int index= -1;
		boolean findresult = false;
		for (int i =0 ; i < numberofRoom;i++) {
			Room room = rooms[i];
			if (room != null 
					&& room.isOccupied()
					&& room.getOccupantname().equalsIgnoreCase(visistor)) {
				findresult = true;
				break;
			}
	}
		if (findresult = false) {
			return NOT_FOUND;
		}
		else {
			return index;
		}
	}	
		public void printReservationList() {
			for (int i =0 ; i < numberofRoom;i++) {
			Room room = rooms[i];
			if (room != null 
					&& room.isOccupied()) {
				System.out.println(room);
				room.setOccupied(false);
				break;
			}
				}
			
		}
		
		public double getDailySales() {
			double dollaramount= 0;
			for (int i =0 ; i < numberofRoom;i++) {
				Room room = rooms[i];
				if (room != null 
						&& room.isOccupied()) {
					room.setOccupied(false);
					dollaramount = dollaramount + room.getRoomrate();
				}
					}
			return dollaramount;
				
		}
		public double occupancyPercentage() {
			double occupancypercentage;
			occupancypercentage = (occupiedCnt / numberofRoom) *10;
			return occupancypercentage;
		}
		public String toString() {
			String roomdetail = "";
			for(int i= 0 ; i < numberofRoom ; i++) {
				Room room = rooms[i];
				if (room != null 
						&& room.isOccupied()) {
					roomdetail = roomdetail + room.toString();
				
				}
			}
			return "Hotel Name: " + name + "\n"+
					"Number of Rooms: " +  numberofRoom + "\n"+
					"Number of Occupied Rooms: " + occupiedCnt + "\n";

		}
	
	}
