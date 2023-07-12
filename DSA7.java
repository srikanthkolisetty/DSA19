package Ass19;

import java.util.HashMap;
public class DSA7 {

	public static void main(String[] args) {
		
		int p1[]=new int[] {1,2,2,1};
		int p2[] = new int[] {2,3};
		int p3[]=new int[p1.length>p2.length?p2.length:p1.length];
		HashMap<Integer,Integer> d = new HashMap();
		int k=0;
		for(int i=0;i<p1.length;i++)
		{
			if(d.get(p1[i])==null)
			{
				d.put(p1[i], 1);
				for(int j=0;j<p2.length;j++)
				{
					if(p1[i]==p2[j])
					{
						p3[k]=p1[i];
						k++;
					}
				}
			}
			}
		
		for(int i:p3)
		{
			System.out.println(i);
		}
	}
}
