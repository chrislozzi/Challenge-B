package fr.fms.job;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import fr.fms.entities.Circle;
import fr.fms.entities.Point;
import fr.fms.entities.Shape;
import fr.fms.entities.Square;
import fr.fms.graphic.Graphic;

public class IJobImpl implements IJob {
	private Map<Integer, Shape> shapes;
	
	public IJobImpl() {
		shapes = new HashMap<>();
	}
	
	/**
	 * @return the shapes
	 */
	public Map<Integer, Shape> getShapes() {
		return shapes;
	}

	@Override
	public void addShape(int id, Shape shape) {
		shapes.put(id,  shape);
	}
	
	@Override
	public void deleteShape(int id) {
		shapes.remove(id);
	}
	
	@Override
	public Shape getShapeById(int id) {
		return shapes.get(id);
	}
	
	@Override
	public void moveShape(int id, int x, int y) {
		Shape shape = shapes.get(id);
		
		shape.getCenter().setX(x);
		shape.getCenter().setY(y);
	}
	
	
	@Override
	public void displayAll() {
		for(Shape s : shapes.values()) {
			System.out.println(s);
		}
	}

	@Override
	public void drawShape() {
		new Graphic(getShapes());
	}

}
