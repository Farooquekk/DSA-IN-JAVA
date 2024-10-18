public class BinaryTrees {
    Object root;
    BinaryTrees left,right;

    public BinaryTrees(Object root) {
        this.root = root;
    }

    public BinaryTrees(Object root, BinaryTrees left, BinaryTrees right) {
        this.root = root;
        this.left = left;
        this.right = right;
    }


public Object setRoot(Object newRoot){
        Object temp = root;
        this.root = newRoot;
        return  temp;
}

public BinaryTrees setLeft(BinaryTrees newLeft){
        BinaryTrees temp = this.left;
        this.left = newLeft;
        return temp;
}

    public BinaryTrees setRight(BinaryTrees newRight){
        BinaryTrees temp = this.right;
        this.right = newRight;
        return temp;
    }

   public String toString(){ // same as inOrder --> left + root + right
  StringBuilder stringBuilder = new StringBuilder(" ");
  if(left!=null) stringBuilder.append(left).append(" ");
  stringBuilder.append(root).append(" ");
  if(right!=null){
      stringBuilder.append(right);
  }
  return stringBuilder+" ";

    }
    public String preOrder(){  // root + left + right
        StringBuilder stringBuilder = new StringBuilder(" ");
        stringBuilder.append(root).append(" ");
        if(left!=null) stringBuilder.append(left).append(" ");
        stringBuilder.append(root).append(" ");
        if(right!=null){
            stringBuilder.append(right);
        }
        return stringBuilder+" ";

    }
    public String postOrder(){  // left + right +  root
        StringBuilder stringBuilder = new StringBuilder(" ");
        if(left!=null) stringBuilder.append(left).append(" ");
        stringBuilder.append(root).append(" ");
        if(right!=null){
            stringBuilder.append(right);
        }
        stringBuilder.append(root).append(" ");
        return stringBuilder+" ";

    }
    // height of tree
    public int heightOfTree(){
       // if(left==null&&right==null) return 0;
        return Math.max((left != null ? left.heightOfTree() : 0), (right != null ? right.heightOfTree() : 0)) + 1;

    }

// size of the tree
        public int size(){
      //  if(left==null&&right==null) return 0;
        return ((this.left!=null? left.size():0)+ (this.right!=null?right.size():0)+1);
    }

    // is leaf method
    public boolean isLeaf(){
        return (this.left == null && this.right == null);
    }

    // search method
    public  boolean search (Object target){
        if(root.equals(target)){
            return true;
        }
        if(left!=null&&left.search(target)) return true;
        return right != null && right.search(target);
    }
    public static void main(String[] args) {
        BinaryTrees binaryTrees1 = new BinaryTrees(2);
        BinaryTrees binaryTrees2 = new BinaryTrees(3);
        BinaryTrees binaryTrees5 = new BinaryTrees(4);
        BinaryTrees binaryTrees6 = new BinaryTrees(6);
        BinaryTrees binaryTrees7 = new BinaryTrees(5);
        BinaryTrees binaryTrees8 = new BinaryTrees(7);
        BinaryTrees binaryTrees =  new BinaryTrees(2,binaryTrees5,binaryTrees6);
        BinaryTrees binaryTrees4 = new BinaryTrees(3,binaryTrees7,binaryTrees8);
        BinaryTrees binaryTrees3 = new BinaryTrees(1,binaryTrees,binaryTrees4);


        System.out.println(binaryTrees3);
        System.out.println(binaryTrees3.preOrder());
        System.out.println(binaryTrees3.postOrder());
        System.out.println(binaryTrees3.search(5));
        System.out.println(binaryTrees7.isLeaf());
        System.out.println(binaryTrees3.size());
        System.out.println(binaryTrees3.heightOfTree());



    }






}
