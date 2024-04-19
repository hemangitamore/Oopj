//Binary tree
class BT1{
   Node root;  //root
   static class Node{
    int data;
    Node left,right;
    Node(int d){
       this.data=d;
       this.left=null;
       this.right=null;
   }
  
 }
   BT1(){
    this.root=null;
  }
  
  BT1(Node root){
    this.root=root;
    
  }

void printInorder(Node n){
  if(n==null){
   return;
}
printInorder(n.left);
System.out.print(n.data+" ");
printInorder(n.right);
}

  



 void printPreorder(Node n){
if(n==null){
return;
}
System.out.print(n.data+" ");
printPreorder(n.left);
printPreorder(n.right);


}

void printPostorder(Node n){
if(n==null){
return;
}
printPostorder(n.left);
printPostorder(n.right);
System.out.print(n.data+" ");

}

void inorder(){
printInorder(root);
   
}


void Preorder(){
printPreorder(root);
}

void postOrder(){
printPostorder(root);
}

Node insert(Node root,int key){
   if(root==null){
    root=new Node(key);
   return root;
}
if(key<=root.data){
  root.left=insert(root.left,key);
}else{
    root.right=insert(root.right,key);
}
return root;
}

void insertNode(Node root){
  root=insert(root,key);
}

public static void main(String args[]){
  BT1 t1=new BT1();
  t1.root=new Node(15);
  t1.root.left=new Node(20);
  t1.root.right=new Node(25);
  t1.root.left.left=new Node(30);
   t1.root.right.right=new Node(35);

System.out.println("Inorder:");
t1.inorder();
System.out.println();

System.out.println("Preorder:");
t1.Preorder();

System.out.println();
System.out.println("Postorder:");
t1.postOrder();

System.out.println();
System.out.println("Insert node:");
t1.insertNode(40);
t1.inorder();


}

}