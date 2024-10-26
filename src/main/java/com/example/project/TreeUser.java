package com.example.project;

public class TreeUser {
    public static <T> int countLeaves(BT<T> bt) {
        //throw new UnsupportedOperationException("Not supported yet.");
		// Write the method countLeafs that should return the number of leaf nodes in the tree. A leaf node is a node that has no children.
        // assume the following method exists in the ADT: isLeaf (boolean flag): requires: Binary tree is not empty.
        // input: None. results: if the current node of the binary tree is a leaf then flag is set to true otherwise it is set to false. output: flag.
        // you can't call countLeaves from BT.java
	    T temp = bt.retrieve();
	    if(!bt.find(root))
		    return 0;
	    int leftcount = 0;
	    int rightcount=0;
	    if(bt.isLeaf())
		    return 1;
	    if(bt.find(RightChild)){
	rightcount = countLeaves(bt);
		    bt.find(Parent);
	    }
	    if(bt.find(LeftChild)){
		    leftcount = countLeaves(bt);
		     bt.find(Parent);
    }
	    return leftcount+rightcount;
	
}
