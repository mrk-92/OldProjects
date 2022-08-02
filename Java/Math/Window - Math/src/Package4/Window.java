package Package4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.RootPaneContainer;
import javax.swing.SwingUtilities;

public class Window {
	int n = 10;
	JFrame jfrm = new JFrame("Математика");
	JLabel jlbl1 = new JLabel();
	JLabel jlbl2 = new JLabel();
	JButton butt1 = new JButton();
	JButton butt2 = new JButton();
	JButton butt3 = new JButton();
	JButton butt4 = new JButton();
	JButton buttZ = new JButton();
	JTextField text1 = new JTextField();
	JTextField text2 = new JTextField();
	JTextField text3 = new JTextField();
	JTextArea text4 = new JTextArea();
	JScrollPane scrl = new JScrollPane(text4);
	JLabel jlbl3 = new JLabel();
	JComboBox jcbox1 = new JComboBox();
	JLabel jlbl4 = new JLabel();
	JComboBox jcbox2 = new JComboBox();
	
	/**
	 * Программа вычисляет результат.
	 */
	public void progArifmetic() {
		jlbl1.setBounds(50, 0, 50, 30);
		jlbl2.setBounds(150, 0, 50, 30);
		text1.setBounds(5, 5, 50, 30);
		text2.setBounds(105, 5, 50, 30);
		text3.setBounds(205, 5, 50, 30);
		
		jlbl1.setHorizontalAlignment(JLabel.CENTER);
		jlbl2.setHorizontalAlignment(JLabel.CENTER);
		text1.setHorizontalAlignment(JLabel.CENTER);
		text2.setHorizontalAlignment(JLabel.CENTER);
		text3.setHorizontalAlignment(JLabel.CENTER);
		
		text1.setText("0");
		text2.setText("0");
		text3.setText("0");
		jlbl1.setText("+");
		jlbl2.setText("=");
		butt1.setText("он");
		butt2.setText("+/-");
		butt3.setText("он");
		butt4.setText("=");
		buttZ.setText("Нові числа");
		
		text4.setLineWrap(true);
		text4.setWrapStyleWord(true);
		
		scrl.setBounds(5, 100, 250, 150);
		scrl.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		jfrm.add(text1);
		jfrm.add(text2);
		jfrm.add(text3);
		jfrm.add(jlbl1);
		jfrm.add(jlbl2);
		jfrm.add(butt1);
		jfrm.add(butt2);
		jfrm.add(butt3);
		jfrm.add(butt4);
		jfrm.add(buttZ);
		jfrm.add(scrl);
		
		jfrm.setLayout(null);
		jfrm.setBounds(5, 5, 265, 300);
		jfrm.setResizable(false);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setVisible(true);
		
//actions		
		butt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1.setText(Integer.toString((int) (Math.random() * n)));
				if (jlbl1.getText() == "+") {
					text3.setText(Integer.toString(Integer
					.parseInt(text1.getText())
					 + Integer.parseInt(text2.getText())));
				Proverka();
				} else {text3.setText(Integer.toString(Integer
						.parseInt(text1.getText())
						 - Integer.parseInt(text2.getText())));
				Proverka();
				}
			}
		});
		butt1.setBounds(5, 35, 50, 30);
	
		butt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jlbl1.getText() == "+") {
					jlbl1.setText("-");	
				} else jlbl1.setText("+");
				if (jlbl1.getText() == "+") {
					text3.setText(Integer.toString(Integer
					.parseInt(text1.getText())
					 + Integer.parseInt(text2.getText())));
				Proverka();
				} else {text3.setText(Integer.toString(Integer
						.parseInt(text1.getText())
						 - Integer.parseInt(text2.getText())));
				Proverka();
				}
			}
		});
		butt2.setBounds(55, 35, 50, 30);

		butt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text2.setText(Integer.toString((int) (Math.random() * n)));
				if (jlbl1.getText() == "+") {
					text3.setText(Integer.toString(Integer
					.parseInt(text1.getText())
					 + Integer.parseInt(text2.getText())));
				Proverka();
				} else {text3.setText(Integer.toString(Integer
						.parseInt(text1.getText())
						 - Integer.parseInt(text2.getText())));
				Proverka();
				}
			}
		});
		butt3.setBounds(105, 35, 50, 30);

		butt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jlbl1.getText() == "+") {
					text3.setText(Integer.toString(Integer
					.parseInt(text1.getText())
					 + Integer.parseInt(text2.getText())));
				Proverka();
				} else {text3.setText(Integer.toString(Integer
						.parseInt(text1.getText())
						 - Integer.parseInt(text2.getText())));
				Proverka();
				}
			}
		});
		butt4.setBounds(205, 35, 50, 30);
		
		buttZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1.setText(Integer.toString((int) (Math.random() * n)));
				text2.setText(Integer.toString((int) (Math.random() * n)));
				if (jlbl1.getText() == "+") {
					text3.setText(Integer.toString(Integer
					.parseInt(text1.getText())
					 + Integer.parseInt(text2.getText())));
				Proverka();
				} else {text3.setText(Integer.toString(Integer
						.parseInt(text1.getText())
						 - Integer.parseInt(text2.getText())));
				Proverka();
				}
			}
		});
		buttZ.setBounds(5, 65, 250, 30);
	}// progArifmetic

	/**
	 * Пользователь вычисляет результат.
	 */
	public void Arifmetic() {
		jlbl1.setBounds(50, 0, 50, 30);
		jlbl2.setBounds(150, 0, 50, 30);
		text1.setBounds(5, 5, 50, 30);
		text2.setBounds(105, 5, 50, 30);
		text3.setBounds(205, 5, 50, 30);
		jlbl3.setBounds(5, 220, 90, 20);
		jcbox1.setBounds(100, 220, 60, 20);
		jlbl4.setBounds(5, 245, 80, 20);
		jcbox2.setBounds(100, 245, 60, 20);
		
		jcbox1.addItem("10");
		jcbox1.addItem("100");
		jcbox1.addItem("1000");
		jcbox2.addItem("ні");
		jcbox2.addItem("00:10");
		jcbox2.addItem("00:15");
		
		jlbl1.setHorizontalAlignment(JLabel.CENTER);
		jlbl2.setHorizontalAlignment(JLabel.CENTER);
		text1.setHorizontalAlignment(JLabel.CENTER);
		text2.setHorizontalAlignment(JLabel.CENTER);
		text3.setHorizontalAlignment(JLabel.CENTER);
		
		text1.setText("0");
		text2.setText("0");
		text3.setText("0");
		jlbl1.setText("+");
		jlbl2.setText("=");
		butt1.setText("он");
		butt2.setText("+/-");
		butt3.setText("он");
		butt4.setText("Перевірка");
		buttZ.setText("Нові числа");
		jlbl3.setText("Числа від 0 до:");
		jlbl4.setText("На швидкість:");

		text4.setLineWrap(true);
		text4.setWrapStyleWord(true);
		
		scrl.setBounds(5, 100, 250, 115);
		scrl.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		jfrm.add(text1);
		jfrm.add(text2);
		jfrm.add(text3);
		jfrm.add(jlbl1);
		jfrm.add(jlbl2);
		jfrm.add(butt1);
		jfrm.add(butt2);
		jfrm.add(butt3);
		jfrm.add(butt4);
		jfrm.add(buttZ);
		jfrm.add(scrl);
		jfrm.add(jlbl3);
		jfrm.add(jcbox1);
		jfrm.add(jlbl4);
		jfrm.add(jcbox2);
		
		jfrm.setLayout(null);
		jfrm.setBounds(5, 5, 265, 400);
		jfrm.setResizable(false);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setVisible(true);
		
//actions		
		butt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n = Integer.parseInt((String) (jcbox1.getSelectedItem()));
				text1.setText(Integer.toString((int) (Math.random() * n)));
			}
		});
		butt1.setBounds(5, 35, 50, 30);
	
		butt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jlbl1.getText() == "+") {
					jlbl1.setText("-");	
				} else jlbl1.setText("+");
			}
		});
		butt2.setBounds(55, 35, 50, 30);

		butt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n = Integer.parseInt((String) (jcbox1.getSelectedItem()));
				text2.setText(Integer.toString((int) (Math.random() * n)));
			}
		});
		butt3.setBounds(105, 35, 50, 30);

		butt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Proverka();
			}
		});
		butt4.setBounds(155, 65, 100, 30);
		
		buttZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n = Integer.parseInt((String) (jcbox1.getSelectedItem()));
				text1.setText(Integer.toString((int) (Math.random() * n)));
				text2.setText(Integer.toString((int) (Math.random() * n)));
			}
		});
		buttZ.setBounds(5, 65, 150, 30);
	}// Arifmetic

	/**
	 * Проверка результата.
	 */
	public void Proverka() {
		try {
			if (jlbl1.getText() == "+") {
				if ((Integer.parseInt(text1.getText())+Integer.parseInt(text2.getText())) == Integer.parseInt(text3.getText())) {
					text4.append(text1.getText() + " " + jlbl1.getText() + " " + text2.getText() + " " + jlbl2.getText() + " " + text3.getText() + "\n");
					text4.append("Відповідь правильна!\n");
				} else {
					text4.append(text1.getText() + " " + jlbl1.getText() + " " + text2.getText() + " " + jlbl2.getText() + " " + text3.getText() + "\n");
					text4.append("Відповідь неправильна!\n");
				}
			} else {
				if ((Integer.parseInt(text1.getText())-Integer.parseInt(text2.getText())) == Integer.parseInt(text3.getText())) {
					text4.append(text1.getText() + " " + jlbl1.getText() + " " + text2.getText() + " " + jlbl2.getText() + " " + text3.getText() + "\n");
					text4.append("Відповідь правильна!\n");
				} else {
					text4.append(text1.getText() + " " + jlbl1.getText() + " " + text2.getText() + " " + jlbl2.getText() + " " + text3.getText() + "\n");
					text4.append("Відповідь неправильна!\n");
				}
			}
		} catch (NumberFormatException e) {
			text4.append("Потрібно вірно заповнити всі клітинки!\n");
		}
	}// Proverka
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Window MyWindow1 = new Window();
//				MyWindow1.progArifmetic();
				MyWindow1.Arifmetic();
				
			}
		});
	}
}