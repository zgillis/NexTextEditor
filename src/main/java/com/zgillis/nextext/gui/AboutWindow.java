package com.zgillis.nextext.gui;

import javax.swing.*;
import java.awt.*;

public class AboutWindow extends JInternalFrame
{
    public static final int WINDOW_WIDTH = 400, WINDOW_HEIGHT = 225;

    // Components
    JLabel nexTextTitle;

    public AboutWindow()
    {
        super("About NexText", false, true, false, true);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLayout(null);
        initComponents();
        setVisible(true);
    }

    private void initComponents()
    {
        nexTextTitle = new JLabel("NexText Editor", SwingConstants.CENTER);
        nexTextTitle.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        add(nexTextTitle);
        nexTextTitle.setBounds(0,15, WINDOW_WIDTH, 50);
    }
}
