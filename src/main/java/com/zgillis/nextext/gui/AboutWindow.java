package com.zgillis.nextext.gui;

import javax.swing.*;
import java.awt.*;

public class AboutWindow extends JInternalFrame
{
    public static final int WINDOW_WIDTH = 275, WINDOW_HEIGHT = 150;

    // Components
    JLabel nexTextTitle;
    JLabel aboutText;

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
        nexTextTitle.setFont(new Font("Segoe UI", Font.BOLD, 18));
        add(nexTextTitle);
        nexTextTitle.setBounds(0,15, WINDOW_WIDTH, 20);

        aboutText = new JLabel("<html><center>A multi-file text editor written in Java.<br/>Copyright © 2018 Zachary Gillis</center></html>",
                SwingConstants.CENTER);
        add(aboutText);
        aboutText.setBounds(0, 50, WINDOW_WIDTH, 30);
    }
}
