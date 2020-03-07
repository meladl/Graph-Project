//Mohamed Eladl
//ID:1203261
//CSCI 260
public class Graph {
    private final int MAX_VERTS = 20;
    private Vertex vertexList[]; 
    private int adjMat[][]; 
    private int nVerts; 

    public Graph(){
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for(int j=0; j<MAX_VERTS; j++) 
            for(int k=0; k<MAX_VERTS; k++) 
                adjMat[j][k] = 0;
    } 

    public void addVertex(char lab){
        vertexList[nVerts++] = new Vertex(lab);
    }

    public void addEdge(int start, int end){
        adjMat[start][end] = 1;
    }

    public void displayVertex(int v){
        System.out.print(vertexList[v].label);
    }

    public void displayVertices(){
        for(int i = 0; i < nVerts; i++){
            System.out.print(vertexList[i].label+ " ");
        }
    }

    public void displayEdges(){
        for(int i = 0; i < MAX_VERTS; i++){
            for(int j = 0; j < MAX_VERTS; j++){
                if(adjMat[i][j] ==1)
                    System.out.println(vertexList[i].label +"--"+ vertexList[j].label);
            }
        }
    }

}
