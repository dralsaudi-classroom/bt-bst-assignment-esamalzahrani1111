package com.example.project;

public class TreeUser {
    public static <T> int countLeaves(BT<T> bt) {
        //throw new UnsupportedOperationException("Not supported yet.");
		// Write the method countLeafs that should return the number of leaf nodes in the tree. A leaf node is a node that has no children.
        // assume the following method exists in the ADT: isLeaf (boolean flag): requires: Binary tree is not empty.
        // input: None. results: if the current node of the binary tree is a leaf then flag is set to true otherwise it is set to false. output: flag.
        // you can't call countLeaves from BT.jav
	//     if(bt.empty())
	// 	    return 0;
	//     int leftcount = 0;
	//     int rightcount=0;
	//     if(bt.isLeaf()) {
	// 	    return 1;
	//     }
	//     if(bt.find(Relative.RightChild)){
	// rightcount = countLeaves(bt);
	// 	    bt.find(Relative.Parent);
	//     }
	//     if(bt.find(Relative.LeftChild)){
	// 	    leftcount = countLeaves(bt);
	// 	     bt.find(Relative.LeftChild);
 //    }
 //    return leftcount+rightcount;
    
 //    }
	    bt.find(Relative.Root);
	    if(bt.empty())
		    return 0;
	    return recr(bt);
	    
	
}

public static <T> int recr (BT<T> bt){
	int Leftnum=0;
	int Rightnum=0;
	if (bt.isLeaf())
		return 1;
	if(bt.find(Relative.LeftChild)){
		Leftnum = recr(bt);
		bt.find(Relative.Parent);
	}
	if(bt.find(Relative.RightChild)){
		Rightnum = recr(bt);
		bt.find(Relative.Parent);
	}
	return Leftnum + Rightnum;
	}
	
	
		
		
	

}
