package DiligentPrep;

import java.util.HashSet;

public class LongestConsecutiveOccuranceofArray {

	public static void main(String[] args) {
		

int[] arr = {4, 3, 25, 6, 7, 8, 9, 2, 3, 10};
int len=0;int maxlen=0;
HashSet<Integer> set=new HashSet<>();
for(int n:arr)
{
	set.add(n);
}

for(int num:arr)
{
	
	if (!set.contains(num - 1)) {
        int CurrentNum = num;
        maxlen = 1;
	
	
	
	while(set.contains(CurrentNum+1))
	{
		CurrentNum++;
		len++;
		
	}
	maxlen = Math.max(maxlen, len);
	
}



		
}

System.out.println(maxlen);	
	}

}
