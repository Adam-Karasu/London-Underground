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

    /**
     * creates cartesian product - WHY : 2D data structure AND
     * Each index holds both station name and weight
     */
    private final LinkedList<Tuple<Station, Integer>>[] adjacencyList;

    /**
     * /*http://theoryofprogramming.com/2014/12/24/graph-theory-basics/
     * implementation of adjacencyList constructor taken from here
     *
     * @param vertices
     */
    public AdjacencyList(int vertices) {
        adjacencyList = (LinkedList<Tuple<Station, Integer>>[]) new LinkedList[vertices];

        for (int i = 0; i < adjacencyList.length; ++i) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int weight, Station startStation, Station endStation) {
        adjacencyList[startStation.getStationNum()].add(new Tuple(endStation, weight));
    }

    public String printAdjacencyList() {
        String out = "";
        int i = 0;

        for (LinkedList<Tuple<Station, Integer>> list : adjacencyList) {
            out += "adjacencyList[" + i + "] -> ";

            for (Tuple<Station, Integer> edge : list) {
                out += edge.getLeft().toString() + "(" + edge.getRight() + ")";
            }

            ++i;
            out += "\n";
        }
        return out;
    }
}

class Run {
    public static void main(String[] args) {

        //TODO give Station class static numbering variable - each new station saves its own number from that variable
        Station londonBridge = new Station("London Bridge", true, 0);
        Station southwark = new Station("Southwark", false, 1);
        Station waterloo = new Station("Waterloo", false, 2);
        Station elephantAndCastle = new Station("Elephant & Castle", false, 3);

        AdjacencyList test = new AdjacencyList(4);
        test.addEdge(1, londonBridge, southwark);
        test.addEdge(1, londonBridge, elephantAndCastle);
        test.addEdge(1, waterloo, southwark);
        test.addEdge(1, southwark, waterloo);
        test.addEdge(1, southwark, londonBridge);
        test.addEdge(1, elephantAndCastle, londonBridge);

        /**
         * The above will create the below un-directional graph
         *
         * wl   s   lb
         * 0---0---0
         *        /
         *       0 e&c
         */

        System.out.println(test.printAdjacencyList());
    }
}