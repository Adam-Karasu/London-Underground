/**
 * Created by murad on 17/07/16.
 */
public class Line {
    private Node head;
    private int lineLength;

    public void append(Station station){

        if (head == null){
            head = new Node(station);
            ++lineLength;
        } else {
            Node currentNode = head;
            while (currentNode.getTail() != null){
                currentNode = currentNode.getTail();
            }
            currentNode.setTail(new Node(station));
            ++lineLength;
        }
    }

    public String toString() {
        String s = "";
        Node currentNode = head;
        while (currentNode != null) {
            s += currentNode.toString();
            currentNode = currentNode.getTail();
        }
        return s + "Line length = " + lineLength + "\n";
    }
}
