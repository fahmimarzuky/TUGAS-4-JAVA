import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearchSort {

	public static void main(String[] args) {
		// PREPARING data
		ArrayList<Double> data = new ArrayList<Double>();
		// data input: [15.15, 23.11, 38.25, 37.43, 62.73, 29.90, 39.93, 21.15, 72.83,
		// 57.66, 50.26]
		data.add(15.15);
		data.add(23.11);
		data.add(38.25);
		data.add(37.43);
		data.add(62.73);
		data.add(29.90);
		data.add(39.93);
		data.add(21.15);
		data.add(72.83);
		data.add(57.66);
		data.add(50.26);

		// CETAK DATA INPUT
		System.out.println("Data : " + data.toString());		

		Scanner s = new Scanner(System.in);
		System.out.print("Masukkan kunci pencarian: ");
		double key	= s.nextDouble();

		int posisi = -1;//jika setelah proses pencarian posisi tetap = -1 berarti key tidak ditemukan pada data

		//BEGIN PENCARIAN LINEAR
		for(int i=0;i<data.size();i++){
			if(key==data.get(i)){
				posisi = i;
				break;
			}
		}
		//END OF PENCARIAN LINEAR

		//TAMPILKAN HASIL PENCARIAN
		if(posisi!=-1){//Jika nilai posisi tidak sama dengan -1 berarti data ditemukan
			System.out.println("KEY: "+key+" Berada di index array list: "+posisi);
		}else{
			System.out.println("KEY TIDAK DITEMUKAN");
		}



	}

}
