class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root==null)
        {
            return sum;
        }
        
        q.add(root);
        
        while(!q.isEmpty())
        {
            TreeNode rem = q.remove();
            
            if(rem.left!=null)
            {
                q.add(rem.left);
                if(rem.left.left==null && rem.left.right==null)
                {
                    sum+=rem.left.val;
                }                
            }
            if(rem.right!=null)
            {
                q.add(rem.right);
            }
        }
        
        return sum;
    }
}
