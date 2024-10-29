package DiligentPrep;

import java.util.*;

public class MergeTwoArraysinSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer[] a={1,3,5,7};
//        Integer[] b={2,4,6,8};
////        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(a));
////        list.addAll(Arrays.asList(b));
////        System.out.println(list);
//        TreeSet<Integer> set=new TreeSet<>(Arrays.asList(a));
//        set.addAll(Arrays.asList(b));
//        System.out.println(set);
        
      
        int[]a ={1,3,5,7};
    int[] b={2,4,6,8};
    int n=a.length+b.length;
    int res[]=new int[n];
    int al=a.length-1;
    int j=0;
        for(int i=0;i<n;i++)
        {
        	if(al>=0)
        	{
        		res[i]=a[i];
        		al--;
        	}
        	else
        	{
        		res[i]=b[j++];
        	}
        	
        }
        Arrays.sort(res);
        
       System.out.println(Arrays.toString(res));
       
        

	}

}
