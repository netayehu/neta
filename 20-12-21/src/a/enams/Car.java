package a.enams;

import java.util.Objects;

public class Car {
	
	private int number;
	private int spead;
	private colors color;
	private Type type;
	
	public enum Type{
		FAMILY,SPORT,MINI,SUV;
		
	}
	

	public Car(int number, int spead, colors color, Type type) {
		super();
		this.number = number;
		this.spead = spead;
		this.color = color;
		this.type = type;
	}

	public Car() {
		
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getSpead() {
		return spead;
	}

	public void setSpead(int spead) {
		this.spead = spead;
	}

	public colors getColor() {
		return color;
	}

	public void setColor(colors color) {
		this.color = color;
	}
	

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	
	@Override
	public String toString() {
		return "Car [number=" + number + ", spead=" + spead + ", color=" + color + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, number, spead, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return color == other.color && number == other.number && spead == other.spead && type == other.type;
	}
	
	

	


	
	
	
	
	

}
