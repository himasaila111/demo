package practice;
import java.util.Arrays;
import java.util.stream.IntStream;
public class pra {

	public static void main(String[] args) {
		String a="a,c,d,e";String res="1",cha="";
		String[] str=a.split(",");
		String[] x= {"e=5 a","c=2 d","d=100 e"};
		int[] num=new int[x.length];
		int[] num2=new int[x.length];
		int[] ind=new int[x.length];
		String[] variable=new String[x.length];
		String[] va=new String[x.length];
		for(int i=0;i<x.length;i++) {
			String z=x[i];
			String[] var=z.split("=");
			va[i]=var[0];
			System.out.println(va[i]);
			String[] pair=var[1].split(" ");
			num[i]=Integer.parseInt(pair[0]);
			num2[i]=Integer.parseInt(pair[0]);
			variable[i]=pair[1];
		}
		Arrays.sort(num);
		for(int i=0;i<num.length;i++) {
			int d=num2[i];
			ind[i]=IntStream.range(0, x.length).filter(j->d==num[j]).findFirst().orElse(-1);
		}
		for(int k=0;k<ind.length;k++) {
			if(k==0) {
			res+=va[ind[k]]+"="+num2[ind[k]]+variable[ind[k]]+"=";
			cha=variable[ind[k]];
			}
			else {
				String ch=cha;
				int ind2=IntStream.range(0, x.length).filter(f->ch==va[f]).findFirst().orElse(-1);
				System.out.println(ind2);
			}
			int mul=num[k];
			
			
		}
	}
	}
