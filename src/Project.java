
	import java.util.Scanner;
	public class Project {
		static int Score=0;
		final static int Pass_mark=6;
		static int c=0;
		public static void main(String[] args) {
			Scanner obj=new Scanner (System.in);
			String a[][]=new String[1][10];
			
			a[0][0]="A) Number of primitive datatypes in java are?"+'\n'+
	              "1) 5    2) 6 "+'\n'+"3) 10    4) 8";
			
			a[0][1]="B) Array in java are "+'\n'+
					 "1) Object References 2) Object"+'\n'+"3)Methods    4)variable";
			
			a[0][2]="C) Which one of the following is not an access modifier"+'\n'+
					"1) Protected  2) Public"
					+'\n'+"3) void 4) Private" ;
			
			a[0][3]="D) Identify the Infinity Loop"+'\n'+
			        " 1) for(;;) 2)for(int i=0;i<1;i--)"+'\n'+
			        "3) for(int i=0;;i++) 4) all the above";
			
			
			a[0][4]="E) Where is System Class defined"+'\n'+
					"1) java.lang.package  2)java.util.package"+'\n'+
					"3) java.io.package    4)none";
			
			a[0][5]="F) The default value of String is"+'\n'+
					"1) Null     2)Zero "+'\n'+" 3) One    4)None of the Above";
			
			a[0][6]="G) Which of the method has no Return Type"+'\n'+
					"1) Userdefined method   2)predefined method "+'\n'+" 3) Constructor    4)None of the Above";
			
			a[0][7]="H) Which of these variable must be initialized"+'\n'+
					"1) Local     2)Instance "+'\n'+" 3) Static    4)All the Above";
			
			a[0][8]="I) In java Sequence of Character is Known as "+'\n'+
					"1) String     2)StringBuffer "+'\n'+" 3)StringBuilder    4)All the Above";
			
			a[0][9]="J) The Parent class for all classes is Known as "+'\n'+
					"1) ObjectClass     2) Exception "+'\n'+" 3) Throwable   4)None of the Above";
			for (int i=0;i<1;i++) {
				for(int j=0;j<10;j++) {
					System.out.println(a[i][j]);
					int Answer =obj.nextInt();
					if((a[i][j]==a[0][0]&& Answer==4)||(a[i][j]==a[0][1])&&Answer==2||((a[i][j]==a[0][2])&&Answer==3)
					||(a[i][j]==a[0][3])&&Answer==4||(a[i][j]==a[0][4])&&Answer==1||(a[i][j]==a[0][5])&&Answer==1
					||(a[i][j]==a[0][6])&&Answer==3||(a[i][j]==a[0][7])&&Answer==1||(a[i][j]==a[0][8])&&Answer==4
					||(a[i][j]==a[0][9])&&Answer==1){
						System.out.println("The Answer is correct");
					Score++;
					System.out.println("your Score :"+Score);
					c=Pass_mark-Score;
					System.out.println("Remaining Marks to be Scored :"+c);
					System.out.println();
						}
					else  {
						System.out.println("The Answer is Wrong");
					Score --;
					System.out.println("Your Score:"+Score);
					c=(Pass_mark-Score);
					System.out.println(" Remaining Marks to be Scored :"+ c);
					System.out.println();
					}
						}
				}
				if(Score>=Pass_mark) {
					System.out.println("CONGRATULATIONS"+'\n'+"YOU ARE ELIGIBLE FOR NEXT ROUND");
				}
				else {
					System.out.println("BETTER LUCK NEXT TIME");
				}
					}
					
				}
			



