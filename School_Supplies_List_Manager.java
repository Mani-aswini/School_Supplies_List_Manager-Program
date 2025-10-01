import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		int n = sc.nextInt();
		for(int i = 0 i < n; i++) {
			al.add(sc.next());
		}
		int m = sc.nextInt();
		ArrayList remove = new ArrayList();
		for(int i = 0 ; i < m; i++) {
			remove.add(sc.next());
		}
		for (Object x: remove) {
			al.remove(x);
		}
		for(int i = 0 ; i < al.size(); i++) {
			System.out.print(al.get(i));
			if(i!= al.size()-1) {
				System.out.print(",");
			}
		}
	}
}
