import java.util.LinkedList;
import java.util.Queue;

public class meister2 {
    public static int solution(int[][] maps) {
        int row = maps.length;
        int col = maps[0].length;
        boolean[][] check = new boolean[row+2][col+2];
        for(int i=0;i<row+2;i++){
            for(int j =0 ; j<col+2; j++){
                if(i == 0 || j ==0 || i == row+1 || j== col+1){
                    check[i][j] = true;
                }
                else if(maps[i-1][j-1] == 0){
                    check[i][j] = true;
                }
            }
        }
        int answer = bfs(check, row, col);
        
        return answer;
    }
    public static class Node {
        int x;
        int y;
        int cost;
        
        public Node(int x, int y, int cost){
            this.x = x;
            this.y = y;
            this.cost = cost;
        }
    }
    private static int bfs(boolean[][] check, int row, int col) {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(1,1,1));
        check[1][1] = true;

        while(!q.isEmpty()){
            Node node = q.poll();
            if(node.x == row && node.y == col){
                return node.cost;
            }
            int x = node.x;
            int y = node.y;
            if(!check[x-1][y]){
                check[x-1][y] = true;
                q.offer(new Node(x-1,y,node.cost+1));
            }
            if(!check[x][y-1]){
                check[x][y-1] = true;
                q.offer(new Node(x,y-1,node.cost+1));
            }
            if(!check[x+1][y]){
                check[x+1][y] = true;
                q.offer(new Node(x+1,y,node.cost+1));
            }
            if(!check[x][y+1]){
                check[x][y+1] = true;
                q.offer(new Node(x,y+1,node.cost+1));
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        int answer = solution(maps);
        System.out.println(answer);
    }
    
}
