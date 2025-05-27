package GUI;

import javax.swing.*;

import MainSteuerung.lightR1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIMain extends JFrame {
	private lightR1 light;
	private JLabel statusLabel;

	public GUIMain() {
		light = new lightR1();
		initUI();
	}

	private void initUI() {

		setTitle("Steuerung Lampe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setLayout(new BorderLayout());

		statusLabel = new JLabel("Lights out", SwingConstants.CENTER);
		statusLabel.setFont(new Font("Arial", Font.BOLD, 16));
		add(statusLabel, BorderLayout.CENTER);

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());

		JButton onButton = new JButton("On");
		onButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				light.getOn();
				aktualisiereStatus();

			}
		});
		buttonPanel.add(onButton);

		JButton offButton = new JButton("Off");
		offButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				light.getOut();
				aktualisiereStatus();
			}
		});
		buttonPanel.add(offButton);
		add(buttonPanel, BorderLayout.SOUTH);

	}

	private void aktualisiereStatus() {
		if (light.isOn()) {
			statusLabel.setText("Light is on");
		} else {
			statusLabel.setText("Light is off");
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				GUIMain gui = new GUIMain();
				gui.setVisible(true);
			}
		});
	}
}
