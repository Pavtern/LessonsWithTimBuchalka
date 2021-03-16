package Window;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {

    public MyWindow(String title) throws HeadlessException {
        super(title);
        setSize(500,140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font timesNewRomanSmall = new Font("Times new roman", Font.BOLD, 12);
        Font timesNewRomanLarge = new Font("Times new roman", Font.BOLD, 18);
        g.setFont(timesNewRomanLarge);
        g.drawString("00010 это двоичный код", 60, 60);
        g.setFont(timesNewRomanSmall);
        g.drawString("Тимурка", 60, 100);

    }
}
