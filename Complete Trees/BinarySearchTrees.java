public class BinarySearchTrees {

    int key;
    int height;
    BinarySearchTrees left,right;
    static  BinarySearchTrees NIL = new BinarySearchTrees();

    private BinarySearchTrees(){
        left=right=NIL;
        height=-1;
    }
    public BinarySearchTrees(int key){
        this.key = key;
        left=right=NIL;
        height=0;
    }
    public BinarySearchTrees grow(int key){
        if(this==NIL) return new BinarySearchTrees(key);
        if(this.key==key) return this;
        if(key>this.key) right=right.grow(key);
        if(key<this.key) left = left.grow(key);
        height = 1+Math.max(left.height ,right.height);
        return this;
    }
    public int size(){
        if(this==NIL) return 0;
        return (1+ left.size()+ right.size());
    }
    public boolean add(int key){
        int oldSize = size();
        grow(key);
        int newSize = size();
        System.out.println("Size after adding " + key + " : " + newSize);
        return oldSize<newSize;
    }

    public String toString(){ // in order
        if(this==NIL){
            return " ";
        }
        return (left+" "+key+" "+right);

    }
    public String preOrder(){ // pre order traversal
        if(this==NIL){
            return " ";
        }
        return (key+" " + left + " " + right);
    }
    public String postOrder(){ // post order traversal
        if(this==NIL){
            return " ";
        }

        return (left+" " + right + " " + key);
    }


    public boolean search(int target){
        if(this==NIL){
            return false;
        }
        if(key==target){
            return true;
        }
        if(this.key<target){
            return (right!=null&&search(right.key));
        }
        return (left!=null&&search(left.key));
    }


    public static void main(String[] args) {

        BinarySearchTrees bst = new BinarySearchTrees(1);
        bst.add(2);
        bst.add(3);
        bst.add(4);
        bst.add(0);
        bst.add(-1);
        bst.add(-2);

        System.out.println(bst.size());
        System.out.println(bst.height);
        System.out.println(bst.toString());
        System.out.println(bst.postOrder());
        System.out.println(bst.preOrder());




    }



}
