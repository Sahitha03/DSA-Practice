// User function Template for Java
class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> l=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[adj.size()];
        q.add(0);
        vis[0]=true;
        while(!q.isEmpty())
        {
            int node=q.poll();
            l.add(node);
            for(int x:adj.get(node))
            {
                if(vis[x]==false)
                {
                    vis[x]=true;
                    q.add(x);
                }
            }
        }
        return l;
    }
}