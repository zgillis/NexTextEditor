package com.zgillis.nextext.gui;

import com.zgillis.nextext.NexText;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.datatransfer.*;
import java.awt.Toolkit;

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

    // Component Definition
    JDesktopPane desktopPane;
    AboutWindow aboutWindow;

    public MainWindow()
    {
        setTitle(WINDOW_TITLE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLayout(null);
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
    }

    private void initComponents()
    {
        initMenu();
        desktopPane = new JDesktopPane();
        setContentPane(desktopPane);
        renderNewAboutWindow();
    }

    private void initMenu()
    {
        menuBar = new JMenuBar();

        // FILE MENU
        fileMenu = new JMenu("File");
        exitMi = new JMenuItem("Exit");
        fileMenu.add(exitMi);
        menuBar.add(fileMenu);

        exitMi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

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

        copyMi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //TODO: implement copying text IN editor.
                String dummyStr = "This is a copy dummy string. Eventually I will be replaced by textbox selection";
                StringSelection stringSelection = new StringSelection(dummyStr);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringSelection, null);
            }
        });

        // HELP MENU
        helpMenu = new JMenu("Help");
        aboutMi = new JMenuItem("About NexText Editor");
        helpMi = new JMenuItem("Help");
        helpMenu.add(aboutMi);
        helpMenu.add(helpMi);
        menuBar.add(helpMenu);

        aboutMi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                renderNewAboutWindow();
            }
        });

        setJMenuBar(menuBar);
    }

    private void renderNewAboutWindow()
    {
        aboutWindow = new AboutWindow();
        desktopPane.add(aboutWindow);
        aboutWindow.setBounds(getWidth()/2 - aboutWindow.WINDOW_WIDTH/2,
                getHeight()/2 - aboutWindow.WINDOW_HEIGHT,aboutWindow.WINDOW_WIDTH,aboutWindow.WINDOW_HEIGHT);
    }
}
