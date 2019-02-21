import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Random;

public class binaryTampil {
	public static void main (String[] args) throws IOException {
			
			System.out.println("\t====Binary Search====");
			
			//objek BufferedReader
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader dataIn = new BufferedReader (isr);
			
			//input  jumlah data
			System.out.print("\nMasukan jumlah Data : ");
			int jumlah = Integer.parseInt(dataIn.readLine());
			
			//penampungan data
			int[] data = new int [jumlah];
			
			//data disi oleh program
			for (int a=0; a<jumlah; a++) {
				data[a] = new Random().nextInt(11);
				System.out.print(data[a] + "	");
				}

			//data yang dicari
			
			System.out.print("\n\nData yang dicari : ");
			int cari = Integer.parseInt(dataIn.readLine());
			
			//proses Binary Search
			long startTime = System.currentTimeMillis();
			int i = 0, ketemu = 0, index;
			while((ketemu == 0) && (i<=jumlah)) { 
				index = (int)(i + jumlah) / 2; 
				if (data[index] == cari) { 
					ketemu = 1; 
					System.out.println("Nilai "+ cari + " ditemukan pada index ke- " + index);
				} 
				else	{ 
					if (data[index] > cari) { 
						jumlah = index - 1; 
					} 
					else { 
						i = index + 1; 
					} 
				} 
			} 
			
			//data tidak ditemukan
			if (ketemu != 1) { 
            System.out.print("Nilai "+ cari + " tidak ditemukan"); 
			}
			
			long stopTime = System.currentTimeMillis();
			long elapsedTime = stopTime - startTime;
			System.out.println("\n\nUkuran waktu " + elapsedTime + " mili detik");
	}
}