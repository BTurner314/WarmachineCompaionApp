package models;

public class Unit {

	private Leader leader;
	private Grunt grunt;
	private int minUnitSize;
	private int maxUnitSize;
	private int minPointCost;
	private int MaxPointCost;
	
	public Unit(Leader leader, Grunt grunt, int minSize, int maxSize, int minCost, int maxCost ) {
		this.leader = leader;
		this.grunt = grunt;
		this.minUnitSize = minSize;
		this.maxUnitSize = maxSize;
		this.minPointCost = minCost;
		this.MaxPointCost = maxCost;
	}
}
