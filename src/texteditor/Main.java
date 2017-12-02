
package texteditor;

import javax.swing.JFrame;

class Main {
    public static void main(String args[]){

        TextEditor design = new TextEditor();
        design.setTitle("TextEditor");
        design.setVisible(true);
        design.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        design.setBounds(100,100,0,0);
        design.setSize(800,600);
    }
}
