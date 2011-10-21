package sna_hw2_b;

import helper.MyNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.io.IOException;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import sna_hw2_a.ICModel;

public class ICModelWithAttack extends ICModel {
	public void start(String graphFileName, String revealFileName)throws IOException{
		getGraph(graphFileName);
		getInfectedNodesQueue(revealFileName);
		Integer g= 10;
		Attack(g);
		
		
		//int num=0;
		//int target;
		//changeEdgeWeight();
		//for (int i=1;i<=5;i++)
		//while (num<52*i){
		//	target=AttackStrategy.neighborAttack(graph);
		//	graph.removeVertex(map.get(target));
		//}
	}
	
	
	public void Attack (Integer Gama ){
		//SOrt the Node first 
		//Then Find if the first node is infected?
		//if(infected) findneighbor(contain second ) 
        ArrayList <MyNode> Vcoll = new ArrayList<MyNode>(graph.getVertices());
        Collections.sort(Vcoll, new NodeSortbyNcnt());
		//for test
        for(MyNode v : Vcoll) System.out.println(v.getId()+" "+v.getNghbrCnt());
		

	}
}
