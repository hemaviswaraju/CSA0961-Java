class EB
{
 double cno,pmr,cmr,i,n;
 String cname;
 void get(int cusno,double premr,double cumr,String cusname)
 {
  cno=cusno;
  pmr=premr;
  cmr=cumr;
  cname=cusname;
 }
 void cal()
 {
   n=pmr-cmr;
   System.out.println("Consumer Number = "+cno); 
   System.out.println("Consumer Name = "+ cname); 
   System.out.println("Previous Month Reading = "+pmr); 
   System.out.println("Current Month Reading = "+cmr); 
   System.out.println("Unit used this month = "+n);
   if(n<=100)
   {
    i=n*1;
    System.out.println(i);
   }
   else if(n>100 && n<=200)
   {
     i=n*2.50;
     System.out.println(i);
   }
   else if(n>200 && n<=500)
   {
     i=n*4;
     System.out.println(i);
   }
   else if(n>500)
   {
     i=n*6;
     System.out.println(i);
   }
   else
   {
     System.out.println("invalid input");
   }
}
public static void main(String args[])
{
   EB bill=new EB();
   bill.get(1029,1850,2550,"Deepthi");
   bill.cal();
}
}
   
   
    
   
