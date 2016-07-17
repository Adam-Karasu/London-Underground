/**
 * Created by murad on 17/07/16.
 */
public class Node {
    private Node tail = null;
    private Station station;

    public Node(Station station) {
        this.station = station;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public String toString() {
        return station.toString() + "\n";
    }
}
