public class Main {
    public static MyBinaryTreeNode<Integer> minimalTree(int[] array) {
        return minimalTreeRec(array, 0, array.length - 1);
    }

    public static MyBinaryTreeNode<Integer> minimalTreeRec(int[] array, int start, int end) {
        if (end < start) {
            return null;
        }
        int mid = (start + end) / 2;
        MyBinaryTreeNode<Integer> n = new MyBinaryTreeNode<>(array[mid]);
        n.left = minimalTreeRec(array, start, mid - 1);
        n.right = minimalTreeRec(array, mid + 1, end);
        return n;
    }
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 20};
        MyBinaryTreeNode<Integer> tree = minimalTree(array);
        tree.PrintPreOrder(tree);
    }
}
