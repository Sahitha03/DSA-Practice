// User function Template for Java
class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> l=new ArrayList<>();
        boolean vis[]=new boolean[adj.size()];
        vis[0]=true;
        dfs(0,vis,l,adj);
        return l;
    }
    public static void dfs(int node,boolean vis[],ArrayList<Integer> l,ArrayList<ArrayList<Integer>> adj)
    {
        vis[node]=true;
        l.add(node);
        for(int x:adj.get(node))
        {
            if(vis[x]==false)
            {
                dfs(x,vis,l,adj);
            }
        }
    }
}