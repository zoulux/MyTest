package com.zlx.test2;

import java.awt.Container;
import java.awt.ImageCapabilities;
import java.awt.Window;
import java.security.cert.Extension;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class SwingAndThread extends JFrame {
	private static final long UID = Integer.MAX_VALUE;
	private JLabel jl = new JLabel();
	private static Thread t;
	private int count = 0;
	private Container container = getContentPane();

	public SwingAndThread() {
		setBounds(300, 200, 250, 100);
		container.setLayout(null);
		Icon icon=new ImageIcon("src/test/logo.png");
		jl.setIcon(icon);
		jl.setHorizontalAlignment(SwingConstants.LEFT);
		jl.setBounds(10, 10, 200, 50);
		jl.setOpaque(true);
		t = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (count <= 200) {
					jl.setBounds(count, 10, 200, 50);
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					count += 4;
					if (count == 200) {
						count = 10;
					}

				}
			}
		});
		t.start();
		container.add(jl);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

	}
	public static void main(String[] args) {
		new SwingAndThread();
	}
}
