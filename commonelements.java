import java.util.*;
class commonelements
{
public static void main(String arg[]){
	int a[] = {1,2,3,4};
	int b[] = {2,4,5,6,7};
	int i,j;
	for(i=0;i<a.length;i++){
		for(j=0;j<b.length;j++){
			if(a[i]==b[j]){
				System.out.print(a[i]+" ");
				}
			}
		}		
	}
}