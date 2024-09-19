package stringPrograms;

public class BubbleSort_DescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="online";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			for(int j=0;j<ch.length-1;j++) {
				if(ch[j]<ch[j+1]) {
					char temp=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;
				}
			}
		}
		System.out.println(ch);
		
		
		
	}

}
