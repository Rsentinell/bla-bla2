import java.util.Scanner;
public class MaMuTest {

	public static void main(String[] args)throws Exception {
		Scanner in=new Scanner(System.in);
		/* write program what will test child with multiplication. There are three difficulty and two chance to write correct answer.
		 first correct answer is two points second is one point. after second wrong answer will show correct answer and child get
		 no points next child will be asked if he/she want another question or waned end test.
		*/
		char Cont = 'y';
		int Dific, Num1, Num2, CorAnsw, Points= 0, Answer = 0;
		String1();
		String2();
		Dific = in.nextInt();
		if (Dific==1){
			while (Cont!= 'n'){
				Num1= Random1();
				Num2= Random1();
				CorAnsw= Num1*Num2;
				String3(Num1,Num2);
					for (int j=1;j<3;j++){
						Answer= in.nextInt();
						if (Answer==CorAnsw && j==1){
							String4();
							Points=Points+2; 
							j=j+2;
							}
							else if (Answer==CorAnsw && j==2){
								String6();
								Points=Points+1; 
							}
								else if (Answer!= CorAnsw && j==1){
									String5();
								}
									else {
										String7(CorAnsw);
						 	}	
					
					}
				String8();
				Cont= in.next().charAt(0);
			}}
			else if (Dific== 2){
					while (Cont!= 'n'){
						Num1= Random2();
						Num2= Random1();
						CorAnsw= Num1*Num2;
						String3(Num1,Num2);
							for (int j=1;j<3;j++){
								Answer= in.nextInt();
								if (Answer==CorAnsw && j==1){
									String4();
									Points=Points+2; 
									j=j+2;
									}
									else if (Answer==CorAnsw && j==2){
										String6();
										Points=Points+1; 
									}
										else if (Answer!= CorAnsw && j==1){
											String5();
										}
											else {
												String7(CorAnsw);
											}	
						
						}
					String8();
					Cont = in.next().charAt(0);
				}
				
			}
				else if (Dific== 3){
						while (Cont!= 'n'){
							Num1= Random3();
							Num2= Random2();
							CorAnsw= Num1*Num2;
							String3(Num1,Num2);
								for (int j=1;j<3;j++){
									Answer= in.nextInt();
									if (Answer==CorAnsw && j==1){
										String4();
										Points=Points+2; 
										j=j+2;
										}
									else if (Answer==CorAnsw && j==2){
											String6();
											Points=Points+1; 
											}
										else if (Answer!= CorAnsw && j==1){
											String5();
												}
											else {
												String7(CorAnsw);
								 	}	
							
							}
						String8();
						Cont = in.next().charAt(0);
						}
					}
				else 
					System.out.println("Your choise is out of option restart program.");
		String9(Points);
		in.close();
	}
	
	
	
	static void String1(){
		System.out.println(" Welcome in multiplication practise program");
	}
	static void String2(){
		System.out.println(" Chose difficulty 1 – 3: ");
	}
	static void String3(int N1, int N2){
		System.out.println(N1+" x "+N2+" is?");
	}
	static void String4(){
		System.out.println(" Your answer is right you got 2 points.");
	}
	static void String5(){
		System.out.println(" Your answer is incorrect try again.");
	}
	static void String6(){
		System.out.println(" Your answer is right you got 1 point.");
	}
	static void String7(int A){
		System.out.println(" Your answer is incorrect answer correct answer is: "+A);
	}
	static void String8(){
		System.out.println(" Do you want to continue? y/n");
	}
	static void String9(int P){
		System.out.println(" You got "+P+" points.");
	}
	static int Random1 (){
		int R= (int)((Math.random()*10)%5+1);
		return R;
	}
	static int Random2 (){
		int R= (int)((Math.random()*10)+1);
		return R;
	}
	static int Random3 (){
		int R= (int)((Math.random()*100)%15+1);
		return R;
	}

}
