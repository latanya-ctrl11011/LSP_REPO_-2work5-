package org.howard.edu.lsp.finalexam;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;

import java.awt.Shape;

import org.howard.edu.lsp.finalexam.Question3.ShapeRenderer;

public class Question3JUnit {
	public class ShapeRendererTest {

	    private ShapeRenderer renderer;

	    @Before
	    public void setup() {
	        renderer = new ShapeRenderer();
	    }

	    @Test
	    public void testCircleInstantiation() {
	        Shape circle = ShapeFactory.INSTANCE.createShape("circle");
	        assertNotNull(circle);
	        circle.draw(); // Should print "Drawing a Circle"
	    }

	    @Test
	    public void testRectangleInstantiation() {
	        Shape rectangle = ShapeFactory.INSTANCE.createShape("rectangle");
	        assertNotNull(rectangle);
	        rectangle.draw(); // Should print "Drawing a Rectangle"
	    }

	    @Test
	    public void testTriangleInstantiation() {
	        Shape triangle = ShapeFactory.INSTANCE.createShape("triangle");
	        assertNotNull(triangle);
	        triangle.draw(); // Should print "Drawing a Triangle"
	    }

	    @Test
	    public void testUnknownShapeInstantiation() {
	        Shape unknownShape = ShapeFactory.INSTANCE.createShape("hexagon");
	        assert(unknownShape == null); // Should be null
	    }

	    @Test
	    public void testRenderShape() {
	        renderer.renderShape("circle");    
	        renderer.renderShape("rectangle"); 
	        renderer.renderShape("triangle");
	        renderer.renderShape("hexagon");  
	    }
	}

}
