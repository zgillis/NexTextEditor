package com.zgillis.nextext.gui;

import com.zgillis.nextext.NexText;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame
{
    // Window Constants
    private static final String WINDOW_TITLE = "NexText Editor - v" + NexText.APP_VERSION;
    private static final int WINDOW_WIDTH = 800, WINDOW_HEIGHT = 600;

    // Menu Definition
    JMenuBar menuBar;
    JMenu fileMenu, editMenu, helpMenu;

    JMenuItem exitMi;
    JMenuItem cutMi, copyMi, pasteMi, selAllMi;
    JMenuItem aboutMi, helpMi;

    public MainWindow()
    {
        setTitle(WINDOW_TITLE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        initComponents();
    }

    private void initComponents()
    {
        menuBar = new JMenuBar();

        // FILE MENU
        fileMenu = new JMenu("File");
        exitMi = new JMenuItem("Exit");
        fileMenu.add(exitMi);
        menuBar.add(fileMenu);

        // EDIT MENU
        editMenu = new JMenu("Edit");
        cutMi = new JMenuItem("Cut");
        copyMi = new JMenuItem("Copy");
        pasteMi = new JMenuItem("Paste");
        selAllMi = new JMenuItem("Select All");
        editMenu.add(cutMi);
        editMenu.add(copyMi);
        editMenu.add(pasteMi);
        editMenu.add(selAllMi);
        menuBar.add(editMenu);

        // HELP MENU
        helpMenu = new JMenu("Help");
        aboutMi = new JMenuItem("About NexText Editor");
        helpMi = new JMenuItem("Help");
        helpMenu.add(aboutMi);
        helpMenu.add(helpMi);
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);
    }
}
