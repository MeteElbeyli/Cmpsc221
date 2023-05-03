
import java.util.Scanner;

public class Maze {
    public static void main(String[] args) {

        Node currentNode = mazeSetUp();

        var input = new Scanner(System.in);
        char direction;
        while (currentNode.getRoomLetter() != 'L')
        {
            options(currentNode);
            direction = input.next().charAt(0);
            if(direction == 'N' && currentNode.getNorth() != null) {
                currentNode = currentNode.getNorth();
            }else if(direction == 'S' && currentNode.getSouth() != null) {
                currentNode = currentNode.getSouth();
            }else if(direction == 'E' && currentNode.getEast() != null) {
                currentNode = currentNode.getEast();
            }else if (direction == 'W' && currentNode.getWest() != null) {
                currentNode = currentNode.getWest();
            }
        }
        System.out.println("Congratulations! You have reached L!");

    }

    public static Node mazeSetUp()
    {
        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        Node d = new Node('D');
        Node e = new Node('E');
        Node f = new Node('F');
        Node g = new Node('G');
        Node h = new Node('H');
        Node i = new Node('I');
        Node j = new Node('J');
        Node k = new Node('K');
        Node l = new Node('L');

        a.setDirections(null, e, b, null);

        b.setDirections(null, f, null, a);

        c.setDirections(null, g, d, null);

        d.setDirections(null, null, null, c);

        e.setDirections(a, i, null, null);

        f.setDirections(b, null, g, null);

        g.setDirections(c, k, h, f);

        h.setDirections(null, l, null, g);

        i.setDirections(e, null, j, null);

        j.setDirections(null, null, null, i);

        k.setDirections(g, null, null,null);

        l.setDirections(h, null, null, null);

        return a;
// Had confusion with this because I had to look back and forth.
    }

    public static void options(Node currentNode) {
        String output = "";
        if(currentNode.getNorth() != null) {
            output += "North ";
        }
        if(currentNode.getSouth() != null) {
            if(!output.isEmpty()) {
                output += "Or ";
            }
            output += "Soutb ";
        }
        if(currentNode.getEast() != null) {
            if(!output.isEmpty()) {
                output += "Or ";
            }
            output += "East";
        }
        if(currentNode.getWest() != null)
        {
            if(!output.isEmpty()) {
                output += "or ";
            }
            output += "West";
        }
        System.out.println("You are in the room: " + currentNode.getRoomLetter() + " of a maze of twisty little passages, all alike. You can go " + output);
    }
}



