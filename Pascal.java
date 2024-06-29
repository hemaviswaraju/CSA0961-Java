class Pascal
{  
public static void main(String[] args)   
{  
int rows = 5,i,j; 
for (i = 0; i < rows; i++)
{  
for (j = 0; j < rows - i; j++)
{  
System.out.print("  ");  
}
int k= 1;
for (j = 0; j <= i; j++)
{  
System.out.printf("%4d",k);  
k = k * (i - j) / (j + 1);  
}
System.out.println();
}     
}  
}