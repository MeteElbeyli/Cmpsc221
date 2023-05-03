import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Sierpinski extends JFrame implements ActionListener {

    private JPanel drawPanel;
    private JTextField textField;
    private int n = 1;


    public Sierpinski()
    {
        setLayout(new BorderLayout());
        drawPanel = new JPanel();
        drawPanel.setPreferredSize(new Dimension(500, 400));
        add(drawPanel, BorderLayout.CENTER);
        JPanel textPanel = new JPanel();
        textPanel.add(new JLabel("Enter an Order: "));
// If you pick a big number  it will either crash or take a long time to run, be careful!!!!!
        textField = new JTextField(10);

        textField.addActionListener(this);

        textPanel.add(textField);

        add(textPanel, BorderLayout.PAGE_END);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        pack();
        setVisible(true);

    }

    @Override

    public void paint(Graphics g) {

        super.paint(g);


        Graphics graphics = drawPanel.getGraphics();

        graphics.setColor(Color.GREEN);
// I would love to know how to make it look like the legend of zelda TRIFORCE with colors but idk side project


        Point p1 = new Point(drawPanel.getWidth() / 2, 0);
        Point p2 = new Point(0, drawPanel.getHeight());
        Point p3 = new Point(drawPanel.getWidth(), drawPanel.getHeight());
        drawSierpinski(p1, p2, p3, graphics, n);

    }



    public static void main(String[] args)
    {

        new Sierpinski();

    }


    public static void drawTriangle(Point p1, Point p2, Point p3, Graphics g)
    {


        Polygon p = new Polygon();

        p.addPoint(p1.x, p1.y);

        p.addPoint(p2.x, p2.y);

        p.addPoint(p3.x, p3.y);

        g.fillPolygon(p);
// was the confusing part, had to go to tutoring
        //Basically it's just the position and I had to understand how it actually works
    }


    public static void drawSierpinski(Point p1, Point p2, Point p3, Graphics g, int n)
    {

        if (n <= 0)
        {
            return;

        } // nothing happens 

        if (n == 1)
        {
            drawTriangle(p1, p2, p3, g);

        }
        else
        {



            Point p4 = new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);

            Point p5 = new Point((p2.x + p3.x) / 2, (p2.y + p3.y) / 2);

            Point p6 = new Point((p1.x + p3.x) / 2, (p1.y + p3.y) / 2);



            drawSierpinski(p1, p4, p6, g, n - 1);

            drawSierpinski(p4, p2, p5, g, n - 1);

            drawSierpinski(p6, p5, p3, g, n - 1);

        }

    }

    @Override

    public void actionPerformed(ActionEvent e) {

        n = Integer.parseInt(textField.getText());

        repaint();

    }

}
