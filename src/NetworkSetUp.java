/**
 * Created by murad on 17/07/16.
 *
 * TODO replace this class with an XML reader
 */
public class NetworkSetUp {

    public static void main(String[] args){

        //TODO group stations by their zone
        Station londonBridge = new Station("London Bridge", true,0);
        Station southwark = new Station("Southwark", false,1);
        Station waterloo = new Station("Waterloo", false,2);
        Station elephantAndCastle = new Station("Elephant & Castle", false,3);

        Line jubileeLine = new Line();
        jubileeLine.append(waterloo);
        jubileeLine.append(southwark);
        jubileeLine.append(londonBridge);

        Line northernLine = new Line();
        northernLine.append(londonBridge);
        northernLine.append(elephantAndCastle);

        /*TODO method which returns all stops/changes between source and destination
         * <source> 0---0---0---0---0
         *               \
         *                0---0---0 <destination>
         */

        System.out.println(jubileeLine.toString());
        System.out.println(northernLine.toString());
    }
}