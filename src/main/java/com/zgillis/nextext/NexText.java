package com.zgillis.nextext;

import com.zgillis.nextext.gui.MainWindow;

import javax.swing.*;

public class NexText
{
    public static final String APP_VERSION = "0.1";

    public static void main(String[] args)
    {
        System.out.println(String.format("NexText Editor - Version %s", APP_VERSION));

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        MainWindow mainWindow = new MainWindow();
        mainWindow.setVisible(true);
    }
}
