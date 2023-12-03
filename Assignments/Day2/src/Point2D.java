
class Point2D{
	private int x;
	private int y;
	
	public Point2D(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String show(){
		return "x= " + this.x + ", y= " + this.y;
	}
	
	public boolean isEqual(Point2D point2){
		if (this.x != point2.x){return false;}
		if (this.y != point2.y){return false;}
		return true;
	}
	
	public double calculateDistance(Point2D point2){
		return Math.sqrt( Math.pow((this.x - point2.x),2) + Math.pow((this.y - point2.y),2) );
	}
	
}