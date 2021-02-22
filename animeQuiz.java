package AnimeQuiz;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Graphics;
public class animeQuiz implements ActionListener{
	private static int count = 0;
	private static JButton button;
	private static JLabel name;
	private static JLabel date;
	private static JTextField nameText;
	private static JTextField dateText;
	private static JLabel questionOne;
	private static JPasswordField QOneText;
	private static JLabel questionTwo;
	private static JPasswordField QTwoText;
	private static JLabel questionThree;
	private static JPasswordField QThreeText;
	private static JLabel questionFour;
	private static JPasswordField QFourText;
	private static JLabel questionFive;
	private static JPasswordField QFiveText;
	private static JLabel success;
	private static JLabel explanation;
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setSize(1000,1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setBackground(Color.red);
		
		panel.setLayout(null);
		panel.setBounds(70,80,100,100);
		
		name = new JLabel("Name: ");
		name.setBounds(10,20,80,25);
		panel.add(name);
		
		nameText = new JTextField(20);
		nameText.setBounds(100,20,165,25);
		panel.add(nameText);
		
		date = new JLabel("Date: ");
		date.setBounds(10,50,80,25);
		panel.add(date);
				
		dateText = new JTextField(20);
		dateText.setBounds(100,50,165,25);
		panel.add(dateText);
		
		explanation = new JLabel("Hello!, I'm Cameron, the creator of this quiz. " + 
		" in the boxes, type in the main character for each anime!");
		explanation.setBounds(5, 300, 600, 25);
		panel.add(explanation);
		
		questionOne = new JLabel("DBZ:");
		questionOne.setBounds(10, 80, 80, 25);
		panel.add(questionOne);
		
		QOneText = new JPasswordField();
		QOneText.setBounds(100,80,80,25);
		panel.add(QOneText);
		
		questionTwo = new JLabel("Berserk:");
		questionTwo.setBounds(10, 110, 80, 25);
		panel.add(questionTwo);
		
		QTwoText = new JPasswordField();
		QTwoText.setBounds(100, 110, 80, 25);
		panel.add(QTwoText);
		
		questionThree = new JLabel("HXH:");
		questionThree.setBounds(10, 140, 80, 25);
		panel.add(questionThree);
		
		QThreeText = new JPasswordField();
		QThreeText.setBounds(100, 140, 80, 25);
		panel.add(QThreeText);
		
		
		questionFour = new JLabel("Naruto");
		questionFour.setBounds(10, 170, 80, 25);
		panel.add(questionFour);
		
		QFourText = new JPasswordField();
		QFourText.setBounds(100, 170, 80, 25);
		panel.add(QFourText);
		
		questionFive = new JLabel("One Piece");
		questionFive.setBounds(10, 200, 80, 25);
		panel.add(questionFive);
		
		QFiveText = new JPasswordField();
		QFiveText.setBounds(100, 200, 80, 25);
		panel.add(QFiveText);
		
		button = new JButton("Submit");
		button.setBounds(10, 230, 80, 25);
		button.addActionListener(new animeQuiz());
		panel.add(button);
		
		success = new JLabel(" ");
		success.setBounds(100, 230, 300, 25);
		panel.add(success);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String one = QOneText.getText();
		String two = QTwoText.getText();
		String three = QThreeText.getText();
		String four = QFourText.getText();
		String five = QFiveText.getText();
		ArrayList<String> list = new ArrayList<String>();
		if(one.equalsIgnoreCase("Goku")) {
			count++;
		}else {
			list.add("Goku");
		}
		if(two.equalsIgnoreCase("Guts")) {
			count++;
		}else {
			list.add("Guts");
		}
		if(three.equalsIgnoreCase("Gon")) {
			count++;
		}else {
			list.add("Gon");
		}
		if(four.equalsIgnoreCase("Naruto")) {
			count++;
		}else {
			list.add("Naruto");
		}
		if(five.equalsIgnoreCase("Luffy")) {
			count++;
		}else {
			list.add("Luffy");
		}
		switch(count) {
		case 1: 
			success.setText("Wrong! " + list.toString());
			break;
		case 2:
			success.setText("Decent! " + list.toString());
			break;
		case 3:
			success.setText("OK! " + list.toString());
			break;
		case 4:
			success.setText("Pretty Good!" + list.toString());
			break;
		case 5: 
			success.setText("Perfecto!!!");
			break;
		default:
			success.setText("Try harder! " + list.toString());
		}
	}
}
