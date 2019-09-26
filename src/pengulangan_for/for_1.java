package pengulangan_for;

import java.util.Scanner;

public class for_1{
	
	public static void main(String[]args) {//berfungsi untuk menampilkan dan merunning program agar dapat dieksekusi oleh komputer
		
		Scanner sc = new Scanner(System.in);//Menginstansiasi dan mendeklarasikan object yaitu sc yang berguna sebagai inputan keyboard
		System.out.println("masukkan nilai start");//membentuk garis baru untuk masukkan nilai start
		int loop = sc.nextInt();//variabel loop diisi dengan inputan user
		System.out.println("masukkan nilai akhir");//membentuk garis baru untuk memasukkan nilai akhir
		int finish = sc.nextInt();//variabel finish diisi dengan inputan user
		for(; loop  <=  finish  ; loop++) {//pengulangan loop diisi satu dan loop lebih kecil dari pada finis kemudian loop di increment
			System.out.println("IF unpas"+ loop);// menampilkan ke layar berupa tulisan sebanyak looping
		}
	
}
}


