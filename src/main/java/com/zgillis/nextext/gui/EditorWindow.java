package com.zgillis.nextext.gui;

import javax.swing.*;
import java.awt.*;

public class EditorWindow extends JInternalFrame
{
    public static final int WINDOW_WIDTH = 640, WINDOW_HEIGHT = 480;

    // Components
    JScrollPane editScrollPane;
    JTextArea editText;

    public EditorWindow()
    {
        super("Editor", true, true, true, true);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        initComponents();
        setVisible(true);
    }

    private void initComponents()
    {
        editText = new JTextArea();
        editText.setFont(new Font("Courier New", Font.PLAIN, 14));
        editScrollPane = new JScrollPane(editText, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(editScrollPane);
    }
}
