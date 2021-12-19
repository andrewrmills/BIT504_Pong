import java.awt.Color;
import java.awt.Rectangle;
public class Sprite {
	
	private int xPosition;
	private int yPosition;
	private int xVelocity;
	private int yVelocity;
	private int width;
	private int height;
	private Color color;
	private int initialxPosition;
	private int initialyPosition;
	
	public void setInitialPosition(int initialX, int initialY) {
		initialxPosition = initialX;
		initialyPosition = initialY;
	}
	//Unsure about second variable
	public void resetToInitialPosition() {
		setxPosition(initialxPosition);
		setyPosition(initialyPosition);
	}
	
	public int getxPosition() {
		return xPosition;
	}
	
	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}
	
	 public void setxPosition(int newX, int panelWidth) {
	     xPosition = newX;
	       if(xPosition < 0) {
	           xPosition = 0;
	       } else if(xPosition + width > panelWidth) {
	           xPosition = panelWidth - width;
	       }
	}
	 
	public int getyPosition() {
		return yPosition;
	}
	
	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}
	
	 public void setyPosition(int newY, int panelHeight) {
	     yPosition = newY;
	      if(yPosition < 0) {
	          yPosition = 0;
	      } else if(yPosition + height > panelHeight) {
	          yPosition = panelHeight - height;
	      }
	 }
	
	public int getxVelocity() {
		return xVelocity;
	}
	
	public void setxVelocity(int xVelocity) {
		this.xVelocity = xVelocity;
	}
	
	public int getyVelocity() {
		return yVelocity;
	}
	
	public void setyVelocity(int yVelocity) {
		this.yVelocity = yVelocity;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth (int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	 public Rectangle getRectangle() {
         return new Rectangle(getxPosition(), getyPosition(), getWidth(), getHeight());
     }
}
