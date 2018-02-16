package section3;

import javax.swing.JOptionPane;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		JOptionPane.showMessageDialog(null,"Shreya is awesome");
		String name=JOptionPane.showInputDialog("I am the best");
		System.out.println(name);
	}
}

;