import java.util.ArrayList;

/*Program to store the detail of zones
 * */
public class Zone {
	String zoneType;
	final int cageCapacity;
	final int zoneId;
	static int zoneCounter = 0;
	boolean hasPark;
	boolean hasCanteen;
	ArrayList<Cage> listOfCages = new ArrayList<Cage>();
	
	public Zone(int cageCapacity,String zoneType,boolean park,boolean canteen){
		this.zoneType = zoneType;
		this.zoneId = zoneCounter++;
		this.cageCapacity= cageCapacity;
		hasPark=park;
		hasCanteen=canteen;
	}
	
	public int getZoneCount() {
		return zoneId;
	}
}