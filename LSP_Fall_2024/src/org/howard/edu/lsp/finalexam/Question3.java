package org.howard.edu.lsp.finalexam;

import java.awt.Shape;


public class Question3 {
	public class ShapeRenderer {
	    public void renderShape(String shapeType) {
	        Shape shape = ShapeFactory.createShape(shapeType);
	        if (shape != null) {
	            ((Object) shape).draw();
	        } else {
	            System.out.println("Unknown shape type: " + shapeType);
	        }
	    }

	    public static void main(String[] args) {
	        ShapeRenderer renderer = new ShapeRenderer();

	        // Render different shapes
	        renderer.renderShape("circle");    // Output: Drawing a Circle
	        renderer.renderShape("rectangle"); // Output: Drawing a Rectangle
	        renderer.renderShape("triangle");  // Output: Drawing a Triangle
	        renderer.renderShape("hexagon");   // Output: Unknown shape type: hexagon
	    }
	}
}
