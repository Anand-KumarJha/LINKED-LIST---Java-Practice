public class Main {

    public static void main(String[] args) {
//        1,2,5,3,4,null,6
        TreeNode Node1 = new TreeNode(6);
        TreeNode Node2 = new TreeNode(5,null,Node1);
        TreeNode Node3 = new TreeNode(3);
        TreeNode Node4 = new TreeNode(4);
        TreeNode Node5 = new TreeNode(2,Node3,Node4);

        TreeNode treeNode = new TreeNode(1,Node5,Node2);

        Solution solution = new Solution();
        solution.flatten(treeNode);
        solution.print();
    }
}
