
public class Node {
    private char roomLetter;
    private Node North;
    private Node South;
    private Node East;
    private Node West;

    public Node(char roomLetter) {
        this.roomLetter = roomLetter;
    }

    public void setDirections(Node north, Node south, Node east, Node west) {
        this.North = north;
        this.South = south;
        this.East = east;
        this.West = west;
    }

    public char getRoomLetter() {
        return roomLetter;
    }

    public void setRoomLetter(char roomLetter) {
        this.roomLetter = roomLetter;
    }

    public Node getNorth() {
        return North;
    }

    public void setNorth(Node north) {
        this.North = north;
    }

    public Node getSouth() {
        return South;
    }

    public void setSouth(Node south) {
        this.South = south;
    }

    public Node getEast() {
        return East;
    }

    public void setEast(Node east) {
        this.East = east;
    }

    public Node getWest() {
        return West;
    }

    public void setWest(Node west) {
        this.West = west;
    }
}
