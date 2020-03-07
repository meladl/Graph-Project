//Mohamed Eladl
//ID:1203261
//CSCI 260
public class GraphApp {
    public static void main(String[] args) {
        Graph theGraph = new Graph();
        theGraph.addVertex('A'); 
        theGraph.addVertex('B'); 
        theGraph.addVertex('C');
        theGraph.addVertex('D'); 
        theGraph.addVertex('E'); 
        theGraph.addEdge(0, 1);
        theGraph.addEdge(1, 2); 
        theGraph.addEdge(0, 3); 
        theGraph.addEdge(3, 4); 
        System.out.print("Vertices: ");
        theGraph.displayVertices();
        System.out.println();
        System.out.println("Edges:");
        theGraph.displayEdges();

    }

}