import java.util.ArrayList;
//Selection sort
public class SelectionSort{

	public static void main(String[] args) {		
		//PREPARING data input
		ArrayList<Double> input 	= new ArrayList<Double>();
		//data input: [15.6,11.16,17.20,54.89,12.13,25.19,19.9,17.15,17.81,53.66,13.29]
		input.add(15.6);
		input.add(11.16);
		input.add(17.20);
		input.add(54.89);
		input.add(12.13);
		input.add(25.19);
		input.add(19.9);
		input.add(17.15);
		input.add(17.81);
		input.add(53.66);
		input.add(13.29);
		//CETAK DATA INPUT
		System.out.println("Data Input   : "+input.toString());
		
		//PANGGIL METHOD sort( )
		ArrayList<Double> output	= sort(input);
		
		//CETAK HASIL SORTING 
		System.out.println("Hasil Sorting: "+output.toString());
		
	}
	
	public static ArrayList<Double>sort(ArrayList<Double> data){
		int n	= data.size();
		for(int i=0;i<n-1;i++){			
			int min	= i;
			for(int j=1+i;j<n;j++){
				if(data.get(j)<data.get(min)){
					min = j;
				}
			}
			if(min != i){
				Double tempData = data.get(i);
				data.set(i, data.get(min));
				data.set(min, tempData);
			}
			//CETAK HASIL TIAP LANGKAH dan OPERASI SWAPnya
			System.out.println("langkah ke-"+i+", min = "+min+" SWAP("+i+","+min+")"+" -> "+data.toString());
		}
		return data;		
	}
}