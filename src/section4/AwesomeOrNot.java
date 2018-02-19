package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {
public static void main(String[] args) {
	Random number=new Random();
	int x=number.nextInt(100);
	System.out.println(x);

	// 1. Make a main method that includes all the steps below…

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable

	// 4. Get the user to enter something that they think is awesome
JOptionPane.showInputDialog("Enter a number you think is awesome");
	// 5. If the random number is 0
if(x==0) {
	JOptionPane.showMessageDialog(null,"Thats Awesome");
}
	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1
if(x==1) {
	JOptionPane.showMessageDialog(null,"Thats ok" );
}

	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2
if(x==2){
	JOptionPane.showMessageDialog(null, "Thats Boring");
}
	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3
if(x==3){
	JOptionPane.showMessageDialog(null, "Write your own Anwer");
}

	// -- write your own answer
}
}


