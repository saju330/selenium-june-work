package javapkg;

public class Operators {

	public static void main(String[] args) {
	
		System.out.println("---------Arithmetic Operator--------");
		
		int a=20,b=10;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
        System.out.println("a/b="+(a/b));  //quoteint
        System.out.println("a%b="+(a%b));  //reminder
        
        System.out.println("--------Assignment Operator--------");
        
        int c=b;
        System.out.println(a+=b); //a=a+b 30
        System.out.println(a-=b); //a=a-b //20
        
        System.out.println("-------Relational Operatoer--------");
         int v1=30,v2=20;
         
         System.out.println(v1<v2); //false
         System.out.println(v1==v2); //false
         System.out.println(v1!=v2); //true
         
         System.out.println("-------Logical Operators--------");
         
         //   A  B    1||B   A&&B  1A   1B
         //   0  0     0      0     1   1
         //   1  0     1      0     0   1
         //   0  1     1      0     1   0
         //   1  1     1      1     0   0
         
         String username="abc";
         String password="abc123";
         
         
         System.out.println(username=="abc" && password=="abc123");//true
         System.out.println(username=="abc" || password=="abc12");//true
         System.out.println(!(username=="abc"));  //false
         
         System.out.println("-------Unary Operator------");
         //   ++- increment by 1
         //       postincrement and preincrement
         //   --decrement by 1
         
         int v3=6;
         System.out.println(v3++);//6
         System.out.println(v3);//?
         System.out.println(++v3);//8
         
         System.out.println("------ternary Operator======");
         //?;
         // variable=condition?exp1:exp2;
           
         String s = v1>v3?"v1 is greater":"v2 is greater";
         System.out.println(s);
         
	}

}
