/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

 /*

 using pre order traversal traverse the tree and add the values in the range of low and high provided in the problem

 1. create stack
 2. push root
 3. until stack is empty perform while 
     4. pop 1st ele and make curr. 
        if(curr.val is in range low and high)
        {
            sum=sum+curr;
        }
     5. push right if not null in to stack.  
     6. push left if not null in to stack. 
     7. pop the top element which is left as it is inserted last
     8. follow 5 
     9. follow 6

10 return sum


 */
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {

        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        int sum=0;

        while(!stack.isEmpty())
        {
            TreeNode curr=stack.pop();

            if(curr.val>=low && curr.val<=high)
            {
                sum+=curr.val;
            }

            if(curr.right!=null)
            {
                stack.push(curr.right);
            }
             if(curr.left!=null)
            {
                stack.push(curr.left);
            }
        }
        return sum;

        
    }
}
