package Ch4;

public class Array7 {
	//¹è¿­
	public static void main(String[] args) {
		//ÃÑ ÇÕ°ú Æò±Õ
		int sum = 0;//ÃÑÁ¡ ÀúÀå
		float average = 0f; //Æò±Õ ÀúÀå
		
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i=0; i<score.length; i++) {
			//¹Ýº¹¹®À» ÅëÇØ Á¡¼öÀÇ ÇÕÀ» ´õÇØ ÃÑÁ¡ ÀúÀå
			sum += score[i];
		}
		
		// Æò±Õ = ÃÑÁ¡/°ú¸ñ °³¼ö
		average = sum / (float)score.length;
		
		System.out.println("ÃÑÁ¡ : "+sum);
		System.out.println("Æò±Õ : "+average);
	}
}
