package cn.jackie.algorithm.graph;

public class Vertex {
	public char label;
	public boolean wasVisited;
	
	public Vertex(char lab) {
		label = lab;
		wasVisited = false;
	}
}
