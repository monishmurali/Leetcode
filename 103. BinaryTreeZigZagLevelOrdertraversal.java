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
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null)
        {return new ArrayList<>();}
        List<List<Integer>> resultlist=new ArrayList<>();

        
        Queue<TreeNode> queue=new LinkedList<>();
        Boolean isTrue=true;
        //push root element
        queue.offer(root);

        while(!queue.isEmpty())
        {
            int size=queue.size();
            List<Integer> InnerList=new ArrayList<>();
            //In for loop remove the first element and check its left and right child and push into queue and add in the inner list.
            for(int i=0;i<size;i++)
            {
               TreeNode curr= queue.poll();
               if(curr.left!=null)
               {
                   queue.offer(curr.left);
               }
               if(curr.right!=null)
               {
                   queue.offer(curr.right);
               }
               InnerList.add(curr.val);
            }
//for follwing zig zag traversal first flag it true and 2nd time its true.
            if(!isTrue)
            {
                Collections.reverse(InnerList);
            }

            resultlist.add(InnerList);

            isTrue=!isTrue;

        }
        return resultlist;
        
        
    }
}
