package edu.pragmtic.homework.comparable;

public class Tree implements Comparable<Tree>{

	int height;
	
	Tree(int height){
		this.height = height;
	}

	@Override
	public int compareTo(Tree o) {
		
		if(this.height < o.height){
			return -1;
		} else if(this.height == o.height){
			return 0;
		} else {
			return 1;
		}
	}
	
	@Override
	public String toString(){
		return "tree-" + height;
	}
	
}
