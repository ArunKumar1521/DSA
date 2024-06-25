package org.example.tree;
class bNode{
    int data;
    bNode left;
    bNode right;

    public bNode(int data) {
        this.data = data;
    }
}
public class BinaryTree {
    bNode root;

    public void insert(int data){
      root = insertRec(root, data);
    }

    private bNode insertRec(bNode root,int data){
        if(root == null){
            root = new bNode(data);
        } else if (data < root.data){
            root.left = insertRec(root.left,data);
        } else if (data > root.data){
            root.right = insertRec(root.right,data);
        }
        return root;
    }

    public void showInOrder(){
        inOrderRec(root);
    }

    private   void inOrderRec(bNode root){
        if (root != null){
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }
}
