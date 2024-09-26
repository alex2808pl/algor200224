package de.telran.lesson_13_20240926;

public class MainAviTree {
    public static void main(String[] args) {
        AvlTree tree = new AvlTree();
        //int[] keys = {10, 20, 30, 40, 50, 25};
        int[] keys = {75, 9, 18, 29, 17, 100, 88, 81};

        NodeTree root = constructBST(tree, keys);

        tree.print2(root);
    }

    public static NodeTree constructBST(AvlTree tree, int[] keys) {
        NodeTree root = null;
        for (int key : keys) {
            root = tree.insert(root, key);
            tree.print2(root); // визуализация
        }
        return root;
    }
}
