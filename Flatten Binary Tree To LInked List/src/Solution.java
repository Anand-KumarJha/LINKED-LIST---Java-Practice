class Solution {
    TreeNode prev = null;
    TreeNode root;
    public void flatten(TreeNode root) {
        if(root == null)return;

        flatten(root.right);
        flatten(root.left);

        root.right = prev;
        root.left = null;
        prev = root;
        this.root = root;
    }
    public void print(){
        printTree(root);
    }
    public void printTree(TreeNode root){
        if (root == null){
            System.out.println("null");
            return;
        }

        System.out.println(root.val);
        printTree(root.left);
        printTree(root.right);
    }

}