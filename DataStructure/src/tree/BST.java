package tree;

/**
 * @Classname BST
 * @Date 2020/7/27
 * @Created by 陈刀仔
 * @Description TODO
 */

public class BST {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        CreateBST bst = new CreateBST();
        bst.infixOrder();
        for (int i = 0; i < a.length; i++) {
            bst.add(new Node(a[i]));
        }
        bst.infixOrder();
    }
}

class CreateBST {
    private Node root;

    public void add(Node node) {
        if (root == null) {
            root = node;
        } else {
            root.add(node);
        }
    }

    //查找要删除的节点
    public Node search(int val){
        if (this.root==null){
            return null;
        }else return this.root.search(val);
    }

    //查找要删除节点的父节点
    public Node searchPar(int val){
        if (this.root==null){
            return null;
        }else return this.root.searchPar(val);
    }

    //删除节点
    public void delNode(int val){
        if (this.root==null)return;
        else {
            Node tarNode = search(val);
            //没有这个节点
            if (tarNode==null)return;
            //没有父节点
            //只有一个节点
            if (this.root.l==null&&this.root.r==null){
                root=null;
                return;
            }


        }
    }

    public void infixOrder() {
        if (this.root != null) {
            this.root.infixOrder();
        } else {
            System.out.println("kong");
        }
    }
}

class Node {
    int value;
    Node l;
    Node r;

    public Node(int value) {
        this.value = value;
    }

    //添加    左<中<=右
    void add(Node node) {
        if (this.value > node.value) {
            if (this.l == null) {
                this.l = node;
            } else {
                this.l.add(node);
            }
        } else {
            if (this.r == null) {
                this.r = node;
            } else {
                this.r.add(node);
            }
        }
    }

    //查找
    public Node search(int val) {
        if (val == this.value) {
            return this;
        }
        if (val < this.value) {
            if (this.l != null) {
                return this.l.search(val);
            }else return null;
        }else {
            if (this.r!=null){
                return this.r.search(val);
            }else return null;
        }

    }

    //查找val的父节点
    public Node searchPar(int val){
        if ((this.l!=null&&this.l.value==val)||(this.r!=null&&this.r.value==val)){
            return this;
        }else {
            if (val<this.value&&this.l!=null){
                return this.l.searchPar(val);
            }else if (val>=this.value&&this.r!=null){
                return this.r.searchPar(val);
            }else return null;
        }
    }

    //删除
    public void delete(int val) {

    }

    //中序遍历
    public void infixOrder() {
        if (this.l != null) {
            this.l.infixOrder();
        }
        System.out.println(this.value);
        if (this.r != null) {
            this.r.infixOrder();
        }
    }
}

