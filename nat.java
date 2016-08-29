import java.io.*;
class nat
{
public static void main(String str[])
{
Scanner sc=new Scanner(System.in);
int sum=0;
int n=sc.nextInt();
int[] p=new int[n];
for(int i=0;i<n;i++)
{
p[i]=sc.nextInt();
sum=+p[i];
}
System.out.println(sum);

}
}
