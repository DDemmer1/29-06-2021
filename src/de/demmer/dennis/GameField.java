package de.demmer.dennis;

import java.awt.Dimension;

import javax.swing.JFrame;

public class GameField extends JFrame{

	public GameField() {
		setVisible(true);
		setSize(new Dimension(200, 200));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addKeyListener(new Controls());
	}
}
