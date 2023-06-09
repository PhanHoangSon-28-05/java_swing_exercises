package Vui;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class NewClass extends JPanel
{
    public NewClass()
    {
        setLayout( new BorderLayout() );

        JTable table = new JTable(5, 5);
        table.setOpaque( false );
        DefaultTableCellRenderer renderer =
            (DefaultTableCellRenderer)table.getDefaultRenderer(Object.class);
        renderer.setOpaque(false);


        final ImageIcon icon = new ImageIcon("S:\\Icon\\CCC.jpg");

        JPanel background = new JPanel( new BorderLayout() )
        {
            @Override
            protected void paintComponent(Graphics g)
            {
                super.paintComponent(g);

                g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
//        background.add( scrollPane );
        add(background);
    }

    private static void createAndShowGUI()
    {
        JPanel panel = new JPanel();

        JFrame frame = new JFrame("SSCCE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new NewClass());
        frame.setLocationByPlatform( true );
        frame.pack();
        frame.setVisible( true );
    }

    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                createAndShowGUI();
            }
        });
    }
}
