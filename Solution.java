import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution {
	public static void main(String args[]) throws IOException {
		Time tObject = new Time();
		tObject = new Time(23,59,59);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n1.Next Second of the given time\n2.Next minute of the given time\n3.Next hour of the given time\n4.Previous Second of the given time\n5.Previous minute of the given time\n6.Previous hour of the given time\n7.To print the given time");
		System.out.print("\nEnter your choice:");
		int choice = Integer.parseInt(bf.readLine());
		switch(choice)
		{
			case 1:
				tObject.nextSecond();
				break;
			case 2:
				tObject.nextMinute();
				break;
			case 3:
				tObject.nextHour();
				break;
			case 4:
				tObject.previousSecond();
				break;
			case 5:
				tObject.previousMinute();
				break;
			case 6:
				tObject.previousHour();
				break;
			case 7:
				tObject.print();
				break;
		}
	}
}