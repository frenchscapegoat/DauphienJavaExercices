import java.util.Scanner;

public class Ex47 {
	
	static int nombre1[]=new int[10];
	static int nombre2[]=new int[10];
	static Scanner sc=new Scanner(System.in);
	static int result[]=new int[10];
	static int repbonnes=0;

	public static void CreateQuiz(){	
			
			for(int i=0;i<10;i++){
				int nbr1 =(int)(Math.random()*100+1);
				int nbr2 =(int)(Math.random()*100+1);
				nombre1[i]=nbr1;
				nombre2[i]=nbr2;
				
			}					
		    
		}
	
	
	public static void AdministerQuiz(){
		for(int i=0; i<10 ;i++){
			System.out.println("Question "+i+" :calculez? "+nombre1[i]+"+"+nombre2[i]);
			int reponse=sc.nextInt();
			result[i]=reponse;
		
		}	
			
	}
	
	
	public static void GradeQuiz(){		
		for(int i=0; i<10 ;i++){
			if(result[i]==(nombre1[i]+nombre2[i])){
				System.out.println("Bonne réponse à la question"+i);
				repbonnes+=1;
			}
			else {
				System.out.println(" Réponse fausse à la question"+i+" La bonne réponse était :"+(nombre1[i]+nombre2[i]));
			}
			
		}
		
		System.out.println("Vous avez eu "+repbonnes+" bonnes réponses");
		System.out.println("Vous avez eu "+(10-repbonnes)+"mauvaises réponses");


		
	}
	
	public static void main(String[] args) {
		CreateQuiz();
		AdministerQuiz();
		GradeQuiz();

		
	}

}