package robotExercite;

import javax.management.RuntimeErrorException;

public class Robot {
	
	private Direction direction;
	private Cardinal cardinal;
	
	
	public Robot(Direction direction, Cardinal cardinal) {
		this.direction = direction;
		this.cardinal = cardinal;
	}
	
	private void changingDirections(String arg) {
	    Direction d = this.direction;
	    switch (d) {
	        case NORTH:
	            if (arg.equals("R")) {
	                this.setDirection(Direction.EAST);
	            } else if (arg.equals("L")) {
	                this.setDirection(Direction.WEST);
	            } else {
	                throw new RuntimeException("Direction invalid");
	            }
	            break;
	        case SOUTH:
	            if (arg.equals("R")) {
	                this.setDirection(Direction.WEST);
	            } else if (arg.equals("L")) {
	                this.setDirection(Direction.EAST);
	            } else {
	                throw new RuntimeException("Direction invalid");
	            }
	            break;
	        case WEST:
	            if (arg.equals("R")) {
	                this.setDirection(Direction.NORTH);
	            } else if (arg.equals("L")) {
	                this.setDirection(Direction.SOUTH);
	            } else {
	                throw new RuntimeException("Direction invalid");
	            }
	            break;
	        case EAST:
	            if (arg.equals("R")) {
	                this.setDirection(Direction.SOUTH);
	            } else if (arg.equals("L") || arg.equals("l")) {
	                this.setDirection(Direction.NORTH);
	            } else {
	                throw new RuntimeException("Direction invalid");
	            }
	            break;
	    }
	}
	
	private void directionMoving() {
		Direction d = this.direction;
		switch (d) {
		case NORTH: {
			this.cardinal.setY(this.cardinal.getY() + 1);
			break;
		}case SOUTH:{
			this.cardinal.setY(this.cardinal.getY() - 1);
			break;
		}case WEST:{
			this.cardinal.setX(this.cardinal.getX() - 1);
			break;
		}case EAST:{
			this.cardinal.setX(this.cardinal.getX() + 1);
			break;
			
		}
		}
	}
	
	public Cardinal moving(String str) {
		String[] array = str.split("");
		for (String c : array) {
			
			switch (c) {
			case "A": {
				directionMoving();
				break;
			}case "R":{
				changingDirections(c);
				break;
			}case "L":{
				
				changingDirections(c);
				break;
			}
			
		   }
		
		}
		return cardinal;
		
	}
	
	public Direction getDirection() {
		return direction;
	}


	public void setDirection(Direction direction) {
		this.direction = direction;
	}


	public Cardinal getCardinal() {
		return cardinal;
	}


	public void setCardinal(Cardinal cardinal) {
		this.cardinal = cardinal;
	}



	
	
	
	
	
}
