/**
 * Created by murad on 17/07/16.
 */
public class Station {
    private int stationNum;
    private String name;
    /*onLines will show all lines this station
    * e.g London Bridge ON Jubilee Line*/
    private Line[] onLines;
    private int zone;
    private boolean hasConnection;

    public Station(String name, boolean hasConnection) {
        this.name = name;
        this.hasConnection = hasConnection;
    }

    public int getStationNum() {
        return stationNum;
    }

    public boolean isHasConnection() {
        return hasConnection;
    }

    public void setHasConnection(boolean hasConnection) {
        this.hasConnection = hasConnection;
    }

    public String toString(){
       //TODO add lines and zone
        return "Station : " + name;
    }
}
