package interviewTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwiggyInterview {

	public static void main(String[] args) {
		int[] a={1,3,5,7};
        int[] b={2,4,6,8};
        int size=a.length+b.length;
        int n=a.length-1;
        int j=0;
        int[] result=new int[size];
        for(int i=0;i<size;i++)
        {
            if(n>=0)
            {
            result[i]=a[i];
            n--;
            System.out.println(result[i]);
            }
            else
            {
                result[i]=b[j];
                j++;
                System.out.println(result[i]);
            }
        }
        for(int i=0;i<result.length-1;i++)
        {
        	for(int j1=0;j1<result.length-1;j1++)
        	{
        		if(result[j1]>result[j1+1])
        		{
        			int temp=result[j1];
        			result[j1]=result[j1+1];
        			result[j1+1]=temp;
        			
        		}
        	}
        }
        System.out.println(Arrays.toString(result));
	}

}
