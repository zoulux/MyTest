package com.zlx.calc;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Java Swing模仿Windows自带的计算器: 之复杂界面生成 界面层次this{ topPanel{ screen, editPanel{
 * editButton //...... } }, bottomPanel{ inputButton //...... } }
 * 
 * @author Zou LuXian
 * 
 */
public class calc extends JFrame implements ActionListener {
	final static String TAGS[] = "MC 7 8 9 / √ MR 4 5 6 * % MS 1 2 3 - 1/x M+ 0 +/- . + ="
			.split(" ");
	static JTextField screen;
	JButton inputButtons[];
	JButton editButtons[];

	String t = "";
	double A = 0;
	double B = 0;
	double C = 0;
	double M = 0;
	String op = "";

	public calc() {

		Font fnum = new Font("arial", Font.PLAIN, 17);// 设置字体及其大小
		Font fscreen = new Font("宋体", Font.PLAIN, 30);
		Font felse = new Font("arial", Font.PLAIN, 20);
		JPanel top = new JPanel();// 顶层面板
		JPanel edit = new JPanel();
		JPanel bottom = new JPanel();// 底层面板
		this.setLayout(new BorderLayout());
		top.setLayout(new BorderLayout());
		bottom.setLayout(new GridLayout(4, 6));

		screen = new JTextField(20);
		screen.setFont(fscreen);
		screen.setHorizontalAlignment(JTextField.RIGHT);// 设置文本右对齐
		screen.setText("0.");
		top.add(screen, BorderLayout.NORTH);

		edit.setLayout(new GridLayout(1, 4));
		editButtons = new JButton[4];
		editButtons[0] = new JButton("");
		editButtons[0].setEnabled(false);
		editButtons[1] = new JButton("<—");
		editButtons[2] = new JButton("CE");
		editButtons[3] = new JButton("C");
		editButtons[1].addActionListener(this);
		editButtons[2].addActionListener(this);
		editButtons[3].addActionListener(this);
		editButtons[1].setFont(fnum);
		editButtons[2].setFont(fnum);
		editButtons[3].setFont(fnum);

		for (int i = 0; i < editButtons.length; i++)
			edit.add(editButtons[i]);
		top.add(edit, BorderLayout.SOUTH);
		this.add(top, BorderLayout.NORTH);

		inputButtons = new JButton[4 * 6];
		for (int i = 0; i < inputButtons.length; i++) {
			bottom.add(inputButtons[i] = new JButton(TAGS[i]));
			inputButtons[i].setFont(fnum);
			inputButtons[i].addActionListener(this);
		}
		this.add(bottom, BorderLayout.CENTER);
		this.setResizable(false);// 禁用最大化按钮

		edit.setPreferredSize(new Dimension(100, 40));// 设置顶层面板宽度
		screen.setPreferredSize(new Dimension(100, 60));

		inputButtons[10].setFont(felse);// (按钮过小，重新设置)
		inputButtons[16].setFont(felse);
		inputButtons[21].setFont(felse);

		setSize(371, 450);
		setLocationRelativeTo(null);// 设置窗口居中
		setTitle("计算器");
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		 String s = e.getActionCommand();
		//Java7已经支持这种写法，只是编译器不支持
		 //可以用if，elseif代替
		switch (s) {
		case "+":
			op = "+";
			A = Double.parseDouble(screen.getText());
			xianshi(A);
			t = "";
			s = "";
			break;
		case "-":
			op = "-";
			A = Double.parseDouble(screen.getText());
			xianshi(A);
			t = "";
			s = "";
			break;
		case "*":
			op = "*";
			A = Double.parseDouble(screen.getText());
			xianshi(A);
			t = "";
			s = "";
			break;
		case "/":
			op = "/";
			A = Double.parseDouble(screen.getText());
			xianshi(A);
			t = "";
			s = "";
			break;
		case "√":
//			if (t.equals("")) {
//				s = "";
//				t = "";
//				break;
//			}
//			double temp1 = Double.parseDouble(t);
			double temp1 = Double.parseDouble(screen.getText());
			A = Math.sqrt(temp1);
			xianshi(A);
			t = A + "";
			s = "";
			break;
		case "%":
//			if (t.equals("")) {
//				s = "";
//				t = "";
//				break;
//			}
			double temp2 = Double.parseDouble(screen.getText());
			t = temp2 / 100 + "";
			xianshi(temp2 / 100);
			s = "";
			break;
		case "+/-":
			if (t.equals("")) {
				s = "";
				t = "";
				break;
			}
			double temp3 = Double.parseDouble(t);
			t = temp3 * (-1) + "";
			xianshi(temp3 * (-1));
			s = "";
			break;
		case ".":
			t = t + s;
			screen.setText(t);
			s = "";
			break;
		case "1/x":

			double temp4 = Double.parseDouble(screen.getText());
			t="";
			xianshi(1.0/temp4);
			s = "";
			break;
		case "<—":
			if (t.equals("")) {
				s = "";
				t = "";
				break;
			}
			t = t.substring(0, (t.length() - 1));
			screen.setText(t);
			s = "";
			break;
		case "CE":
			t = "";
			s = "";
			screen.setText("0.");
			break;
		case "C":
			t = "";
			s = "";
			screen.setText("0.");
			A = 0;
			B = 0;
			break;
		case "=":
			if (t.equals("")) {
				s = "";
				t = "";
				break;
			}
			B = Double.parseDouble(t);
			jisuan(A, B, op);
			s = "";
			t = "";
			break;
		// MS：存当前显示的数值
		// MR：读取存储器中的数值，并显示出来
		// MC：清除已存的数据
		// M+：用已存的数值加上当前显示的数值后，再将结果保存
		case "MS":
			M = Double.parseDouble(t);
			s = "";
			break;
		case "MR":
			xianshi(M);
			s = "";
			break;
		case "MC":
			M = 0;
			s = "";
			break;
		case "M+":
			M = Double.parseDouble(screen.getText()) + M;
			s = "";
			break;

		default:
			break;
		}

		if (!s.equals("")) {
			t = t + s;
			screen.setText(t);
		}
	}

	private void jisuan(double a, double b, String op) {
		if (op.equals("+")) {
			C = a + b;
			xianshi(C);
		} else if (op.equals("-")) {
			C = a - b;
			xianshi(C);
		} else if (op.equals("*")) {
			C = a * b;
			xianshi(C);
		} else if (op.equals("/")) {
			C = a / b;
			xianshi(C);
		}

	}

	private static void xianshi(double c) {
		String temps = c + "";
		if (temps.endsWith(".0"))
			screen.setText(temps.replace(".0", ""));
		else
			screen.setText(temps);
	}

	public static void main(String[] args) {
		new calc();
	}
}
