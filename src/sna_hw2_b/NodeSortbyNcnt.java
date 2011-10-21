package sna_hw2_b;

import helper.MyNode;
import java.util.*;
import java.util.Comparator;


public  class NodeSortbyNcnt implements Comparator<MyNode>{
	
	    public int compare(MyNode v1, MyNode v2) {
	        return v2.getNghbrCnt() - v1.getNghbrCnt();
	    }

}
