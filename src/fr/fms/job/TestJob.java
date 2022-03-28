
package fr.fms.job;

import java.awt.Graphics;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import fr.fms.entities.Circle;
import fr.fms.entities.Point;
import fr.fms.entities.Shape;
import fr.fms.entities.Square;
import fr.fms.graphic.Graphic;

public class TestJob {

	
	public static void main(String[] args) {
		
		IJobImpl job = new IJobImpl();
		job.addShape(1,new Circle(20,30,50));
		job.addShape(2,new Circle(15,new Point(100,150)));
		job.addShape(3,new Square(50,200,220));
		job.addShape(4,new Square(65,200,50));
		job.addShape(5,new Circle(30, 300, 300));
		job.displayAll();
		System.out.println("---------------------------------");
		job.drawShape();
		
	}

}
