package com.pramati.algo.bst;

public class BstNode {

	
	BstNode left, right;
    int data;

    /* Constructor */
    public BstNode()
    {
        left = null;
        right = null;
        data = 0;
    }
    /* Constructor */
    public BstNode(int n)
    {
        left = null;
        right = null;
        data = n;
    }
    /* Function to set left node */
    public void setLeft(BstNode n)
    {
        left = n;
    }
    /* Function to set right node */ 
    public void setRight(BstNode n)
    {
        right = n;
    }
    /* Function to get left node */
    public BstNode getLeft()
    {
        return left;
    }
    /* Function to get right node */
    public BstNode getRight()
    {
        return right;
    }
    /* Function to set data to node */
    public void setData(int d)
    {
        data = d;
    }
    /* Function to get data from node */
    public int getData()
    {
        return data;
    }     
}
