package com.mycompany.fa2;

/**
 *
 * @author sjanr
 */
public class FA2 {

  public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskManager().setVisible(true);
            }
        });
    }
}
