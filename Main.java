class Product{
int pcode;
String pname;
double price;
public Product(int a,String b,double c)
{
pcode=a;
pname=b;
price=c;
}
}
public class Main{
public static void main(String []args)
{
System.out.println("Abhirami Vinod\n 23MCA002\n 13-Feb-2023");
Product p1=new Product(1,"Apple",150);
Product p2=new Product(2,"kiwi",70);
Product p3=new Product(3,"Grapes",160);
Product cheapestproduct=p1;
if(p2.price<cheapestproduct.price)
{
cheapestproduct=p2;
}
if(p3.price<cheapestproduct.price)
{
cheapestproduct=p3;
}
System.out.println("The product with lowest price is "+cheapestproduct.pname+" with a price of "+cheapestproduct.price);
}
}
