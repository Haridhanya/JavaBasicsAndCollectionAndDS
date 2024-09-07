package stringPrograms;

public class trimMethodLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="     Hello Madam    ";
		//trim method remove space  befroe and after string
		//System.out.println(s.trim());
int start=0;
int end=0;
		//algo:
		//1.find where first chararter startas and last characters ends
		//2.Then prints only those characters.
		int size=s.length();
		for(int i=0;i<size;i++)
		{
			if(s.charAt(i)!=' ')
			{
				start=i;
				System.out.println(start);
				break;
			}
		}
		for(int j=size-1;j>=0;j--)
		{
			if(s.charAt(j)!=' '){
				end=j;
				System.out.println(end);
				break;
				
			}
	}
		for(int i=start;i<=end;i++)
		{
			System.out.println(s.charAt(i));
		}

	}}
