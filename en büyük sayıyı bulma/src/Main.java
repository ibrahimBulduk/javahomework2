
public class Main {

	public static void main(String[] args) {
		int sayi1 = 280 ;
		int sayi2 = 55 ;
		int sayi3 = 35;
		int enBüyüksayı = sayi1 ;
		
		if (enBüyüksayı < sayi2) {
			enBüyüksayı = sayi2 ;
			if (sayi2 > sayi3){
				System.out.println("aslında : " + sayi2);
			}
		}if (enBüyüksayı < sayi3) {
			enBüyüksayı = sayi3 ;
			if (sayi3>sayi2) {
				System.out.println("normalde : "+ sayi3);
			}
				
			
		}else {
			System.out.println("gerçekte :  " + sayi1);
		} 
			
		
			
		
		
	}

}
