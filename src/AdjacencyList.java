import java.util.LinkedList;

/**
 * Created by murad on 18/07/16.
 */
public class AdjacencyList {

    /**
     * Array of linked lists container
     * [
     * V0 [1][]->[2][x]
     * V1 [0][x]
     * V2 [0][x]
     * ]
     */

    private final LinkedList<Tuple<Station, Station>>[] adjacencyList;

    /**
     * /*http://theoryofprogramming.com/2014/12/24/graph-theory-basics/
     * implementation of adjacencyList constructor taken from here
     *
     * @param vertices
     */
    public AdjacencyList(int vertices) {
        adjacencyList = (LinkedList<Tuple<Station, Station>>[]) new LinkedList[vertices];

        for (int i = 0; i < adjacencyList.length; ++i) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int weight, Station startStation, Station endStation) {
        adjacencyList[startStation.getStationNum()].add(new Tuple(endStation, weight));
    }
    public void printAdjacencyList() {
        int i = 0;

        for (LinkedList< Tuple<Station, Station> > list : adjacencyList) {
            System.out.print("adjacencyList[" + i + "] -> ");

            for (Tuple<Station, Station> edge : list) {
                System.out.print(edge.getLeft() + "(" + edge.getRight() + ")");
            }

            ++i;
            System.out.println();
        }
    }
}
class Run {
    public static void main (String[] args){

        AdjacencyList test = new AdjacencyList(3);
        test.addEdge(0, new Station("gg", false), new Station("ff", false));
        test.addEdge(0, new Station("gg", false), new Station("ff", false));
        test.addEdge(0, new Station("gg", false), new Station("", false));
    }
}

