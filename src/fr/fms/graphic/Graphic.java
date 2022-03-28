/**
 * Programme permettant l'affichage de plusieurs formes gï¿½omï¿½triques
 * 
 * @author El babili - 2022
 * 
 */

package fr.fms.graphic;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;

import fr.fms.entities.Circle;
import fr.fms.entities.Shape;
import fr.fms.entities.Square;

public class Graphic extends JFrame {
	private static final long serialVersionUID = 1L;
	private Map<Integer, Shape> shapes = new HashMap<Integer, Shape>();

	public Graphic(Map<Integer, Shape> shapes) throws HeadlessException {
		super("Hello !");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setLocationRelativeTo(null);
		setVisible(true);
		this.shapes = shapes;
	}
	@Override
	public void paint(Graphics g) { // le repère x,y commence en haut ï¿½ gauche (0,0)
		super.paint(g);
		
		for (Shape s : shapes.values()) {
			if(s != null) {
				s.drawShape(g);
			}
		}
	}
}
