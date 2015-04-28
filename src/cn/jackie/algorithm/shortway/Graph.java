package cn.jackie.algorithm.shortway;

public class Graph {
	private final int MAX_VERTS = 20;
	private final int INFINITY = 1000000;
	private Vertex vertexList[]; //list of vertices
	private int adjMat[][]; //adjacency matrix
	private int nVerts;   //current number of vertices
	private int nTree;	//number of verts in tree
	private DistPar sPath[];  //array for shortest-path data
	private int currentVert;  //current vertex
	private int startToCurrent;  //distance to currentVert
	
	
	// ------------------------------------------------
	public Graph() {
		vertexList = new Vertex[MAX_VERTS];
		
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		nVerts = 0;
		nTree = 0;
		for(int j=0;j<MAX_VERTS;j++)
			for(int k=0;k<MAX_VERTS;k++)
				adjMat[j][k] = INFINITY;
		sPath = new DistPar[MAX_VERTS];
	}
	
	public void addVertex(char lab) {
		vertexList[nVerts++] = new Vertex(lab);
	}
	
	public void addEdge(int start, int end, int weight) {
		adjMat[start][end] = weight;
	}
	
	public void path() {  //find all shortest paths
		int startTree = 0;  //start at vertex 0
		vertexList[startTree].isInTree = true;
		nTree = 1;        //put it in tree
		
		//  transfer row of distances from adjMat to sPath
		for(int j=0;j<nVerts;j++) {
			int tempDist = adjMat[startTree][j];
			sPath[j] = new DistPar(startTree, tempDist);
		}

		// until all vertices are in the tree
		while(nTree < nVerts) {
			int indexMin = getMin();      //get minimum from sPath
			int minDist = sPath[indexMin].distance;
			
			
			if(minDist == INFINITY){
				System.out.println("There are unreachable vertices");
				break;
			}
			else{				//reset currentVert
				currentVert = indexMin;		//to closest vert
				startToCurrent = sPath[indexMin].distance;
				//	minimum distance from startTree is
				// 	to currentVert, and is startToCurrent
			}
			// put current vertex in tree
			vertexList[currentVert].isInTree = true;
			nTree++;
			adjust_sPath();			//update sPath[] array
		} //end while(nTree<nVerts)
		
		displayPaths();				//display sPath[] contents
		
		nTree = 0;
		for(int j=0;j<nVerts;j++)
			vertexList[j].isInTree = false;
	}	//end path()
	
	//-------------------------------------------------------
	
	public int getMin() {			//get entry from sPath
		int minDist = INFINITY;		//	with minimum distance
		int indexMin = 0;			//assume minimum
		for(int j=1;j<nVerts;j++){		//for each vertex,
										//if it's in tree and
			if(!vertexList[j].isInTree && 	//smaller than old one
					sPath[j].distance < minDist)
			{
				minDist = sPath[j].distance;
				indexMin = j;		//update minimum
			}
		}	// end for
		return indexMin;		// return index of minimum
	}	//end getMin()
	
	public void adjust_sPath() {
		//adjust values in shortest-path array sPath
		int column = 1;
		while(column < nVerts) {
			//if this column's vertex already in tree, skip it
			if(vertexList[column].isInTree){
				column++;
				continue;
			}
			// calculate distance for one sPath entry
				//get edge from currentVert to column
			int currentToFringe = adjMat[currentVert][column];
				//add distance from start
			int	startToFringe = startToCurrent + currentToFringe;
				//get distance of current sPath entry
			int sPathDist = sPath[column].distance;
			
			//compare distance from start with sPath entry
			if(startToFringe < sPathDist)	//if shorter,
			{
				sPath[column].parentVert = currentVert;
				sPath[column].distance = startToFringe;
			}
			column++;
		} //end while(column < nVerts)
	}  //end adjust_sPath()
	
	
	public void displayPaths() {
		for(int j=0;j<nVerts;j++){  //display contents of sPath[]
			System.out.print(vertexList[j].label + "=");  //B=
			if(sPath[j].distance == INFINITY)
				System.out.print("inf");					//inf
			else
				System.out.print(sPath[j].distance);		//50
			char parent = vertexList[sPath[j].parentVert].label;
			System.out.print("("+parent+")");				//(A)
		}
		System.out.println("");
	}
}
